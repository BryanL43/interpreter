package interpreter.loaders;

import interpreter.bytecodes.ByteCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public final class ByteCodeLoader {
    private String codSourceFileName;
    
    /**
     * Constructs ByteCodeLoader object given a COD source code
     * file name
     * @param fileName name of .cod File to load.
     */
    public ByteCodeLoader(String fileName){
        this.codSourceFileName = fileName;
    }
    
    /**
     * Loads a program from a .cod file.
     * @return a constructed Program Object.
     * @throws InvalidProgramException thrown when 
     * loadCodes fails.
     */
    public Program loadCodes() throws InvalidProgramException {
        File myFile = new File(codSourceFileName);
        Program program = new Program();

        try (Scanner myReader = new Scanner(myFile)) {
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] parts = line.split("\\s+");

                String byteCodeName = CodeTable.getClassName(parts[0]);
                String[] args = new String[parts.length - 1];
                System.arraycopy(parts, 1, args, 0, args.length);

                ByteCode BC = ByteCode.getInstance(byteCodeName, args);
                program.addCode(BC);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found: " + codSourceFileName, e);
        }

        return program;
    }
}
