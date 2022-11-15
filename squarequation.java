import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double a,b,c,d;
        System.out.println("Program rozwiązuje równanie kwadratowe.");
        System.out.println("Podaj a: ");
        a=read.nextDouble();
        System.out.println("Podaj b: ");
        b=read.nextDouble();
        System.out.println("Podaj c: ");
        c=read.nextDouble();
        d=delta(a,b,c);
        System.out.println("Wartość delty wynosi: "+d);
        solution(d);
    }
    public static double delta(double a,double b,double c){
        return (b*b)-(4*a*c);
    }

    public static void solution(double delta){
        if(delta<0){
            System.out.println("Brak rozwiązań!");
        }
        if(delta==0){
            System.out.println("Róznanie ma jedno rozwiązanie!");
        }
        if(delta>0){
            System.out.println("Równanie ma dwa rozwiązania!");
        }
    }


}
