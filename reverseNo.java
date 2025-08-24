package Question;

import java.util.Scanner;

public class reverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int reverse = 0;

        while(num > 0){
            int r = num%10;
            reverse = reverse*10 + r;
            num = num/10;
        }
        System.out.println(reverse);
    }
}
