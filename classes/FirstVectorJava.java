package classes;

import java.util.Locale;
import java.util.Scanner;

public class FirstVectorJava {

    public void run() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        double avg = 0;
        double[] vect = new double[n];

        for(int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
            sc.nextLine();
        }

        for(int i = 0; i < n; i++) {
            avg += vect[i];
        }

        System.out.println("AVERAGE HEIGHT = " + String.format("%.2f", avg/n));

        sc.close();
    }
}
