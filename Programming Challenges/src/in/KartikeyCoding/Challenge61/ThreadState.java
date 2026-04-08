package in.KartikeyCoding.Challenge61;

public class ThreadState extends Thread{

    @Override
    public void run() {
        try{
            Thread.sleep(4000);
            System.out.println("From Inside Run : "+getState());

        }
        catch (InterruptedException ie){
            System.out.println("Exception Occurs: "+ie.getMessage());
        }
    }
}
