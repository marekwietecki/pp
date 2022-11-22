//wczytac liczbe  zakresu od 0 do 255 i wypisac ja binarnie na 8 poizycjach
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] cmdline) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj liczbę do zamiany na system binarny");
        int[] tab=new int[8];
        int a=scanner.nextInt();
        for(int i=7;i>=0;i--){
            tab[i]=a%2;
            a=a/2;
        }
        System.out.println("Podana liczba w systemie binarnym to: ");
        for(int i=0;i<8;i++){
            System.out.print(tab[i]+" ");
        }

    }
}
