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
            case "HALT" -> new HaltCode();
            case "POP" -> new PopCode(args);
            case "FALSEBRANCH" -> new FalseBranchCode(args);
            case "GOTO" -> new GotoCode(args);
            case "STORE" -> new StoreCode(args);
            case "LOAD" -> new LoadCode(args);
            case "LIT" -> new LitCode(args);
            case "ARGS" -> new ArgsCode(args);
            case "CALL" -> new CallCode(args);
            case "RETURN" -> new ReturnCode(args);
            case "BOP" -> new BopCode(args);
            case "READ" -> new ReadCode();
            case "WRITE" -> new WriteCode();
            case "LABEL" -> new LabelCode(args);
            case "VERBOSE" -> new VerboseCode(args);
            default -> throw new IllegalArgumentException("Unexpected ByteCode type: " + type);
        };
    }
}
