package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class LabelCode implements ByteCode, Label {
    private String label;

    public LabelCode(String[] args) {
        label = args[0];
    }

    @Override
    public void execute(VirtualMachine vm) {
        //Does nothing but satisfy abstraction
    }

    @Override
    public String toString() {
        return "LABEL " + label;
    }
}
