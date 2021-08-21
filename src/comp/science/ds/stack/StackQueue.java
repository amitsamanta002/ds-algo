package comp.science.ds.stack;

public class StackQueue {

    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);

        for(int i=0; i<5; i++){
            System.out.println("Dequeue item: "+q.deQueue());
        }

    }
}
