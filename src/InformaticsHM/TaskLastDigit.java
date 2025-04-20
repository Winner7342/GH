package InformaticsHM;

import java.util.Scanner;
public class TaskLastDigit {
    public static void main(String[]args){
        Scanner dc = new Scanner(System.in);
        int t = dc.nextInt();
        int sum = t % 10;
        System.out.println(sum);
    }
}
