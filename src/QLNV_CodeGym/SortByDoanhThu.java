package QLNV_CodeGym;

import QLNV_CodeGym.NhanVien;

import java.util.Comparator;

public class SortByDoanhThu implements Comparator<NhanVien> {
    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        if (o1.doanhThu()>o2.doanhThu()){
            return 1;
        } else return -1;
    }
}
