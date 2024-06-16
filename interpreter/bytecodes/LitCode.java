package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class LitCode implements ByteCode {
    private int value;
    private String id; //The variable name

    public LitCode(String[] args) {
        value = Integer.parseInt(args[0]);

        if (args.length > 1) {
            id = args[1];
        }
    }

    @Override
    public void execute(VirtualMachine vm) {
        vm.push(value);
    }

    @Override
    public String toString() {
        String base = "LIT " + value;
        if (id != null) {
            base += " " + id + "\tint " + id;
        }
        return base;
    }
}