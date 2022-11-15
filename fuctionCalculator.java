import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Program wykonuje proste obliczneia: +,-,/,*");
        System.out.println("Podaj a:");
        double a = read.nextDouble();
        System.out.println("Podaj b: ");
        double b = read.nextDouble();
        String op = read.nextLine();
        System.out.println("Podaj operator: ");
        op = read.nextLine();
        switch (op) {
            case "+":
                System.out.println("Suma podanych liczb jest równa" + suma(a, b));
                break;
            case "-":
                System.out.println("Różnica podanych liczb jest równa" + różnica(a, b));
                break;
            case "/":
                System.out.println("Iloraz podanych liczb jest równa" + iloraz(a, b));

                case "*":
                System.out.println("Iloczyn podanych liczb jest równa" + iloczyn(a, b));
                break;
        }

    }
    public static double suma(double a,double b){
        return a + b;
    }
    public static double różnica(double a,double b){
        return a-b;
    }
    public static double iloraz(double a,double b){
        return a/b;
    }
    public static double iloczyn(double a,double b){
        return a*b;
    }
}
