package interpreter.virtualmachine;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

class RunTimeStack {

    private List<Integer> runTimeStack;
    private Stack<Integer> framePointer;

    public RunTimeStack() {
        runTimeStack = new ArrayList<>();
        framePointer = new Stack<>();
        // Add initial frame pointer value, main is the entry
        // point of our language, so its frame pointer is 0.
        framePointer.add(0);
    }

    /**
     * Used for displaying the current state of the runTimeStack .
     * It will print portions of the stack based on respective
     * frame markers .
     * Example [1 ,2 ,3] [4 ,5 ,6] [7 ,8]
     * Frame pointers would be 0 ,3 ,6
     */
    public String verboseDisplay() {
        StringBuilder result = new StringBuilder();
        int numOfFrames = framePointer.size();

        for (int i = 0; i < numOfFrames; i++) {
            int start = framePointer.get(i);
            //Calculate end index of the frame. Accounts for n+1.
            int end = (i + 1 < numOfFrames) ? framePointer.get(i + 1) : runTimeStack.size();

            //Create string for seperated frames
            result.append("[");
            for (int j = start; j < end; j++) {
                result.append(runTimeStack.get(j));
                if (j < end - 1) {
                    result.append(", ");
                }
            }
            result.append("]");

            //Add space between frames
            if (i < numOfFrames - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    /**
     * returns the top of the runtime stack, but does not remove
     * @return copy of the top of the stack .
     */
    public int peek() {
        if (runTimeStack.isEmpty()) {
            throw new EmptyStackException();
        }
        return runTimeStack.getLast();
    }

    /**
     * removes to the top of the runtime stack.
     * @return the value popped.
     */
    public int push(int value) {
        runTimeStack.add(value);
        return value;
    }

    /**
     * removes to the top of the runtime stack.
     * @return the value popped.
     */
    public int pop() {
        if (runTimeStack.isEmpty()) {
            throw new EmptyStackException();
        }
        return runTimeStack.removeLast();
    }

    /**
     * Takes the top item of the run time stack, and stores
     * it into an offset starting from the current frame .
     * @param offsetInFrame number of slots above current frame marker
     * @return the item just stored
     */
    public int store(int offsetInFrame) {
        if (runTimeStack.isEmpty() || framePointer.isEmpty()) {
            throw new EmptyStackException();
        }

        int value = this.pop();
        runTimeStack.set(framePointer.peek() + offsetInFrame, value);
        return value;
    }

    /**
     * Takes a value from the run time stack that is at offset
     * from the current frame marker and pushes it onto the top of the stack .
     * @param offsetInFrame number of slots above current frame marker
     * @return item just loaded into the offset
     */
    public int load(int offsetInFrame) {
        if (framePointer.isEmpty() || framePointer.peek() + offsetInFrame >= runTimeStack.size()) {
            throw new IndexOutOfBoundsException("Invalid offset in frame.");
        }
        return this.push(runTimeStack.get(offsetInFrame + framePointer.peek()));
    }

    /**
     * create a new frame pointer at the index offset slots down
     * from the top of the runtime stack.
     * @param offsetFromTopOfRunStack slots down from the top ot the runtime stack
     */
    public void newFrameAt(int offsetFromTopOfRunStack) {
        if (offsetFromTopOfRunStack > runTimeStack.size()) {
            throw new IndexOutOfBoundsException("Offset is greater than the size of the runtime stack.");
        }
        framePointer.push(runTimeStack.size() - offsetFromTopOfRunStack);
    }

    /**
     * pop the current frame off the runtime stack . Also removes
     * the frame pointer value from the FramePointer Stack .
     */
    public void popFrame() {
        if (framePointer.isEmpty()) {
            throw new EmptyStackException();
        }

        int frameStart = framePointer.pop();
        while (runTimeStack.size() > frameStart) {
            this.pop();
        }
    }

    /**
     * Get the current frame size for pop
     * @return the current frame size
     */
    public int getCurrentFrameSize() {
        return runTimeStack.size() - framePointer.peek();
    }

    /**
     * Get the current frame pointer. Enforce encapsulation for vm.
     * @return the current frame pointer.
     */
    public int framePeek() {
        return framePointer.peek();
    }

    /**
     * Get the size of runTimeStack. Enforce encapsulation for vm.
     * @return the runTimeStack size.
     */
    public int rtsSize() {
        return runTimeStack.size();
    }

//    public static void main(String[] args) {
//        RunTimeStack rts = new RunTimeStack();
//        rts.push(1); rts.push(2); rts.push(3);
//        rts.push(4); rts.push(5); rts.push(6); rts.newFrameAt(3);
//        rts.push(7); rts.push(8); rts.newFrameAt(2);
//
//        rts.popFrame();
//        System.out.println(rts.verboseDisplay());
//        System.out.println(rts.getCurrentFrameSize());
//    }
}
