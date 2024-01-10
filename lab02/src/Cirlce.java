public class Cirlce {
    protected double radius = 1.0;
    protected String color = "red";

    public Cirlce(){
    }

    public Cirlce(double radius){
        this.radius=radius;
    }

    public Cirlce(double radius, String color){
        this.color=color;
        this.radius = radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public double getArea(){
        return Math.PI *(this.radius*this.radius);
    }

    public String toString() {
        return "Circle[radius= " + this.radius + ",color= " + this.color + "]";
    }
}
