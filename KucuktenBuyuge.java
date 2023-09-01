package Diziler;
import java.util.Arrays;
import java.util.Scanner;
public class KucuktenBuyuge {
    public static void main(String[] args){
        int n,k;
        int plus=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        n= scan.nextInt();
        int[] list = new int[n];
        for(int i = 1; i < n+1; i++) {
            System.out.print(i + ". Elemeanı\t: ");
            k = scan.nextInt();
            list[plus++] =k;

        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
