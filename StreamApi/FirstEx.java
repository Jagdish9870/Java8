package StreamApi;

import java.util.Arrays;

public class FirstEx {
    public static void main(String[] args) {
        // stream is the concept of using functional and declarative programming on collection to make code shorten
        
        // imperative approach of printing sum of even number
        int[] arr= {1,2,3,4,5,6};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0)
            sum+=arr[i];
        }
        System.out.println(sum);

        //declarative approach
        int[] arr2={1,2,5,6,5,8};
        int sum2= Arrays.stream(arr2).filter(x->x%2==0).sum();
        System.out.println(sum2);

    }
    
}
