package Revision.Control_Statement;

public class printEven {
    static void main(String[] args) {
        for (int i=0;i<=100;i++){
            if (i%2==1){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
