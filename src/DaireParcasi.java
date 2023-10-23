import java.util.Scanner;

public class DaireParcasi {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        int alpha;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen dairenin yarı çapını giriniz: ");
        r = input.nextInt();
        System.out.print("Lütfen daire diliminin açısını giriniz: ");
        alpha = input.nextInt();

        double dilimAlan = (pi * (r*r) * alpha) / 360;

        System.out.print("Daire diliminizin alanı: " + dilimAlan);
    }
}
