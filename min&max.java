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
}
