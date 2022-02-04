package arrays;
import java.util.*;
    public class Duplicate {  
           public static void main(String[] args) {
              int [] n = new int []{22, 5, 43, 51, 19, 22, 70, 43, 32, 70};
              System.out.println("The elements of array are: "+Arrays.toString(n));
              System.out.println("The Duplicate elements of array: ");
              for(int i = 0; i < n.length; i++){
                for(int j = i+1; j < n.length; j++){
                  if(n[j]==n[i]){
                    System.out.println(n[i]);
                  }
                }
              }
    }  
}