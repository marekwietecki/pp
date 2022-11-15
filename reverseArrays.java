import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] tab1={2,5,6,-1,3,8};
        int[] tab2={7,9,-5,4,3,8};
        double[] tab3={2.5,6.7,3.4,-5.8,4.3};
        min(tab1);
        min(tab2);
        min(tab3);
        max(tab1);
        max(tab2);
        max(tab3);
        reverse(tab1);
        reverse(tab2);
        reverse(tab3);
        System.out.println("Odwrócona pierwsza tablica to: ");
        for(int i=0;i<tab1.length;i++){
            System.out.print(tab1[i]+" ");
        }
        System.out.println();
        System.out.println("Odwrócona druga tablica to: ");
        for(int i=0;i<tab1.length;i++){
            System.out.print(tab2[i]+" ");
        }
        System.out.println();
        System.out.println("Odwrócona trzecia tablica to: ");
        for(int i=0;i<tab1.length;i++){
            System.out.print(tab3[i]+" ");
        }
        }

        public static void min(int[]tab){
            int x=tab[0];
            for(int i=0;i<tab.length;i++){
                if(tab[i]<x){
                    x=tab[i];
                }
            } System.out.println("Najmniejsza wartość w tablicy wynosi: "+x);
        }
    public static void min(double[]tab){
        double x=tab[0];
        for(int i=0;i<tab.length;i++){
            if(tab[i]<x){
                x=tab[i];
            }
        } System.out.println("Najmniejsza wartość w tablicy wynosi: "+x);
    }
    public static void max(int[]tab){
        int x=tab[0];
        for(int i=0;i<tab.length;i++){
            if(tab[i]>x){
                x=tab[i];
            }
        } System.out.println("Największa wartość w tablicy wynosi: "+x);
    }
    public static void max(double[]tab){
        double x=tab[0];
        for(int i=0;i<tab.length;i++){
            if(tab[i]>x){
                x=tab[i];
            }
        } System.out.println("Największa wartość w tablicy wynosi: "+x);
    }

    public static void reverse(double[]tab){
        for(int i = 0; i < (tab.length/2); i++){
            double temporary;
            temporary=tab[i];
            tab[i]=tab[tab.length-1-i];
            tab[tab.length-1-i]=temporary;
        }
    }
    public static void reverse(int[]tab){
        for(int i = 0; i < (tab.length/2); i++){
            int temporary;
            temporary=tab[i];
            tab[i]=tab[tab.length-1-i];
            tab[tab.length-1-i]=temporary;
        }
    }

}
