import java.util.Scanner;

class Search2DArray {
    static void main(String[] args) {
        System.out.println("Welcome to The 2D Array Search:\n");
        Scanner x= new Scanner(System.in);
        int[][] newArray = Arrayutility.input2DArray();
        System.out.print("Enter The Number You Want To Be Search:");
        int num = x.nextInt();
        boolean isFound = search(newArray,num);
        if(isFound){
            System.out.println("Your Number Is Found!");
        }
        else {
            System.out.println("Your Number Is Not Found!");
        }
    }
    public static boolean search(int[][] newArray , int num){
        for (int i=0;i<newArray.length;i++){
            for (int j=0;j<newArray[i].length;j++){
                if (newArray[i][j] == num){
                    return true;
                }

            }
        }
        return false;
    }
}
