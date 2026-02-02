class isSortedArray {
    static void main(String[] args) {
        System.out.println("Welcome to Array Sorting Checkpost:\n");
        int[] numArray = Arrayutility.inputArray();
        boolean isInc = isIncreasing(numArray);
        boolean isDec = isDecreasing(numArray);
        if (isInc || isDec){
            System.out.println("Your Array is Sorted Array");
        }
        else {
            System.out.println("Your Array Is Not Sorted");
        }
    }
    public static boolean isIncreasing(int[] numArray){
        for (int i=1; i<numArray.length;i++){
            if (numArray[i]<numArray[i-1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isDecreasing(int[] numArray){
        for (int i=1; i<numArray.length;i++){
            if (numArray[i]>numArray[i-1]){
                return false;
            }
        }
        return true;


    }
}
