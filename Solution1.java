// Find the Missing number in the array


public class Solution1{
    

    public static void main(String[] args) {
        int[] A = {1,3,4,5,6};
        int n = A.length+1;
        int total = n*(n+1)/2;

        int sum = 0;
        int result;
        for(int i=0;i<A.length;i++){
            sum = sum+A[i];
        }
        
        result = total-sum;

        System.out.println(result);
            
        
    }
}