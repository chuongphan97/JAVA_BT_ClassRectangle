import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle() {
    }
    public double getPerimeter(){
        return (this.width + this.height)*2;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public void display(){
        System.out.println("Rectangle width = " + this.width + ", height = " + this.height);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        double wid = scanner.nextDouble();

        System.out.print("Enter height: ");
        double hei = scanner.nextDouble();

        Rectangle rec1 = new Rectangle(wid,hei);
        System.out.println("Your Rectangle: ");
        rec1.display();

        System.out.println("Perimeter of the Rectangle: " + rec1.getPerimeter());
        System.out.println("Area of the Rectangle: " + rec1.getArea());
    }
}


