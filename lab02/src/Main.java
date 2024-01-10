public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Test1 t1 = new Test1();

        try {
            t1.test();
        }catch (
               Exception e
        ){
            System.out.println("err");
        }

    }
}