package com.bsuir.stankevich.service;

import com.bsuir.stankevich.fibo.Fibo;

public class FiboService {
    int num, n;
    Fibo fibo;
    char delimeter;

    public FiboService(int num, int n, char delimeter)
    {
        this.n = n;
        this.num = num;
        this.delimeter = delimeter;
    }

    public String fiboRow()
    {
        if (n <= 1)
            throw new IllegalArgumentException("Length of generated row must be more than 1.");
        if (num <= 0)
            throw new IllegalArgumentException("num must be more than 0.");

        int a = fibo.find(num), b = fibo.find(num + 1), c;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++)
        {
            result.append(a).append(delimeter);
            c = a;
            a = b;
            b = c + a;
        }
        return result.deleteCharAt(result.length()-1).toString();
    }

    public Fibo getFibo() {
        return fibo;
    }

    public void setFibo(Fibo fibo) {
        this.fibo = fibo;
    }

    public char getDelimeter() {
        return delimeter;
    }

    public void setDelimeter(char delimeter) {
        this.delimeter = delimeter;
    }
}
