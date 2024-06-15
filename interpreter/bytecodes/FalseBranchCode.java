package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class FalseBranchCode implements ByteCode, Jumpable, Verbose {
    private String label;
    private int resolvedAddress; //int as it is the line number (stack position)

    public FalseBranchCode(String[] args) {
        label = args[0];
    }

    @Override
    public void execute(VirtualMachine vm) {
        if(vm.peek() == 0){
            vm.pop(1);
            vm.jump(resolvedAddress);
        } else {
            vm.pop(1);
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
