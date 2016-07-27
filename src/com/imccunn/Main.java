package com.imccunn;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    if (args.length > 0) System.out.println(args[0]);

        Long seed = 43234234L;
        Random rnd = new Random(seed);
        Integer num = 33;
        for (Integer i = 0; i < num; i++) {
            System.out.println(rnd.nextDouble());
        }
    }
}
