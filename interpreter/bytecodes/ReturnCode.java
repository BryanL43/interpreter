package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class ReturnCode implements ByteCode, Jumpable, Verbose {
    private int resolvedAddress;
    private String id;
    private String value;

    public ReturnCode(String[] args) {
        if (args.length > 0) {
            id = args[0];
        }
    }

    @Override
    public void execute(VirtualMachine vm) {
        int returnValue = vm.peek();
        vm.popFrame();
        vm.push(returnValue);
        vm.returnToOriginalAddress();
        value = Integer.toString(vm.peek()); //For Verbose display
    }

    @Override
    public void setAddress(int address) {
        resolvedAddress = address;
    }

    @Override
    public String toString() {
        String base = "RETURN ";
        if (id != null) {
            base += id + "\t" + "EXIT " + id.split("<<|>>")[0] + " : " + value;
        }
        return base;
    }
}