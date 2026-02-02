import java.util.Scanner;

class OccurrencesArray {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to array Occurrences\n");

        System.out.println("Enter The Range Of Array:");
        int size = x.nextInt();
        int[] numArray = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter the element for Array: ");
            numArray[i] = x.nextInt();
        }
        System.out.println("Now enter the Number you wanr to find:");
        int num = x.nextInt();

        int occurrences = noOfOccurrences(numArray,num);
        System.out.println("Your element was found "+occurrences+" times in Array");
    }
    public static int noOfOccurrences(int[] numArray, int num){
        int occ = 0;
        for (int i=0;i<numArray.length;i++){
            if (numArray[i]==num){
                occ++;

            }
        }
        return occ;
    }
}
