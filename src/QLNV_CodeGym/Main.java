package QLNV_CodeGym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Qlnv qlnv = new Qlnv();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1.them nhan vien");
            System.out.println("2.duoi nhan vien");
            System.out.println("3.hien thi luong theo ten");
            System.out.println("4.tim kiem nhan vien theo ten");
            System.out.println("5.sap xep theo ten nhan vien");
            System.out.println("6.show danh sach");
            System.out.println("7.sap xep theo doanh thu");
            System.out.println("8.exit");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:{
                    System.out.println("1.them nhan vien dao tao");
                    System.out.println("2.them nhan vien tuyen sinh");
                    int choice1 = Integer.parseInt(sc.nextLine());
                    if(choice1 ==1) {
                        System.out.println("1.them nhan vien fulltime");
                        System.out.println("2.them nhan vien parttime");
                        int choice2 = Integer.parseInt(sc.nextLine());
                        if (choice2 == 1) {
                            NhanVien nv = qlnv.taoNv("full");
                            qlnv.them(nv);
                        } else {
                            NhanVien nv = qlnv.taoNv("part");
                            qlnv.them(nv);
                        }
                    } else if (choice1 ==2 ){
                            NhanVien nv = qlnv.taoNv("tuyenSinh");
                            qlnv.them(nv);
                        }
                    break;
                    }
                case 2:{
                        qlnv.duoi();
                        }

//                    System.out.println("1.duoi nhan vien dao tao");
//                    System.out.println("2.udoi nhan vien tuyen sinh");
//                    int choice3 = Integer.parseInt(sc.nextLine());
//                    if (choice3 == 1){
//                        System.out.println("nhap ten");
//                        String name = sc.nextLine();
//                        qlnv.duoi(name);
//                    }else if (choice3 ==2){
//                        System.out.println("nhap ten");
//                        String name = sc.nextLine();
//                        qlnv.duoi(name);
//                    }
                    break;

                case 3:{
                    System.out.println("nhap ten");
                    String ten = sc.nextLine();
                    qlnv.luong(ten);
                    break;
                }
                case 4:{
                    System.out.println("nhap ten");
                    String name = sc.nextLine();
                    qlnv.search(name);
                    break;
                }
                case 5:{
                    qlnv.sort();
                }
                case 6:
                    for (NhanVien nv : qlnv.list) {
                        System.out.println(nv);
                    }
                    break;
                case 7:
                    qlnv.sortDoanhThu();
                    break;
                case 8:System.exit(0);
                }
            }
        }
    }
