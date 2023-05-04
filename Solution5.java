//Serach the given key in 2d matrix

import javax.swing.text.Position;

public class Solution5{
    public static void main(String[] args) {
        int[][] Arr = {{2,4,6} , {9,2,4} , {32,5,1}};
        int n = 5;
        
        for(int i = 0;i<Arr.length;i++){
            for(int j = 0;j<Arr[i].length;j++){
                if(Arr[i][j]==n){
                    System.out.println("Key id found in "+i +" "+j +" "+"Position");
                }
            }
        }
    }
}