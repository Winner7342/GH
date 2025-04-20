package InformaticsHM;

import java.util.Scanner;
public class NextAndPrevious {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = n + 1;
        int d = n - 1;
        System.out.println("The next number for the number " + n + " is " + c );
        System.out.println("The previous number for the number " + n + " is " + d );

    }
}
