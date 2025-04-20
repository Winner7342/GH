package InformaticsHM;

import java.util.Scanner;
public class MKAD {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int t = sc.nextInt();
        int l = 109;
        int sum = ((v * t) % l + l) % l;
        System.out.println(sum);
    }
}
