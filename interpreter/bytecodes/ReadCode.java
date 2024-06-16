package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

import java.util.Scanner;

public class ReadCode implements ByteCode, Label {
    public ReadCode() {
        //Instantiate ReadCode but does nothing
    }

    @Override
    public void execute(VirtualMachine vm) {
        boolean isValid = false;

        while (!isValid) {
            try(Scanner input = new Scanner(System.in)) {
                System.out.print("Please enter an integer: ");
                try {
                    int value = input.nextInt();
                    isValid = true;
                    vm.push(value);
                } catch (Exception e) {
                    System.out.println("Invalid Input!");
                }
            }
        }
    }

    @Override
    public String toString() {
        return "READ";
    }
}