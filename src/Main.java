import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      double tutar, sum, faiz, kdvOran=0.18;
      Scanner input =new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz = ");
        tutar=input.nextDouble();
        faiz=tutar*kdvOran;
        sum=tutar + faiz;
        System.out.println("Toplam tutar: " + tutar);
        System.out.println("KDV oranı: " + kdvOran);
        System.out.println("KDV'li fiyat: " + sum);
        }
    }