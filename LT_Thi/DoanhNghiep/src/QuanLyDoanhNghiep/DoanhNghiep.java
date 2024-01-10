package QuanLyDoanhNghiep;

import java.util.Scanner;

public class DoanhNghiep implements IDoanhNghiep {
    private int maNV = 100000;
    private int count = 0;
    private NhanVien[] mangNV = new NhanVien[500];
    public DoanhNghiep(){}
    public void addNV(){
        mangNV[++count - 1] = new NhanVien();
        mangNV[count - 1].setMaNV(maNV + count);
        mangNV[count - 1].add();
    }
    public void editNV() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        int index = findByMaNV(keyboard.nextInt());
        keyboard.nextLine();
        if (index > -1) mangNV[index].add();
        else System.out.println("Khong ton tai nhan vien");
    }
    public int findByMaNV(int maNV){
        for(int i = 0; i < count; i++)
            if (maNV == mangNV[i].getMaNV()) return i;
        return -1;
    }
    public void swap(int i, int j) {
        NhanVien temp = mangNV[i];
        mangNV[i] = mangNV[j];
        mangNV[j] = temp;
    }
    public void sortByMaNV(){
        for(int i = 0; i < count+1; i++)
            for(int j = i + 1; j < count; j++)
                if (mangNV[i].getMaNV() > mangNV[j].getMaNV()) swap(i, j);
    };
    public void sortByPB(){
        for(int i = 0; i < count+1; i++)
            for(int j = i + 1; j < count; j++)
                if (mangNV[i].getPbNV() > mangNV[j].getPbNV()) swap(i, j);
    };
    public void displayMangNhanVien() {
        System.out.println("Ma so\tHo va ten\tTuoi\tPhong ban");
        for(int i = 0; i < count; i++)
            if (mangNV[i] != null) mangNV[i].display();
    }
}
