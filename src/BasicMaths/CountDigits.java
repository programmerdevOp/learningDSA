package BasicMaths;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int ans = countDigit(n);
        System.out.println(ans);
    }

    static int countDigit(int n){
        int count = 0;

        while(n > 0){
            System.out.println("hello");
            count++;
            n = n/10;
        }

        return count;
    }
}
