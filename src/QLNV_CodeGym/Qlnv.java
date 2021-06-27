package QLNV_CodeGym;

import com.sun.javafx.tk.ScreenConfigurationAccessor;

import java.util.ArrayList;
import java.util.Scanner;

public class Qlnv {
    static Scanner sc = new Scanner(System.in);
    ArrayList<NhanVien> list = new ArrayList<>();


    public void them(NhanVien nhanVien) {
        list.add(nhanVien);
    }

    public void duoi() {
        System.out.println("1.duoi nhan vien dao tao");
        System.out.println("2.duoi nhan vien tuyen sinh");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ten");
        String name = sc.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                switch (choice) {
                    case 1:
                        if (list.get(i) instanceof Nvdt) {
                            list.remove(list.get(i));
                        }
                    case 2:
                        if (list.get(i) instanceof NvTuyenSinh) {
                            list.remove(list.get(i));
                        }
                }
            }
        }
    }

    public void luong(String name){
        for (NhanVien nv :list){
            if (nv.getName().equals(name)){
                System.out.println(nv.getLuong());
            }
        }
    }

    public void search(String name){
        for (NhanVien nv : list){
            if (nv.getName().equals(name)){
                System.out.println(nv);
            }
        }
    }

    public void sort(){
        SortByName sortByName = new SortByName();
        list.sort(sortByName);
    }

    public void sortDoanhThu(){
        SortByDoanhThu sortByDoanhThu = new SortByDoanhThu();
        list.sort(sortByDoanhThu);
    }

    public int age(){
        while (true) {
            try {
                System.out.println("nhap tuoi");
                int age = Integer.parseInt(sc.nextLine());
                if (age < 18) {
                    throw new NotAge();
                } else {
                    return age;
                }
            } catch (NotAge e) {
                System.out.println("chua du tuoi");
            } catch (Exception e) {
                System.out.println("tuoi la so");
            }
        }
    }

    public double luong(){
        while (true){
        try {
            System.out.println("nhap luong");
            double luong = Double.parseDouble(sc.nextLine());
            return luong;

        }
        catch (Exception e){
            System.out.println("nhap so");
        }
        }
    }

    public String gioiTinh(){
        while (true){
            try {
                System.out.println("nhap gioi tinh");
                String gender = sc.nextLine();
                if (gender.equals("nam")||gender.equals("nu")){
                    return gender;
                } else throw new GioiTinh();

            }
            catch (GioiTinh e){
                System.out.println("nam hoac nu");
            }
        }
    }

    public String getEmail() {
        while (true) {
            try {
                System.out.println("nhap email");
                String eamil = sc.nextLine();
                for (NhanVien nv : list) {
                    if (nv.getEmail().equals(eamil)) {
                        throw new TrungEmail();
                    }
                }
                return eamil;
            } catch (TrungEmail e) {
                System.out.println(" turng email");
            }
        }
    }


    public NhanVien taoNv(String kieuNV) {
        System.out.println("nhap ten");
        String name = sc.nextLine();

//        System.out.println("nhap tuoi");
//        int age = Integer.parseInt(sc.nextLine());


//        try {
//            System.out.println("nhap tuoi");
//            int age = Integer.parseInt(sc.nextLine());
//            if (age < 18){
//                throw new NotAge();
//            } else  {
//                return age;
//            }
//        }
//        catch (NotAge e){
//            System.out.println("chua du tuoi");
//        }
//        catch (Exception e){
//            System.out.println("tuoi la so");
//        }

//        System.out.println("nhap gioi tinh");
//        String gender = sc.nextLine();

        System.out.println("nhap sdt");
        String sdt = sc.nextLine();

//        System.out.println("nhap email");
//        String eamil = sc.nextLine();

//        System.out.println("nhap luong");
//        double luong = Double.parseDouble(sc.nextLine());

//        try {
//            System.out.println("nhap luong");
//            double luong = Double.parseDouble(sc.nextLine());
//
//        }
//        catch (Exception e){
//            System.out.println("nhap so");
//        }

        if (kieuNV.equals("full")) {
            System.out.println("nhap nganh");
            String nganh = sc.nextLine();
            return new NvFull(name, age(), gioiTinh(), sdt, getEmail(), luong(), nganh);
        } else if (kieuNV.equals("part")) {
            System.out.println("nhap nganh");
            String nganh = sc.nextLine();
            System.out.println("nhap so gio");
            double time = Double.parseDouble(sc.nextLine());
            return new NvPartime(name, age(), gioiTinh(), sdt, getEmail(), luong(), nganh, time);
        } else {
            System.out.println("nhap so tuyen sinh");
            int soTuyenSinh = Integer.parseInt(sc.nextLine());
            return new NvTuyenSinh(name, age(), gioiTinh(), sdt, getEmail(), luong(), soTuyenSinh);
        }
    }
}
