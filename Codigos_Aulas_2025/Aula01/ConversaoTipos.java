package Aulas2025_1.Aula01;

public class ConversaoTipos {
    public static void main(String[] args) {
        double a = 1; // conversao implicita
        System.out.println(a);

        int b = (int) a; // conversao explicita (cast)
        System.out.println(b);

        // numero para string

        Integer n = 1000;
        System.out.println(n.toString());
        System.out.println(n.toString().length()); // o toString() funciona para os outros tipos também

        // numero para string 2

        int c = 10;
        System.out.println(Integer.toString(c));

        //String para número
        String  d = "10";
        System.out.println(Integer.parseInt(d));
        System.out.println(Double.parseDouble(d));

    }
}
