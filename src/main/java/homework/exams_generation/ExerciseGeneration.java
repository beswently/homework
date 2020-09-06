package homework.exams_generation;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Executor;

public class ExerciseGeneration extends Exercise {
    private int a;
    private int b;
    private int answer;
    private Operator operator;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getAnswer() {
        return answer;
    }

    public void run(){
        a = generateIntNumber();
        b = generateIntNumber();
        operator = generateOperator();
        answer = operator.execute(a, b);
    }

    public int generateIntNumber(){
        Random rand = new Random();
        int upperbound = 100;
        int int_random = rand.nextInt(upperbound);
        return int_random;
    }
    public Operator generateOperator(){
        Random rand = new Random();
        int upperbound = 4;
        int int_random = rand.nextInt(upperbound);
        if (int_random == 0){
        //    System.out.println("ADD");
            return operator.ADD;
        }if (int_random == 1){
        //    System.out.println("SUBTRACT");
            return operator.SUBTRACT;
        }if (int_random == 2){
        //    System.out.println("MULTIPLY");
            return operator.MULTIPLY;
        }if (int_random == 3){
        //    System.out.println("DIVIDE");
            return operator.DIVIDE;
        }
        //System.out.println("ADD"); // default - will never happen
        return operator.ADD;
    }

    @Override
    public String toString() {
        System.out.println(a + " " + operator + " " + b + " = " + answer);
        //System.out.println("a = " + a + "  b = " + b + " answer = " + answer);
        return super.toString();
    }
}
