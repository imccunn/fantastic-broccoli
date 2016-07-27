package com.imccunn;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    if (args.length > 0) System.out.println(args[0]);

        long seed = 43234234L;
        Random rnd = new Random(seed);
        int num = 333;
        for (int i = 0; i < num; i++) {
            System.out.printf("%s : %s \n", i, rnd.nextDouble());
        }
    }
}
