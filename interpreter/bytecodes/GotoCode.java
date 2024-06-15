package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class GotoCode implements ByteCode, Jumpable, Verbose {
    private int resolvedAddress; //int as it is the line number (stack position)
    private String label;

    public GotoCode(String[] args) {
        label = args[0];
    }

    @Override
    public void execute(VirtualMachine vm) {
        vm.jump(resolvedAddress);
    }

    @Override
    public void setAddress(int address) {
        resolvedAddress = address;
    }

    @Override
    public String toString() {
        return "GOTO " + label;
    }
}
