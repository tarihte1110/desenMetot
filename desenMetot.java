import java.util.*;
public class desenMetot {
    public static int sayac,Sayiilk;
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin:");
        int secilen= girdi.nextInt();
        System.out.println("     DESEN");
        islem(secilen);
    }
    public static int islem(int sayi){
        if (sayi<=0){
            sayac=2;
        }
        else if (Sayiilk==sayi && sayac>=2){
            System.out.print(sayi+" ");
            return 0;
        }
        if(sayac==0){
            Sayiilk=sayi;
            sayac=1;
            return islem(sayi);
        }
        else if (sayac==1){
            System.out.print(sayi+" ");
            return islem(sayi-5);
        }
        else{
            System.out.print(sayi+" ");
            return islem(sayi+5);
        }
    }
}
