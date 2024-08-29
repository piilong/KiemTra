package de01;

import java.util.ArrayList;

public class QLCauThu {
    public static void main(String[] args) {
        // Tạo danh sách các cầu thủ
        ArrayList<CauThu> danhSachCauThu = new ArrayList<>();

        // Khởi tạo và thêm các cầu thủ vào danh sách
        danhSachCauThu.add(new CauThu(1, "Nguyen Van A", 1990, 5000, 1500, 3000));
        danhSachCauThu.add(new CauThu(2, "Nguyen Hao Tao", 1999, 15000, 6500.0, 3000));
        danhSachCauThu.add(new CauThu(3, "Nguyen Tuan An", 1992, 50000, 10500.0, 3050));
        danhSachCauThu.add(new CauThu(4, "Nguyen Minh B", 1998, 500, 1500.0, 5000));
        danhSachCauThu.add(new CauThu(5, "Nguyen Hau Ben", 1997, 1500.0, 2000.0, 15000));
        danhSachCauThu.add(new CauThu(6, "Nguyen Trung Teo", 1998, 500.0, 100.0, 2000));
        danhSachCauThu.add(new CauThu(7, "Nguyen Van B", 1988, 500.0, 1000.0, 50000));
        danhSachCauThu.add(new CauThu(8, "Nguyen Min An", 1998, 500.0, 100.0, 5000));
        danhSachCauThu.add(new CauThu(9, "Tong Van Kiet", 1996, 5000.0, 1000.0, 2500));
        danhSachCauThu.add(new CauThu(10, "Hao Thien Khuyen", 1999, 500.0, 2000.0, 1500));
        danhSachCauThu.add(new CauThu(11, "Ngo Ba Van", 1998, 5000.0, 5000.0, 50000));
        // Hiển thị thông tin các cầu thủ
        for (CauThu cauThu : danhSachCauThu) {
            System.out.println(cauThu);
        }
    }
}
