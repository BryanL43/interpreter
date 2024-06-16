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
        if (vm.peek() == 0){ //If 0 jumps to label aka if-statement is true.
            vm.pop(1);
            vm.jump(resolvedAddress);
        } else { //If not 0 then continue to next operation aka if-statement is false.
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
