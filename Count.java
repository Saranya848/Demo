package arrays;
import java.util.*;
    public class Count {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int[] a = new int[500];
            int[] freq = new int[500];
            int size, i, j, count;
            System.out.println(“Enter size of array: “);
            size = sc.nextInt();
            System.out.println(“Enter elements in array: “);
            for(i=0; i<size; i++)
            {
                a[i] = sc.nextInt();
                freq[i] = -1;
        }
        for(i=0; i<size; i++)
        {
              count = 1;
              for(j=i+1; j<size; j++)
              {
                  if(arr[i]==arr[j])
                  {
                    count++;
                    freq[j] = 0;
}

}


/* If frequency of current element is not counted */

if(freq[i] != 0)

{

freq[i] = count;

}

}

/* Print frequency of each element */

System.out.print(“nFrequency of all elements of array : n”);

for(i=0; i<size; i++)

{

if(freq[i] != 0)

{

System.out.print(arr[i] + ” occurs ” + freq[i] + ” times” + “n”);

}

}

}
}
}