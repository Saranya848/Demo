package arrays;
    public class Ascendingorder {  
           public static void main(String[] args) {
           int [] n = new int []{2, 25, 13, 9, 30};
           System.out.println("The elements of array are: ");
            for (int i = 0; i < n.length; i++) { 
                System.out.println(n[i] + " ");
            }
            int temp;
            for (int i = 0; i < n.length; i++) { 
                for (int j = i+1; j < n.length; j++) {
                    if(n[i]>n[j])
                    {
                      temp = n[j];
                      n[j]=n[i];
                      n[i]=temp;
                    }
                }    
            }
            System.out.println("The ascending order of numbers in a array: ");
            for (int i = 0; i < n.length; i++) { 
                System.out.println(n[i]);
            }
    }  
}