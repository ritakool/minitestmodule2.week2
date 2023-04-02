package material;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte choice = 0;
        do {
            System.out.println("Menu");
            System.out.println("1. Nhập 5 thịt ");
            System.out.println("2. Nhập 5 bột ");
            System.out.println("3. Xóa");
            System.out.println("4. Chỉnh sửa");
            System.out.println("5. Giá ");
            System.out.println("0. Thoát");

        }while (choice != 0);
    }
}
