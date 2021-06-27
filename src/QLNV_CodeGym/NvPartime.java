package QLNV_CodeGym;

public class NvPartime extends Nvdt{
    private double time;

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public NvPartime() {
    }


    public NvPartime(String name, int age, String gender, String sdt, String email, double luong, String nganh, double time) {
        super(name, age, gender, sdt, email, luong, nganh);
        this.time = time;
    }

    @Override
    public double doanhThu(){
        return getLuong()*time;
    }

}


