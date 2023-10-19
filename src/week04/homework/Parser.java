package week04.homework;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws Exception {

        if(!Pattern.matches(NUMBER_REG,firstInput)){
            throw new BadInputException("정수값");
        }

       this.calculator.setFirstNumber(Integer.parseInt(firstInput));

        return this;
        // 구현 1.
    }

    public Parser parseSecondNum(String secondInput) throws Exception{

        if(!Pattern.matches(NUMBER_REG,secondInput)){
            throw new BadInputException("정수값");
        }

        this.calculator.setSecondNumber(Integer.parseInt(secondInput));

        return this;
    }

    public Parser parseOperator(String operationInput) throws Exception{
        // 구현 1.
        if(!Pattern.matches(OPERATION_REG,operationInput)){
            throw new BadInputException("사칙연산자");
        }

        switch (operationInput){
            case "+":
                this.calculator.setOperation(new AddOperation());
                break;
            case "-":
                this.calculator.setOperation(new SubstractOperation());
                break;
            case"*":
                this.calculator.setOperation(new MultiplyOperation());
                break;
            case "/":
                this.calculator.setOperation(new DivideOperation());
                break;
        }

        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}