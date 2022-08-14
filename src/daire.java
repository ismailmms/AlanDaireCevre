import java.util.Scanner;
public class daire {
    public static void main(String[]args) {
        int r;
        double pi = 3.14,a,area;

        Scanner input = new Scanner(System.in);
        System.out.print("Yaricap uzunlugunu giriniz: ");
        r = input.nextInt();
        System.out.print("Merkez acisınin ölcusünu giriniz: ");
        a = input.nextDouble();

        area = (pi * (r * r)*a)/360 ;
        System.out.print("Daire diliminin alani: " + area);



    }
}
