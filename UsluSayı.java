package Giris;
import java.util.Scanner;
public class UsluSayı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,k;
        System.out.print("ussu alinacak sayi :");
        n=input.nextInt();
        System.out.print("us olacak sayi :");
        k=input.nextInt();
        int total=1;

        for(int i=1;i<=k;i++){
            total*=n;

        }
        System.out.println(total);
    }
}
