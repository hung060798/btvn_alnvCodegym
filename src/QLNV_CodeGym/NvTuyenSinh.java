package QLNV_CodeGym;

public class NvTuyenSinh extends NhanVien{
    private int soTuyenSinh;

    public NvTuyenSinh() {
    }

    public NvTuyenSinh(String name, int age, String gender, String sdt, String email, double luong, int soTuyenSinh) {
        super(name, age, gender, sdt, email, luong);
        this.soTuyenSinh = soTuyenSinh;
    }

    public int getSoTuyenSinh() {
        return soTuyenSinh;
    }

    public void setSoTuyenSinh(int soTuyenSinh) {
        this.soTuyenSinh = soTuyenSinh;
    }

    @Override
    public double doanhThu(){
        return getLuong()*8+(soTuyenSinh*10);
    }

}
