package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {

    public void run() {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        list.remove("Anna");

        list.remove(1);


        for (String nome : list) {
            System.out.println(nome);
        }

        list.removeIf(nome -> nome.charAt(0) == 'M');
        System.out.println("-----------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("index of Marco: " + list.indexOf("Marco"));
        System.out.println("-----------------------------");
        List<String> result = list.stream().filter(nome -> nome.charAt(0) == 'B').collect(Collectors.toList());
        for (String x: result) {
            System.out.println(x);
        }
        System.out.println("------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
        System.out.println("------------------------------");

    }
}
