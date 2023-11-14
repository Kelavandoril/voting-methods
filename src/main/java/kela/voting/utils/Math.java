package kela.voting.utils;

public class Math {

    public static int factorial(int number) {
        if (number == 0)
            return 1;

        return number * factorial(number-1);
    }
}
