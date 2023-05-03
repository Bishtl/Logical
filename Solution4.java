// Determine  if the sum of two interger  is equal to given value

public class Solution4 {

    static boolean check(int[] A , int s, int n   ){
        for(int i= 0; i<s-1;i++){
            for(int j = i+1 ; j<s ; j++){
                if(A[i]+A[j] ==n){
                    return true;
                }
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int A[] = {2,4 ,1 ,32 ,2 };
        int s = A.length;
        int n = 4;

        if(check(A, s, n)){
            System.out.println("Numbers is Avaialble ");
        }
        else{
            System.out.println("Not found");
        }
    }
}
