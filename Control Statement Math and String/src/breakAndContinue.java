public class breakAndContinue {
    static void main(String[] args) {
        for (int i=1;true;i++){
            if (i==101){
                break;
            }
            else if (i==5){
                continue;
            }
            System.out.println(i+" ");
        }
    }
}
