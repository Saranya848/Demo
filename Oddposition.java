package arrays;
    public class Oddposition {  
           public static void main(String[] args) {
              int [] n = new int []{12, 15, 23, 9, 30, 27, 43, 35};
              System.out.println("The elements of array are: ");
              for (int i = 0; i < n.length; i++) {  
                  System.out.println(n[i] + " ");
              }
              System.out.println("The number of even positions in a array: ");
              for (int i = 1; i < n.length; i = i+2) {  
                  System.out.println(n[i]);
              }
    }  
}