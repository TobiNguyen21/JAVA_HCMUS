package QuanLyDoanhNghiep;

import java.util.InputMismatchException;
import java.util.Scanner;
public class NhanVien extends Nguoi {
    private int maNV;
    private int pbNV;
    public NhanVien(){}
    public NhanVien(int maNV,String name,int age, int pbNV){
        super(name, age);
        this.maNV = maNV;
        this.pbNV = pbNV;
    }
    public int getMaNV() { return maNV; }
    public void setMaNV(int maNV) { this.maNV = maNV; }
    public int getPbNV() { return pbNV; }
    public void setPbNV(int pbNV) { this.pbNV = pbNV; }
    public void add() {
        Boolean done = false;
        Scanner keyboard = new Scanner(System.in);
        while (!done) {
            try {
                System.out.print("- Nhap ten: ");
                name = keyboard.nextLine();
                done = true;
            } catch (InputMismatchException e) {
                keyboard.nextLine();
                System.out.println("Error: Invalid Ho");
            }
        }
        done = false;
        while (!done) {
            try {
                System.out.print("- Tuoi: ");
                age = keyboard.nextInt();
                done = true;
            } catch (InputMismatchException e) {
                keyboard.nextLine();
                System.out.println("Error: Invalid Tuoi");
            }
        }
        keyboard.nextLine(); done = false;
        System.out.println("1. Ky thuat\n2. Ke toan\n3. Quan ly\n4. Ban hang");
        while (!done) {
            try {
                System.out.print("- Phong ban: ");
                pbNV = keyboard.nextInt();
                if (pbNV > 4 || pbNV < 1) throw new Exception("Error: Invalid Phong ban");
                done = true;
            } catch (InputMismatchException e) {
                keyboard.nextLine();
                System.out.println("Error: Invalid Phong ban");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void display(){
        System.out.print(getMaNV() + "\t" + getName() + "\t" + getAge() + "\t");
        switch(getPbNV()) {
            case 1: System.out.println("Ban hang"); break;
            case 2: System.out.println("Ke toan"); break;
            case 3: System.out.println("Ky thuat"); break;
            case 4: System.out.println("Quan ly"); break;
        }
    }
}
