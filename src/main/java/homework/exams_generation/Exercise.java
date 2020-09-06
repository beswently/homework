package homework.exams_generation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Evgeny Borisov
 */
//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
public abstract class Exercise {
    public int a;
    public int b;
    public int answer;
    private Operator operator;

}
