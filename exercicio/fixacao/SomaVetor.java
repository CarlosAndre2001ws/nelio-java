package exercicio.fixacao;

import entities.Leitor;

public class SomaVetor {
    public void run() {
        int n;
        double total = 0;

        Leitor sc = new Leitor();

        System.out.print("Quantos numeros voce vai digitar? ");
        n = Integer.parseInt(sc.scanner().nextLine());

        double[] vet = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = Double.parseDouble(sc.scanner().nextLine());
            total += vet[i];
        }


        System.out.print("VALORES = ");

        for(int i = 0; i < n; i++) {
            System.out.print(vet[i] + " ");
        }

        System.out.println();

        System.out.println("SOMA = " + total);
        System.out.println("MEDIA = " + total/n);

    }
}
