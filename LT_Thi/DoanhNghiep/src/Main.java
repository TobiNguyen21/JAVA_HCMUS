import java.util.Scanner;
import java.util.InputMismatchException;

import QuanLyDoanhNghiep.DoanhNghiep;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DoanhNghiep dn1 = new DoanhNghiep();
        int key;
        while(true) {
            System.out.println("--------BUSINESS-------");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Xuat nhan vien");
            System.out.println("3. Chinh sua nhan vien");
            System.out.println("4. Sap xep theo ma so");
            System.out.println("5. Sap xep phong ban");
            try {
                System.out.print("Nhap lua chon: ");
                key = keyboard.nextInt();
                switch (key) {
                    case 1: dn1.addNV(); break;
                    case 2: dn1.displayMangNhanVien(); break;
                    case 3: dn1.editNV(); break;
                    case 4: dn1.sortByMaNV(); break;
                    case 5: dn1.sortByPB(); break;
                }
                if (key == 0) break;
            } catch (InputMismatchException e) {
                keyboard.nextLine();
            }
        }
        keyboard.close();
    }
}