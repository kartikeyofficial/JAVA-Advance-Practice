package in.KartikeyCoding.MultiThreading.ThreadClass;

public class SecondTask extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=1000;i++){
            System.out.print(i+"$ ");
        }
        System.out.println("\nSecond Task is Completed!");
    }
}
