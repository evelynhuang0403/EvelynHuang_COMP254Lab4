package Exercise3;

public class Exercise3Runnable{
    public static void main(String[] args) {
        LinkedQueue<Integer> queue1 = new LinkedQueue<>();
        LinkedQueue<Integer> queue2 = new LinkedQueue<>();

        // Enqueue elements into queue1
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);


        // Print queue1
        System.out.println("Queue 1: " + queue1);

        // Enqueue elements into queue2
        queue2.enqueue(4);
        queue2.enqueue(5);

        // Print queue2
        System.out.println("Queue 2: " + queue2);

        // Concatenate queue1 and queue2
        System.out.println("Concatenating queue2 to queue1...");
        queue1.concatenate(queue2);
        // Print the queue1 after concatenation
        System.out.println("Queue 1 after concatenation: " + queue1);
        // Print the queue2 after concatenation
        System.out.println("Queue 2 after concatenation: " + queue2);
    }
}
