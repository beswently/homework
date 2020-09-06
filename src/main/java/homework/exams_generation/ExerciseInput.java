package homework.exams_generation;

import java.util.Random;
import java.util.Scanner;

public class ExerciseInput {
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getAnswer() {
        return answer;
    }

    private int a;
    private int b;
    private int answer;
    private Operator operator;

    public ExerciseInput(){

    }
    public static void main(String[] args){

    }
    public Operator inputOperator(){
        String operation;
        Scanner op = new Scanner(System.in);

        System.out.println("Please enter operation(options: ADD, SUBTRACT, MULTIPLY, DIVIDE) ");
        System.out.println("CASE SENSETIVE!!!: ");
        Scanner str = new Scanner(System.in);
        String stringOperator = str.nextLine();
        //stringOperator.toUpperCase();

        if(stringOperator.equals("ADD")){
            //System.out.println("add");
            return operator = Operator.ADD;
        }
        if(stringOperator.equals("SUBTRACT")){
            //System.out.println("subtract");
            return operator = Operator.SUBTRACT;
        }
        if(stringOperator.equals("MULTIPLY")){
            //System.out.println("multiply");
            return operator = Operator.MULTIPLY;
        }
        if(stringOperator.equals("DIVIDE")){
            //System.out.println("divide");
            return operator = Operator.DIVIDE;
        }
        return operator = Operator.MULTIPLY; //default - will never happen
    }
    public int inputNumber(){
        System.out.println("Enter number: ");
        Scanner num1 = new Scanner(System.in);
        int n1 = num1.nextInt();
        return n1;
    }
    public void run(){
        a = inputNumber();
        b = inputNumber();
        Operator operator = inputOperator();
        answer = operator.execute(a, b);
        System.out.println("a = " + a + " b = " + b + " answer = " + answer );

    }

}
