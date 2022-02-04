package arrays;
import java.util.*;
    public class SecondLargest {
            public static int Sort(int[] n, int temp){  
                        Arrays.sort(n);  
                        return n[temp-2];  
            } 
           public static void main(String[] args) {
             int [] n = new int []{12, 15, 23, 9, 30};
             System.out.println("The elements of array are: " +Arrays.toString(n));
             System.out.println("The Second Largest number in a array: " + Sort(n, n.length)); 
    }  
}