package InformaticsHM;

import java.util.Scanner;
public class Task_C_AppleDivision1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = k % n;
        System.out.println(m);
    }
}
