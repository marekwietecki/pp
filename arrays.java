import java.util.Scanner;
import java.util.Random;
public class Project {
    public static void main(String[] args) {
        Scanner wczytaj = new Scanner(System.in);
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab" + "->");
            tab[i] = wczytaj.nextInt();
        }

        int suma = 0;
        float srednia=0;
        int i;
        for (i = 0; i < tab.length; i++) {
            suma = suma + tab[i];
            System.out.println(tab[i]);
            srednia = (suma / 10);
        }System.out.println("srednia arytmetyczna jest rowna:"+ srednia);

        for (i = 0; i < tab.length; i++){
            if(tab[i]>srednia) {
                System.out.println("Wartość: _"+tab[i]+"_ jest większa od średniej");
            }
        }


        int min =tab[0];
        for(i=0;i < tab.length;i++){
            if(tab[i]<min) {
                min = tab[i];
            }
        } System.out.println("Wartość minimalna to: "+ min);

        int max=tab[0];
        for(i=0; i < tab.length;i++) {
            if(tab[i]>max) {
                max=tab[i];
            }
        } System.out.println("Wartość maksymalna to: "+ max);

    }
}

