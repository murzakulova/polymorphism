import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner io = new Scanner(System.in);
            System.out.println("Input the radius of the circle: ");
            double radius = io.nextDouble();
        System.out.println("Perimeter is = " + Circle.area(radius));
        System.out.println("Area is = " + Circle.circumference(radius));
        }
    }


