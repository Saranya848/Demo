package arrays;
    public class Evenposition {  
           public static void main(String[] args) {
              int [] n = new int []{12, 15, 23, 9, 30};
               System.out.println("The elements of array are: ");
               for (int i = 0; i < n.length; i++) {  
          		System.out.println(n[i] + " ");
               }
              System.out.println("The number of even positions in a array: ");
              for (int i = 0; i < n.length; i = i+2) {  
          		System.out.println(n[i]);
              }
 
    }  
}
