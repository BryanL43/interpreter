package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class CallCode implements ByteCode, Jumpable, Verbose {
    private String id;
    private int resolvedAddress;
    private String args;

    public CallCode(String[] args) {
        id = args[0];
    }

    //IMPORTANT: Saves return address and jumps to the function's location
    @Override
    public void execute(VirtualMachine vm) {
        vm.addReturnAddress();
        vm.jump(resolvedAddress);
        args = vm.getFrameValues();
    }

    @Override
    public void setAddress(int address) {
        resolvedAddress = address;
    }

    @Override
    public String toString() {
        String base = "CALL " + id + "\t" + id.split("<<|>>")[0] + "(";
        if (args != null) {
            base += args;
        }
        base += ")";
        return base;
    }
}
