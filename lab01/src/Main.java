
public class Main {
    public static void main(String[] args) {
//        WeekDayString b1 = new WeekDayString();
//        b1.DayNumberToWeekDay();

//        Binary2Decimal b2 = new Binary2Decimal();
//        b2.BinToNum();

        Rectangle b3 = new Rectangle(3.0f, 4.0f);
		System.out.println("LENGTH = " + b3.getLength());
		System.out.println("WIDTH = " + b3.getWidth());
		b3.setLength(30f);
		b3.setWidth(40f);
		System.out.println("LENGTH = " + b3.getLength());
		System.out.println("WIDTH = " + b3.getWidth());
		System.out.println("PERIMETER = " + b3.getPerimeter());
		System.out.println("AREA = " + b3.getArea());
		System.out.println(b3.toString());

    }
}
