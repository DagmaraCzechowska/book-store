package pl.sda.clone.shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(int i) {
        super();
    }


    @Override
    public double area() {
        return 2 * PI * radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public void printName() {
        //super.
        System.out.println("Jestem shape");
    }

    public void printDiametre() {
        System.out.println("Średnica: " + 2 * this.radius);
    }

}
