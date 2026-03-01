package in.KartikeyCoding.Challenge43;

public class ArrayOperations {
    private int[] arr;

    public ArrayOperations(int[] arr) {
        this.arr = arr;
    }

    public  class nested{
        public double meanofArray(){
            long sum=0;
            for (int i=0;i<arr.length;i++){
                 sum += arr[i];
            }
            return (double) sum/ arr.length;
        }
    }
}
