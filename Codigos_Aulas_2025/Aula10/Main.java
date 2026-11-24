package Aulas2025_1.Aula10;

public class Main {
    public static void main(String[] args) {
        Desenvolvedor dev1 = new Desenvolvedor("Paulo",101010,20000,"Java");
        Desenvolvedor dev2 = new Desenvolvedor("Hellen", 202020,21000,"Python");

        Gerente gerente = new Gerente("Renan", 303030, 30000,5);

        Departamento ti = new Departamento("TI");
        ti.addFuncionarios(gerente);
        ti.addFuncionarios(dev1);
        ti.addFuncionarios(dev2);

        ti.listFuncionarios();

        System.out.println(gerente.gerenciar());
        System.out.println(dev1.codar());
        System.out.println(dev2.codar());

    }
}
