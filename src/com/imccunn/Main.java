package com.imccunn;

import java.awt.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    if (args.length > 0) System.out.println(args[0]);

        long seed = 43234234L;
        Random rnd = new Random(seed);
        int num = 20;
        double[] col = new double[num];
        double[] scaledCol = new double[num];
        double scale = 2.0;

        for (int i = 0; i < num; i++) {
            double curDouble = rnd.nextDouble();
            col[i] = curDouble;
            scaledCol[i] = col[i] * scale;
            System.out.printf("%s : %s : %s\n", i, col[i], scaledCol[i]);
        }

    }
}
