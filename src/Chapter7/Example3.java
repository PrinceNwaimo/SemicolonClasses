package Chapter7;

import java.util.Arrays;

public class Example3 {
    public static void main(String... args) {
        System.out.println("Content of args --> "+ Arrays.toString(args));
        int[]numbers = new int [Integer.parseInt(args[0])];
        numbers[0]= Integer.parseInt(args[1]);
        numbers[1]= Integer.parseInt(args[2]);
        numbers[2]= Integer.parseInt(args[3]);
        numbers[3]= Integer.parseInt(args[4]);
        numbers[4]= Integer.parseInt(args[5]);

    }
}
