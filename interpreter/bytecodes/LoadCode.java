package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class LoadCode implements ByteCode, Verbose {
    private int offSet;
    private String id;

    public LoadCode(String[] args) {
        offSet = Integer.parseInt(args[0]);

        if (args.length > 1) {
            id = args[1];
        }
    }

    @Override
    public void execute(VirtualMachine vm) {
        vm.load(offSet);
    }

    @Override
    public String toString() {
        String base = "LOAD " + offSet;
        if (id != null) {
            base += " " + id + "\t<load " + id + ">";
        }
        return base;
    }
}
