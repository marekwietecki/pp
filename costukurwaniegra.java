import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] cmdline) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int a=scanner.nextInt();
        System.out.println("Liczba dzielników tej liczby to: "+numberOfDividers(a));
        int number=numberOfDividers(a);
        if(ifPrimary(number)){
            System.out.println("Podana liczba jest pierwsza.");
        }else{
            System.out.println("Podana liczba nie jest pierwsza.");
        }
        System.out.println("Liczby pierwsze mniejsze od tej liczby to: ");
        for(int i=2;i<=a;i++){
            if(ifPrimary(number)) {
                System.out.print(i+" ");
            }
        }
    }
    public static int numberOfDividers(int a){
        int n=0;
        for(int i=1; i<a+1;i++){
            if(a%i==0){
                n++;
            }
        }
        return n;
    }
    public static boolean ifPrimary(int number){
        //return T if n is primary(has exactly 2 dividers)
        //ifelse return F
        return number ==2;

        }

    }
