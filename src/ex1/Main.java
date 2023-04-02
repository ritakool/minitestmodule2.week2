package ex1;

import ex1.Trapezoid;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Trapezoid trapezoid1 = new Trapezoid(6,5,4,10,8);
        Trapezoid trapezoid2 = new Trapezoid(6,5,3,9,10);
        Trapezoid[] cc = new Trapezoid[] {trapezoid1,trapezoid2};
//         for (Trapezoid c : cc){
//             System.out.println(c);
//         }
        Arrays.sort(cc);
        System.out.println("Hình có diện tích và chu vi lớn hơn: ");
        System.out.println(cc[0].toString() + " " + "Area " + cc[0].getArea() + " " + "Perimeter = " + cc[0].getPerimeter());
    }
}