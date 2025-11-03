//package recursion;
public class basic2 {
    static int count = 0;
    public static void counterIs(){
        if(count == 4){
            return;
        } else {
            System.out.println(count);
            count++;
            counterIs();
        }
    }
    public static void main(String[] args) {
       counterIs();  
    }
    
}
