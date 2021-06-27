package QLNV_CodeGym;

public class NhanVien {
    private String name;
    private int age;
    private String gender;
    private String sdt;
    private String email;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String name, int age, String gender, String sdt, String email, double luong) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.sdt = sdt;
        this.email = email;
        this.luong = luong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double doanhThu(){
        return getLuong();
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", sdt='" + sdt + '\'' +
                ", email='" + email + '\'' +
                ", luong=" + luong +
                '}';
    }
}
