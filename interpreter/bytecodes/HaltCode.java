package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class HaltCode implements ByteCode {
    public HaltCode() {
        //Instantiate HaltCode but does nothing
    }

    @Override
    public void execute(VirtualMachine vm) {
        vm.stopRunning();
    }
}
