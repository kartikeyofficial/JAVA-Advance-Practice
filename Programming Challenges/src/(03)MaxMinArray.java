 class MaxMinArray {
     static void main(String[] args) {
         System.out.println("Welcome To Max and Min\n");
         int[] numArray = Arrayutility.inputArray();
         int max = max(numArray);
         int min = min(numArray);
         System.out.println("Maximum of the Array is: "+max);
         System.out.println("Minimum of the Array is: "+min);

     }
     public static int min(int[] numArray){
         int min = Integer.MAX_VALUE;
         for (int i=0;i<numArray.length;i++){
             if (min>numArray[i]){
                 min = numArray[i];
             }

         }
         return min;
     }
     public static int max(int[] numArray){
         if (numArray.length==0){
             return Integer.MIN_VALUE;
         }
         int max = numArray[0];
         for (int i=1; i<numArray.length;i++){
             if(max<numArray[i]){
                 max = numArray[i];
             }
         }
         return max;
     }
}
