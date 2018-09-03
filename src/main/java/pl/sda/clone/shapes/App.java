package pl.sda.clone.shapes;

public class App {
    public static void main(String[] args) {

        Circle newCircle = new Circle(5);
        newCircle.printName();
        Squer newSqare = new Squer(10);
        newSqare.printName();
        System.out.println(newCircle.area());
        Shape circle = new Circle(10);
        ((Circle)circle).printDiametre();

    }
}
