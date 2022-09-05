package ru.netology.sqr;

public class MathService {

    public int calculateSqrtCeil(int number) {
        for (int i = 1; i <= number; i++) {
            if (i * i >= number) {
                return i;
            }
        }
        return 1;
    }
}
