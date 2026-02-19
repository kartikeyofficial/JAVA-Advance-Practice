import java.util.Scanner;

class forEachOccurrences {
    static void main(String[] args) {
        System.out.println("Welcome to Occurrences in Array\n");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array: ");
        int size  = x.nextInt();
        int[] newArray = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter The Array Elements "+(i+1)+" : ");
            newArray[i] = x.nextInt();
        }
        System.out.println("Enter The Number You Want to Search Occurrences: ");
        int key = x.nextInt();
        int occ=0;
        for (int num: newArray){
            if (num==key){
                occ++;
            }
        }
        System.out.println("Total No of Occurrences is: "+occ+" Times");
    }
}
