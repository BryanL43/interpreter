package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public interface ByteCode {
    void execute(VirtualMachine vm);

    /**
     * Static to be access without creating a ByteCode object (non-specified one).
     * @param type the specific type of ByteCode, i.e., HaltCode.
     * @param args the arguments passed through the ByteCode.
     * @return an instantiated object of the specific type of ByteCode.
     */
    static ByteCode getInstance(String type, String[] args) {
        return switch(type) {
            case "HaltCode" -> new HaltCode();
            case "PopCode" -> new PopCode(args);
            case "FalseBranchCode" -> new FalseBranchCode(args);
            case "GotoCode" -> new GotoCode(args);
            case "StoreCode" -> new StoreCode(args);
            case "LoadCode" -> new LoadCode(args);
            case "LitCode" -> new LitCode(args);
            case "ArgsCode" -> new ArgsCode(args);
            case "CallCode" -> new CallCode(args);
            case "ReturnCode" -> new ReturnCode(args);
            case "BopCode" -> new BopCode(args);
            case "ReadCode" -> new ReadCode();
            case "WriteCode" -> new WriteCode();
            case "LabelCode" -> new LabelCode(args);
            case "VerboseCode" -> new VerboseCode(args);
            default -> throw new IllegalArgumentException("Unexpected ByteCode type: " + type);
        };
    }
}
