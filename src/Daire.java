import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen dairenin yarı çapını giriniz: ");
        r = input.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.print("Dairenizin alanı: " + alan + "\nDairenizin çevresi: " + cevre);
    }
}
