package exercicio.fixacao;

import entities.Leitor;
import entities.Student;

import java.util.Locale;


public class ProblemaAlturas {

    public void run() {
        Locale.setDefault(Locale.US);
        int n;
        Leitor sc = new Leitor();

        System.out.print("Quantas pessoas serão digitadas? ");
        n = Integer.parseInt(sc.scanner().nextLine());

        Student[] vet = new Student[n];

        for(int i = 0; i < n; i++) {
            String alunoNome;
            int alunoIdade;
            double alunoTam;

            System.out.println("Dados da " + String.format("%.0f", (double) i+1) + "a pessoa: ");

            System.out.print("Nome : "); alunoNome = sc.scanner().nextLine();
            System.out.print("Idade : "); alunoIdade = Integer.parseInt(sc.scanner().nextLine());
            System.out.print("Altura : "); alunoTam = Double.parseDouble(sc.scanner().nextLine());

            vet[i] = new Student(alunoNome, alunoIdade, alunoTam);

        }

        if(vet[0] != null) {
            vet[0].averageHeight(vet, n);
            vet[0].percNamesBelowSixteen(vet, n);
        }

        sc.fecharLeitor();
    }
}
