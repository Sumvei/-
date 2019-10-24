import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;
import static java.lang.Math.round;

public class Main {
    public static PrintStream out = System.out;
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println ("Введите 2 любых целых числа: ");
        int q = k.nextInt();
        int w = k.nextInt();
        int s = 0;
        System.out.println("Введите массив:");
        Scanner e = new Scanner(System.in);
        int[][] arr = new int[q][w];
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                int d = e.nextInt();
                arr[i][j] = d;
                s = s + d;
            }
        }
        int[][] arr2 = new int[s][s];
        Random rand = new Random();
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                arr2[i][j] = rand.nextInt(10);
            }
        }
        System.out.println(Arrays.deepToString(arr2));
    }








}
