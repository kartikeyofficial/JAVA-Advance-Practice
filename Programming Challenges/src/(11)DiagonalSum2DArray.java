class DiagonalSum2DArray {
    static void main(String[] args) {
        System.out.println("Welcome to The Diagonal Sum Of 2D Array!\n");
        int[][] newArray = Arrayutility.input2DArray();
        long sum = sumOfDiagonals(newArray);
        System.out.println("Sum Of 2D Array Diagonal is: "+sum);
    }
    public static long sumOfDiagonals(int[][] newArray){
        long leftSum = sumOfLeftDiagonals(newArray);
        long rightSum = sumOfRightDiagonals(newArray);
        long sum = leftSum+rightSum;
        if(newArray.length % 2 != 0){
            int ind = newArray.length / 2;
            sum -= newArray[ind][ind];
        }
        return sum;
    }
    public static long sumOfRightDiagonals(int[][] newArray){
        long sum = 0;
        for (int i=0;i<newArray.length;i++){
            int cols = newArray.length -1 -i;
            sum += newArray[i][cols];
        }
        return sum;
    }
    public static long sumOfLeftDiagonals(int[][] newArray){
        long sum = 0;
        for (int i=0;i<newArray.length;i++){
            sum += newArray[i][i];
        }
        return sum;
    }
}
