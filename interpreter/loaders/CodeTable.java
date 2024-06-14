/**
 * Code table of byte codes in language X
 * @key name of a specific byte code
 * @value name of the class that the key belongs to.
 */
package interpreter.loaders;

import java.util.Map;
import java.util.HashMap;

public final class CodeTable {
   private static final Map<String, String> ByteCodes = new HashMap<>();

   private CodeTable() {
      // do nothing
   }

   /**
    * fill code table with class name mappings
    */
   public static void init() {
      ByteCodes.put("HALT", "HaltCode");
      ByteCodes.put("POP", "PopCode");
      ByteCodes.put("FALSEBRANCH", "FalseBranchCode");
      ByteCodes.put("GOTO", "GotoCode");
      ByteCodes.put("STORE", "StoreCode");
      ByteCodes.put("LOAD", "LoadCode");
      ByteCodes.put("LIT", "LitCode");
      ByteCodes.put("ARGS", "ArgsCode");
      ByteCodes.put("CALL", "CallCode");
      ByteCodes.put("RETURN", "ReturnCode");
      ByteCodes.put("BOP", "BopCode");
      ByteCodes.put("READ", "ReadCode");
      ByteCodes.put("WRITE", "WriteCode");
      ByteCodes.put("LABEL", "LabelCode");
      ByteCodes.put("VERBOSE", "VerboseCode");
   }

   /**
    * Returns the ByteCode class name for a given token.
    * 
    * @param token bytecode to map. For example, HALT --> HaltCode
    * @return class name of bytecode
    */
   public static String getClassName(String token) {
      return ByteCodes.get(token);
   }

}
