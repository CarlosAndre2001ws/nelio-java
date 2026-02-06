package entities;

import java.util.Objects;
import java.util.Scanner;

public class BankAccount {
    private long numeroConta;
    private String nome;
    private double saldo;

    public BankAccount() {

    }

    public double getTAX() { return 5.00; }

    public void criarConta(Scanner sc) {
        System.out.print("Enter account number: "); this.numeroConta = Integer.parseInt(sc.nextLine());
        System.out.print("Enter account holder: "); this.nome = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? "); String x = sc.nextLine();

        while(true) {

            if(Objects.equals(x.toLowerCase(), "y")) {
                System.out.print("Enter initial deposit value: "); this.saldo += sc.nextDouble();
                break;

            } else if(Objects.equals(x.toLowerCase(), "n")) {

                break;

            } else {
                System.out.print("Invalid input, try again. (y/n)? "); x = sc.nextLine();
            }

        }
    }

    public void changeName(Scanner sc) {
        sc.nextLine();
        this.nome = sc.nextLine();
        this.info();
    }

    public void info() {
        System.out.println("Updated account data: ");
        this.info(null);
    }

    public void info(String action) {
        if(Objects.equals(action, "new")) {
            System.out.println();
            System.out.println("Account data: ");
        }
        System.out.println("Account " + this.numeroConta + ", Holder: " + this.nome + ", Balance: $ "
                + String.format("%.2f", this.saldo));
        System.out.println();
    }

    public void deposito(Scanner sc) {
        System.out.print("Enter a deposit value: " ); this.saldo += sc.nextDouble();
        this.info();
    }

    public void saque(Scanner sc) {
        System.out.print("Enter a withdraw value: " ); this.saldo -= sc.nextDouble() + this.getTAX();
        this.info();
    }
}
