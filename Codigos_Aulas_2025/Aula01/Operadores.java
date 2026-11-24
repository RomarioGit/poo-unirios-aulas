package Aulas2025_1.Aula01;

public class Operadores {
    public static void main(String[] args) {
        // Aritméticos

//        var x = 2.5;
//        double y = 7.23;
//
//        System.out.println(x+y);
//        System.out.println(x-y);
//        System.out.println(x*y);
//        System.out.println(x/y);
//
//        int a = 8;
//        double b = 2;
//
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        //System.out.println(a / (int) b);
//
//        System.out.println(a%b);
//        System.out.println(x+y - a*b);
//
//        // Operadores lógicos
//        boolean c1 = true;
//        boolean c2 = 3 > 7;
//
//        System.out.println( c1 && c2);
//        System.out.println(c1 || c2);
//        System.out.println(c1 ^ c2);
//        System.out.println(!c1);
//        System.out.println(!c2);

        // Operadores relacionais
        int z = 97;
        int w = z;
        int k = 98;
//
//        System.out.println(z == w);
//        System.out.println(z > k);
//        System.out.println(z <= k);
//        System.out.println(w >= z);
//        System.out.println(w);
//        System.out.println(w != z);

        // Operadores de Atribuição

        int m = 1;
        int n = 3;
        int p = m+n;
        System.out.println(p);
        p+= m;
        System.out.println(p);
        p-=n;
        System.out.println(p);
        p*=n;
        System.out.println(p);
        p/=n;
        System.out.println(p);
        p%=2;
        System.out.println(p);

        m++;
        n--;
        System.out.println(m);
        System.out.println(n);

        int r = 10;
        int s = ++r; //r = 11, s = 11
        System.out.println(r);
        System.out.println(s);

        r = 10;
        s = r++; //r = 11, s = 10
        System.out.println(r);
        System.out.println(s);
        /* a++ e ++aambos incrementam aem 1. A diferença é que a++retorna o
        valor de aantes do incremento, enquanto
        ++aretorna o valor depois do incremento.*/
    }

}
