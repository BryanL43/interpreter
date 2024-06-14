package interpreter.loaders;

import interpreter.bytecodes.ByteCode;
import interpreter.bytecodes.Jumpable;
import interpreter.bytecodes.*; //remove later
import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Program {

    private List<ByteCode> program;

    /**
     * Instantiates a program object using an
     * ArrayList
     */
    public Program() {
        this.program = new ArrayList<>();
    }

    /**
     * Gets the size of the current program.
     * @return size of program
     */
    public int getSize() {
        return program.size();
    }

    /**
     * Grabs an instance of a bytecode at an index.
     * @param programCounter index of bytecode to get.
     * @return a bytecode.
     */
    public ByteCode getCode(int programCounter) {
        return program.get(programCounter);
    }

    /**
     * Adds a bytecode instance to the Program List.
     * @param c bytecode to be added
     */
    public void addCode(ByteCode c) {
        program.add(c);
    }

    /**
     * Makes multiple passes through the program ArrayList
     * resolving address for Goto,Call and FalseBranch
     * bytecodes. These bytecodes can only jump to Label
     * codes that have a matching label value.
     * HINT: make note of what type of data-structure
     * ByteCodes are stored in.
     * **** METHOD SIGNATURE CANNOT BE CHANGED *****
     */
    public void resolveAddress() {
        HashMap<String, Integer> labelAddress = new HashMap<>();
        VirtualMachine vm = new VirtualMachine(this);

        int index = 0;
        for (ByteCode c : program) {
            //if (c instanceof ReturnCode) {
                //c.execute(vm);
                System.out.println(c);
            //}
            //System.out.println("In resolveAdd: " + c.toString());
//            if (c instanceof Jumpable) {
//                String label = vm.getLabel(c.toString());
//            }
        }
    }
}   