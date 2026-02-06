package classes;

import entities.Leitor;
import entities.Triangle;

public class FirstOopClass {
    public FirstOopClass() {
        Leitor sc = new Leitor();

        Triangle xTriangle = sc.criarTriangulo();
        Triangle yTriangle = sc.criarTriangulo();

        System.out.println("Área do Triângulo x: " + xTriangle.area());
        System.out.println("Área do Triângulo y: " + yTriangle.area());

        sc.fecharLeitor();
    }
}
