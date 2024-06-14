package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class FalseBranchCode implements ByteCode, Jumpable {
    private String label;
    private int resolvedAddress; //int as it is the line number (stack position)

    public FalseBranchCode(String[] args) {
        label = args[0];
    }

    @Override
    public void execute(VirtualMachine vm) {
        //vm.pop takes arg to execute number of times of pop
        if (vm.pop(1) == 0) {
            vm.jump(resolvedAddress);
        }
    }

    @Override
    public void setAddress(int address) {
        resolvedAddress = address;
    }

    @Override
    public String toString() {
        return "FALSEBRANCH " + label;
    }
}
