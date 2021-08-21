package comp.science.ds.queue;

public class Queue {

    public QNode front;
    public QNode rear;

    public void Queue(){
        this.front = this.rear=null;
    }

    public void enqueue(int val){
        QNode temp = new QNode(val);


        if(this.rear==null && this.front==null){
            this.front = this.rear = temp;
            return;
        } else{
            this.rear.next = temp;
            this.rear = temp;
        }
    }

    public void dequeue(){
        if(this.front == null)
            System.out.println("Queue is empty");
         //   return -1;
        else{
            int val = this.front.key;
            this.front = this.front.next;
            if(this.front==null)
                this.rear = null;

           // return val;
        }
    }
}
