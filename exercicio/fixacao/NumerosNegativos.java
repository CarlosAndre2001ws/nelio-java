package exercicio.fixacao;

import entities.Leitor;

public class NumerosNegativos {
    public void run() {
        Leitor sc = new Leitor();
        int n;

        System.out.print("Quantos números você vai digitar? ");
        n = Integer.parseInt(sc.scanner().nextLine());

        while(n > 10 || n < 0) {
            System.out.print("Valor inválido, tente novamente: ");
            n = Integer.parseInt(sc.scanner().nextLine());
        }

        int[] vet = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = Integer.parseInt(sc.scanner().nextLine());
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for(int i = 0; i < vet.length; i++) {
            if(vet[i] < 0) {
                System.out.println(vet[i]);
            }
        }
    }
}
