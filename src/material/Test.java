package material;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte choice = 0;

//            System.out.println("Menu");
//            System.out.println("1. Nhập 5 thịt ");
//            System.out.println("2. Nhập 5 bột ");
//            System.out.println("3. Xóa");
//            System.out.println("4. Chỉnh sửa");
//            System.out.println("5. Giá ");
//            System.out.println("0. Thoát");
//            choice = sc.nextByte();
                    Material cf1 = new CrispyFlour("aa","bột lọc", LocalDate.parse("2022-12-11"),100,3);
                    Material cf2 = new CrispyFlour("aa1","bột lọc2", LocalDate.parse("2022-11-11"),100,3);
                    Material cf3 = new CrispyFlour("aa2","bột lọc3", LocalDate.parse("2022-09-11"),100,3);
                    Material cf4 = new CrispyFlour("aa3","bột lọc4", LocalDate.parse("2022-08-11"),100,3);
                    Material cf5 = new CrispyFlour("aa4","bột lọc5", LocalDate.parse("2022-10-11"),100,3);


                    MaterialManagement list = new MaterialManagement();
                    list.addArray(cf1);
                    list.addArray(cf2);
                    list.addArray(cf3);
                    list.addArray(cf4);
                    list.addArray(cf5);

                    list.outputMaterial();
                    System.out.println();

//                    System.out.println("Xóa ");
//                    System.out.println("nhâp vl cần xóa: ");
//                    String c = sc.nextLine();
                    list.deleteMaterial("aa1");
                    list.outputMaterial();
                    System.out.println();
                    Material cf6 = new CrispyFlour("aa6","bột lọc 7", LocalDate.parse("2022-10-11"),100,3);
                    list.updateMaterial("aa4", cf6);
                    list.outputMaterial();

            }

//        }while (choice != 0);
//    }
}
