package de01;

import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        ArrayList<CauThu> qlct = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("========== MENU ==========");
            System.out.println("1. Them moi cau thu");
            System.out.println("2. Xuat thong tin danh sach cau thu");
            System.out.println("3. Cau thu co luong thuc cao nhat");
            System.out.println("4. Cau thu theo luong thuc tang dan");
            System.out.println("5. Luong cung cac cau thu");
            System.out.println("0. Thoat !");
            System.out.print("<3 Vui long chon chuc nang su dung: ");
            chon = sc.nextInt();
            sc.nextLine(); 

            switch (chon) {
                case 1:
                    themCauThu(qlct, sc);
                    break;
                case 2:
                    xuatDanhSachCauThu(qlct);
                    break;
                case 3:
                    cauThuLuongCaoNhat(qlct);
                    break;
                case 4:
                    cauThuTheoLuongTungDan(qlct);
                    break;
                case 5:
                    luongTrungBinh(qlct);
                    break;
                case 0:
                    System.out.println("Thoa chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        } while (chon != 0);

        sc.close();
    }

    private static void themCauThu(ArrayList<CauThu> qlct, Scanner sc) {
        int soAo;
        while (true) {
            System.out.print("Nhap so ao cau thu: ");
            soAo = sc.nextInt();
            sc.nextLine(); 

            if (!isSoAoExist(qlct, soAo)) {
                break;
            } else {
                System.out.println("So ao ton tai. Vui long chon so ao khac.");
            }
        }

        System.out.print("Nhap ho ten cau thu: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhap nam sinh cau thu: ");
        int namSinh = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Nhap luong cau thu: ");
        double luong = sc.nextDouble();
        sc.nextLine(); 

        CauThu cauThu = new CauThu(hoTen, namSinh, soAo, luong);
        qlct.add(cauThu);
        System.out.println("Cau thu da duoc them thanh cong.");
    }

    private static boolean isSoAoExist(ArrayList<CauThu> qlct, int soAo) {
        for (CauThu ct : qlct) {
            if (ct.getSoAo() == soAo) {
                return true;
            }
        }
        return false;
    }

    private static void xuatDanhSachCauThu(ArrayList<CauThu> qlct) {
        for (CauThu ct : qlct) {
            System.out.println(ct);
        }
    }

    private static void cauThuLuongCaoNhat(ArrayList<CauThu> qlct) {
        if (qlct.isEmpty()) {
            System.out.println("Danh sach cau thu rong.");
            return;
        }

        CauThu maxLuong = qlct.get(0);
        for (CauThu ct : qlct) {
            if (ct.getLuong() <= maxLuong.getLuong()) {
            } else {
                maxLuong = ct;
            }
        }
        System.out.println("Cau thu co luong cao nhat: " + maxLuong);
    }

    private static void cauThuTheoLuongTungDan(ArrayList<CauThu> qlct) {
        qlct.sort((ct1, ct2) -> Double.compare(ct1.getLuong(), ct2.getLuong()));
        System.out.println("Danh sach cau thu theo luong tang dan:");
        xuatDanhSachCauThu(qlct);
    }

    private static void luongTrungBinh(ArrayList<CauThu> qlct) {
        if (qlct.isEmpty()) {
            System.out.println("Danh sach cau thu rong.");
            return;
        }

        double tongLuong = 0;
        for (CauThu ct : qlct) {
            tongLuong += ct.getLuong();
        }
        double trungBinh = tongLuong / qlct.size();
        System.out.println("Luong trung binh cua cac cau thu: " + trungBinh);
    }
}
