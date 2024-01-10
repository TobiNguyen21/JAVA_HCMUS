import java.text.DecimalFormat;
public class Cylinder extends Cirlce{
    private double height = 1.0;

    public Cylinder(){
    }

    public Cylinder(double radius){
        this.radius = radius;
    }

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height=height;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return this.height* this.radius * Math.PI *2;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        String result = df.format(this.getVolume());
        return "Cylinder[radius= " + this.radius + ",color= " + this.color +",height= " + this.height+",volume= "+result+ "]";
    }
}
