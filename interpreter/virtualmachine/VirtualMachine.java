package interpreter.virtualmachine;

import java.util.Stack;

import interpreter.bytecodes.ByteCode;
import interpreter.loaders.Program;

public class VirtualMachine {

    private RunTimeStack runTimeStack;
    private Stack<Integer> returnAddress;
    private Program program;
    private int programCounter;
    private boolean isRunning;
    private boolean verboseEnabled;

    public VirtualMachine(Program program) {
        this.program = program;
        this.runTimeStack = new RunTimeStack();
        this.returnAddress = new Stack<>();
        this.programCounter = 0;
    }

    public void executeProgram() {
        isRunning = true;

        while (isRunning) {
            ByteCode code = program.getCode(programCounter);
            code.execute(this);
            programCounter++;
        }
    }

    //Stops the .cod program from executing
    public void stopRunning() {
        isRunning = false;
    }

    /**
     * Removes a number of elements from Runtime stack.
     * @param numOfPop number of elements to remove from Runtime stack.
     */
    public int pop(int numOfPop) {
        int amountToPop = numOfPop;
        int poppedValue = 0;

        if (numOfPop > runTimeStack.getCurrentFrameSize()) {
            amountToPop = runTimeStack.getCurrentFrameSize();
        }

        for (int i = 0; i < amountToPop; i++) {
            poppedValue = runTimeStack.pop();
        }

        return poppedValue;
    }

    /**
     * Jumps to a location in the .cod program stack.
     * @param jumpAddress the location to jump to. In other words, the line number (stack position).
     */
    public void jump(int jumpAddress) {
        programCounter = jumpAddress; //maybe fix the (stack position) comment.
    }

    /**
     * Open store function access to StoreCode.
     * @param offSet the offset from the beginning of the frame.
     */
    public int store(int offSet) {
        int storedValue = 0;
        if (runTimeStack.framePeek() != runTimeStack.rtsSize()) {
            storedValue = runTimeStack.store(offSet);
        }
        return storedValue;
    }

    /**
     * Open load function access to StoreCode.
     * @param offSet the offset from the beginning of the frame.
     */
    public void load(int offSet) {
        runTimeStack.load(offSet);
    }

    /**
     * Push a value to runTimeStack.
     * @param value to be pushed to the stack.
     */
    public void push(int value) {
        runTimeStack.push(value);
    }

    /**
     * Entry point for ArgsCode to access runTimeStack's newFrameAt.
     * @param offSetFromTop the offset down from the top of the stack.
     */
    public void newFrameAt(int offSetFromTop) {
        runTimeStack.newFrameAt(offSetFromTop);
    }

    /**
     * Prompts vm to push current programCounter (can be viewed as the code line)
     * into the returnAddress stack.
     */
    public void addReturnAddress() {
        returnAddress.push(programCounter);
    }

    /**
     * Allow ByteCode access to runTimeStack peek.
     * @return the top of the runtime stack.
     */
    public int peek() {
        return runTimeStack.peek();
    }

    /**
     * Allow ByteCode access to runTimeStack popFrame function.
     */
    public void popFrame() {
        runTimeStack.popFrame();
    }

    /**
     * Returns the program back to the stored return address.
     */
    public void returnToOriginalAddress() {
        programCounter = returnAddress.pop();
    }

    /**
     * Toggles verbose mode.
     * @param mode determines if verbose is enabled or not.
     */
    public void toggleVerbose(String mode) {
        if (mode.equals("ON")) {
            verboseEnabled = true;
        }
        if (mode.equals("OFF")) {
            verboseEnabled = false;
        }
    }

    /**
     * Parse the code's line and seperates the label
     * from the Bytecode.
     * @param byteCode the ByteCode string (the line of code).
     * @return the seperated label.
     */
    public String getLabel(String byteCode) {
        String[] parseByteCode = byteCode.split("\\s+");

        if (parseByteCode.length > 1) {
            return parseByteCode[1];
        }
        return null;
    }

    public String getFrameValues() {
        String[] frames = runTimeStack.verboseDisplay().split("[\\[\\]]");
        return frames[frames.length - 1];
    }
}
