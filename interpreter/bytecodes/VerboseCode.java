package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class VerboseCode implements ByteCode {
    private String enabled;

    public VerboseCode(String[] args) {
        enabled = args[0];
    }

    @Override
    public void execute(VirtualMachine vm) {
        vm.toggleVerbose(enabled);
    }

    @Override
    public String toString() {
        return "VERBOSE " + enabled;
    }
}