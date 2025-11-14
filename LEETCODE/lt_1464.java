import java.util.Scanner;

public class lt_1464 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int smax = -1;
        int max = -1;
        for(int i = 0; i < n; i++){
            if(max < arr[i]){
                smax = max;
                max = arr[i];
            } else if(smax < arr[i]){
                smax = arr[i];
            }
        }
        int ans = (max-1) * (smax-1);
        System.out.println(ans);
    }
    
}
