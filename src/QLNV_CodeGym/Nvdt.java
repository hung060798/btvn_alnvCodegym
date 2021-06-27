package QLNV_CodeGym;

public class Nvdt extends NhanVien{
    private String nganh;

    public Nvdt() {
    }

    public Nvdt(String name, int age, String gender, String sdt, String email, double luong, String nganh) {
        super(name, age, gender, sdt, email, luong);
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public double doanhThu(){
        return super.getLuong();
    }
}
