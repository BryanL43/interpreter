package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class StoreCode implements ByteCode {
    private int offSet;
    private String id;
    private String storedValue;

    public StoreCode(String[] args) {
        offSet = Integer.parseInt(args[0]);

        if (args.length > 1) {
            id = args[1];
        }
    }

    @Override
    public void execute(VirtualMachine vm) {
        storedValue = Integer.toString(vm.store(offSet));
    }

    @Override
    public String toString() {
        String base = "STORE " + offSet;
        if (id != null) {
            base += " " + id + "\t" + id + "=" + storedValue;
        }
        return base;
    }
}
