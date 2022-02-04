package arrays;
    public class Smallestnum {  
           public static void main(String[] args) {
           int [] n = new int []{2, 25, 13, 9, 30};
           System.out.println("The elements of array are: ");
                       int temp = n[0];
        for (int i = 0; i < n.length; i++) {  
            System.out.println(n[i] + " "); 
        if(n[i]<temp)
        {
          temp = n[i];
        }
        }
          System.out.println("The Largest number in a array: " + temp); 
    }  
}