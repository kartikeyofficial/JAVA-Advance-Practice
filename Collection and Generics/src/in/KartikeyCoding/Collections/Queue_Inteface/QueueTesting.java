package in.KartikeyCoding.Collections.Queue_Inteface;

import in.KartikeyCoding.Collections.Utility;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTesting {
    static void main(String[] args)  {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(1);
        queue.offer(2);

        System.out.println(queue.peek());
        System.out.println(queue.element());
        queue.remove();

        Utility.print(queue);

        queue.poll();
        Utility.print(queue);

        System.out.println(queue.poll());


    }
}
