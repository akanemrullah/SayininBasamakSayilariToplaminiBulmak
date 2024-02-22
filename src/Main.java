import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int tempNumber, number, counter = 0, total = 0;
        // Girilen bir sayinin basamak sayisini bulma

        // Kullanicidan bir sayi alip bu sayiyi degiskene atadik.
        System.out.print("Bir sayi gir: ");
        number = input.nextInt();

        // Kullanicinin girdigi sayinin korunmasina ihtiyacimiz var. Bu sebepten islemleri gecici bir degiskende tutuyoruz.
        tempNumber = number;

        // Burada ki dongude basamak sayisini hesapladik.
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            counter++;
        }
        tempNumber = number; // Kullanici sayisini tutan gecici degiskeni resetledik.

        // Basamak sayilarinin toplamini hesapladik.
        for (int i = 0; i < counter; i++) {
            total = total + (tempNumber % 10);
            tempNumber /= 10;
        }
        System.out.print("\n\nSonuc : " + total); // Kullaniciya cikti verdik.
    }
}