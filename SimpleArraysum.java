//simple array sum
import java.util.*;

public class Addition{
    public static void main(String[] args){
        // int[] arr = {1,2,3,4,11,10};
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length;i++){
            
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
