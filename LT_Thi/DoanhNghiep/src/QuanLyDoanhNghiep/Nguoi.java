package QuanLyDoanhNghiep;

public abstract class Nguoi {
    protected String name;
    protected int age;
    public Nguoi() {}
    public Nguoi(String name, int age){
        this.age = age;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public abstract void add();
    public abstract void display();
}
