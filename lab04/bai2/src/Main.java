public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        System.out.println("Circle : " + c1);
        System.out.println("[Circle] Perimeter: " + c1.getPerimeter());
        System.out.println("[Circle] Area: " + c1.getArea());

        ResizableCircle r1 = new ResizableCircle(7.0);
        System.out.println("\nResizableCircle : " + r1);
        System.out.println("[ResizableCircle] Perimeter: " + r1.getPerimeter());
        System.out.println("[ResizableCircle] Area: " + r1.getArea());

        System.out.println();

        int resizePercent = 50;
        double resizedRadius = r1.resize(resizePercent);
        r1 = new ResizableCircle(resizedRadius);
        System.out.println("[ResizableCircle] Radius after resizing by " + resizePercent + "%: " + resizedRadius);

        System.out.println("[ResizableCircle] Perimeter: " + r1.getPerimeter());
        System.out.println("[ResizableCircle] Area: " + r1.getArea());
    }
}