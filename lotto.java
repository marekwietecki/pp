import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Project {
    public static void main(String[] args) {
        Scanner wczytaj = new Scanner(System.in);
        Random losuj = new Random();
        int i;
        int[] tab = new int[10];
        for (i = 0; i < 10; i++) {
            tab[i] = losuj.nextInt(49) + 1;
        }
        System.out.println("Gramy w lotto, strzelaj: ");
        int x = wczytaj.nextInt();
        System.out.println("Twoja liczba to: "+x);
        for (i = 0; i < 10; i++) {
            if (x == tab[i]) {
                System.out.println("Trafiłeś pog!");
            }
        }
        System.out.println(Arrays.toString(tab));
        //generate to array 10 integers from 1 to 50;
    }
}
