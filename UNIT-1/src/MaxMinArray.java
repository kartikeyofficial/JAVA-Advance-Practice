import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("Welcome To Maximum And Minimum Element of Array");
        System.out.print("Enter The Size Of Array: ");
        int size= x.nextInt();
        int[] numArray = new int[size];
        for(int i =0; i<size;i++){
            System.out.print("Enter The Array Elements "+(i+1)+": ");
            numArray[i] = x.nextInt();
        }
        int max = max(numArray);
        int min = min(numArray);
        System.out.println("Max Of the Array Is: "+max);
        System.out.println("Min Of the Array Is: "+min);
    }
    public static  int max(int[] numarray){
        if(numarray.length==0){
            return Integer.MIN_VALUE;
        }
        int max= numarray[0];
        for(int i=1; i<numarray.length;i++){
            if(max<numarray[i]){
                max= numarray[i];
            }
        }
        return max;
    }

    public static  int min(int[] numarray){
       int min =  Integer.MAX_VALUE;
      for(int i=0; i<numarray.length;i++){
          if(min>numarray[i]){
                  min= numarray[i];
          }
      }
        return min;
    }

}
