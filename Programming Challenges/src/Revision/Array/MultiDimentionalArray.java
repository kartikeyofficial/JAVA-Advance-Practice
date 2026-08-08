package Revision.Array;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        int[][] Arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arr[0][1]);

        for (int i=0;i<Arr.length;i++){
            for (int j=0;j<Arr[i].length;j++){
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
