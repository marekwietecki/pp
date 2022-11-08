import java.util.Scanner;
import java.util.Random;
public class Project {
    public static void main(String[] args) {
        Scanner wczytaj = new Scanner(System.in);
        Random losuj=new Random();
        for(int i=0;i<=5;i++){
            losuj.nextInt();
        }
        System.out.println(losuj.nextInt( 100));

    }
}
