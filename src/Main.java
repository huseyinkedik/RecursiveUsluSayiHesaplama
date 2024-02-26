import java.util.Scanner;

public class Main {
    static int usalma(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * usalma(taban, us - 1);

        }
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Tabanı giriniz: ");
        int taban = inp.nextInt();

        System.out.println("Üssü giriniz: ");
        int us = inp.nextInt();

        System.out.println(usalma(taban, us));
    }
}