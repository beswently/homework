package homework.exams_generation;

import lombok.RequiredArgsConstructor;

/**
 * @author Evgeny Borisov
 */
//@RequiredArgsConstructor
//public enum Operator {
//    PLUS("+"),MINUS("-"),MULTIPLY("*"), DIVIDE("/");
//
//    private final String sign;
//
//}


enum Operator {
    ADD {
        public int execute(int num1, int num2) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            return num1 + num2;
        }
    },
    SUBTRACT {
        public int execute(int num1, int num2) {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            return num1 - num2;
        }
    },
    MULTIPLY {
        public int execute(int num1, int num2) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            return num1 * num2;
        }
    },
    DIVIDE {
        public int execute(int num1, int num2) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            if (num2 != 0) {
                return num1 / num2;
            } else {
                System.out.println("Can't divide by zero.");
            }
            return 0;
        }
    };
    public abstract int execute(int x, int y);

}