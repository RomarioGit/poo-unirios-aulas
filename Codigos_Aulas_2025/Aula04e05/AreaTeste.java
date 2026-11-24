package Aulas2025_1.Aula04e05;

public class AreaTeste {
    public static void main(String[] args) {
        Area area = new Area(5.6);
        //area.pi = 12;
        // Area.pi = 3.245678;
        System.out.println(Area.pi);
        System.out.println(area.calcArea());
        System.out.println(Area.calcArea(7.8));
    }
}
