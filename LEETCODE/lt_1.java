import java.util.Scanner;

public class lt_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int index1=-1;
        int index2=-1;
        int target = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i]+arr[j] == target){
                    index1 = i;
                    index2 = j;
                    break;
                }
            }
        }
        System.out.println(index1+" "+index2);
    }
    
}
