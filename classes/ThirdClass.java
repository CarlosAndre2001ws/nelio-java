package classes;

import entities.BankAccount;
import entities.Leitor;

public class ThirdClass {

    public void run() {
        Leitor sc = new Leitor();

        BankAccount newUser = new BankAccount();

        newUser.criarConta(sc.scanner());

        newUser.info("new");

        newUser.deposito(sc.scanner());

        newUser.saque(sc.scanner());

        System.out.print("Select a new name: "); newUser.changeName(sc.scanner());

        sc.fecharLeitor();
    }
}
