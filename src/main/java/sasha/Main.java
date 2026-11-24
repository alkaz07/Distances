package sasha;

//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в поле.
public class Main {
    static void main() {
        Cell a = new Cell(1, 4, "Розовый");
        Cell b = new Cell(5, 2, "Сиреневый");

        ManhettenDistance m = new ManhettenDistance();
        double d1 = m.distance(a, b);
        System.out.println("d1 = " + d1);
        double d2 = new MooreDistanceCalc().distance(a, b);
        System.out.println("d2 = " + d2);
    }
}
