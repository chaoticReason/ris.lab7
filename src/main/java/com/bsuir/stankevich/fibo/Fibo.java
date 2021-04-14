package com.bsuir.stankevich.fibo;

import static java.lang.Math.*;

public class Fibo {
    final double SQRT5 = sqrt(5);
    final double PHI = (SQRT5 + 1) / 2;

    public int find(int num)
    {
        if (num <= 0)
        {
            throw new IllegalArgumentException("num must be more than 0.");
        }
        return (int) (pow(PHI, num) / SQRT5 + 0.5);
    }
}
