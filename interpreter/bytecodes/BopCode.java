package interpreter.bytecodes;

import interpreter.virtualmachine.VirtualMachine;

public class BopCode implements ByteCode {
    private String operator;

    public BopCode(String[] args) {
        this.operator = args[0];
    }

    @Override
    public void execute(VirtualMachine vm) {
        int firstOperand = vm.pop(1);
        int secondOperand = vm.pop(1);

        switch(operator) {
            case "+" -> vm.push(firstOperand + secondOperand);
            case "-" -> vm.push(firstOperand - secondOperand);
            case "/" -> vm.push(firstOperand / secondOperand);
            case "*" -> vm.push(firstOperand * secondOperand);
            case "==" -> vm.push(firstOperand == secondOperand ? 1 : 0);
            case "!=" -> vm.push(firstOperand != secondOperand ? 1 : 0);
            case "<=" -> vm.push(firstOperand <= secondOperand ? 1 : 0);
            case ">=" -> vm.push(firstOperand >= secondOperand ? 1 : 0);
            case "<" -> vm.push(firstOperand < secondOperand ? 1 : 0);
            case ">" -> vm.push(firstOperand > secondOperand ? 1 : 0);
            case "&" -> vm.push((firstOperand == 1) && (secondOperand == 1) ? 1 : 0);
            case "|" -> vm.push((firstOperand == 1) || (secondOperand == 1) ? 1 : 0);
            default -> throw new UnsupportedOperationException("Unsupported operator.");
        }
    }

    @Override
    public String toString() {
        return "BOP " + operator;
    }
}
