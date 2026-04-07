package in.KartikeyCoding.Sleep;

public class TestingSleep {
    static void main(String[] args)throws InterruptedException {
        System.out.println("Before Sleeping: ");

        Thread.sleep(3000);

//        try{
//            Thread.sleep(10000);
//        }catch (InterruptedException ie){
//            System.out.println("Exception Occurs: "+ie.getMessage());
//        }

        System.out.println("Woke Up!");
    }
}
