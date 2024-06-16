package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class ArgsCode implements ByteCode {
    private int offSetFromTop;

    public ArgsCode(String[] args) {
        offSetFromTop = Integer.parseInt(args[0]);
    }

    @Override
    public void execute(VirtualMachine vm) {
        vm.newFrameAt(offSetFromTop);
    }

    @Override
    public String toString() {
        return "ARGS " + offSetFromTop;
    }
}