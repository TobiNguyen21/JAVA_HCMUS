import java.util.Scanner;

public class Test1 {
    public void test(){
        Scanner scanner = new Scanner((System.in));

        System.out.println("Nhap thong so Cylinder");
        System.out.print("height: ");
        double height = scanner.nextDouble();

        System.out.print("radius: ");
        double radius = scanner.nextDouble();

        System.out.print("color: ");
        String color = scanner.next();

        Cylinder c0 = new Cylinder();
        Cylinder c1 = new Cylinder(radius,height);
        Cylinder c2 = new Cylinder(radius,height,color);

        System.out.println(c0.toString());
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }

}
