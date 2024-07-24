package Java.Loops;

import java.util.Scanner;

public class HCF_GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre the itetraion:");
        int n = scan.nextInt();
        System.out.println("Enter n1: ");
        int n1 = scan.nextInt();
        System.out.println("Entre n2: ");
        int n2 = scan.nextInt();
        GCD(n,n1, n2);
        scan.close();
    }
    public static void GCD(int n, int n1, int n2){
        System.out.println("Common Factors: ");
        int count = 0;
        int i = 1;
        while(count < n){
            int multiple = n1 * i;
            if (multiple % n2 == 0) {
                System.out.print(multiple + " ");
                count++;
            }
            i++;
          }
       
}
}
