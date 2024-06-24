package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class PopCode implements ByteCode {
    private int numOfPop;
    private String executedPop;

    public PopCode(String[] args) {
        numOfPop = Integer.parseInt(args[0]);
    }

    @Override
    public void execute(VirtualMachine vm) {
        executedPop = Integer.toString(vm.pop(numOfPop));
    }

    @Override
    public String toString() {
        return "POP " + numOfPop;
    }
}
