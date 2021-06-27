package QLNV_CodeGym;

public class NvFull extends Nvdt{
    public NvFull() {
    }

    public NvFull(String name, int age, String gender, String sdt, String email, double luong, String nganh) {
        super(name, age, gender, sdt, email, luong, nganh);
    }

    @Override
    public double doanhThu(){
        return super.getLuong()*8;
    }
}
