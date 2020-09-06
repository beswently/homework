package homework.exams_generation;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Evgeny Borisov
 */
public class Examinator {
    public static List<ExerciseGeneration> generate(int amount) {
        ArrayList<ExerciseGeneration> exerciseList = new ArrayList<ExerciseGeneration>();

        for(int i = 0; i < amount; i++){
            ExerciseGeneration exerciseGeneration = new ExerciseGeneration();
            exerciseGeneration.run();
            exerciseList.add(exerciseGeneration);
        }

        return null;
        //todo finish this
    }

    public static void talk(){
        System.out.println("Enter 'yes' if you want to generate us exercize otherwise 'no': ");
        Scanner input = new Scanner(System.in);
        String stringInput = input.nextLine();
        //stringInput.toUpperCase();
        if(stringInput.equals("yes")){
            System.out.println("Enter how many exercise you want us to generate : ");
            Scanner amount = new Scanner(System.in);
            List<ExerciseGeneration> list = generate(amount.nextInt());
        }
        else{
            ExerciseInput exerciseInput = new ExerciseInput();
            exerciseInput.run();
        }
    }
    public static void main(String[] args) {

        talk();

    }
}
