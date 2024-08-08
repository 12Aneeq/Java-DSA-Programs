import java.util.*;

public class add_arrays{
    public static void main(String args[]){
        int[] a = {1,2,3,4,5};
        int[] b = {5,4,3,2,1};
        int[] c = new int[a.length];
      
      //check if length of both array are equal
      if(a.length==b.length){
         //logic implementation
         for (int i=0,j=0,k=0; i < a.length; i++,j++,k++){
            c[k] = a[i] + b[j];
         }
         //Print the result
         System.out.println("Resultant array is:");
         System.out.println(Arrays.toString(c));
      } else {
         System.out.println("Length of both array should be same");
      }
    }
}