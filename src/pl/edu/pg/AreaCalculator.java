package pl.edu.pg;

import pl.edu.pg.figures.*;

import java.util.Scanner;

public class AreaCalculator {

    private boolean exitCalculator = false;

    private Circle circle = new Circle();
    private Rectangle rectangle = new Rectangle();
    private Square square = new Square();
    private Triangle triangle = new Triangle();
    private Trapezium trapezium = new Trapezium();

    public void start() {
        System.out.println("Oblicz pole figury");
        System.out.println("------------------");
        Menu menu = new Menu();
        while (!exitCalculator) {
            menu.showMenu();
            actionMenu();
        }
    }

    public void actionMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWybierz opcję: ");
        String option = scanner.next();
        switch (option) {
            case "1":
                circle.showAreaInfo();
                break;
            case "2":
                rectangle.showAreaInfo();
                break;
            case "3":
                square.showAreaInfo();
                break;
            case "4":
                triangle.showAreaInfo();
                break;
            case "5":
                trapezium.showAreaInfo();
                break;
            case "0":
                exitCalculator = true;
                break;
            default:
                System.out.println("Błędny wybór\n");
        }
    }
}
