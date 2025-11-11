import java.util.Scanner;

public class lt_344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int start = 0, end = arr.length-1;
        while(start< end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(new String(arr));
    }
}

//if a string is given we have to convert it into char array then we have to reverse it

