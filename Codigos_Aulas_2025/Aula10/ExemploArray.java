package Aulas2025_1.Aula10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploArray {
    public static void main(String[] args) {
//        String [] array = {"melancia", "uva", "manga"};
//        List<String> frutas = Arrays.asList(array);
//        System.out.println(frutas);

        List<String> lista = new ArrayList<>();
        lista.add("Paulo");
        lista.add("David");

        String [] array = lista.toArray(new String[0]);
        System.out.println(Arrays.toString(array));

    }

}
