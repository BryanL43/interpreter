package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class PopCode implements ByteCode, Verbose {
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
        String base = "POP " + numOfPop;
        if (executedPop != null){
            base += " " + numOfPop;
        }
        return base;
    }
}
