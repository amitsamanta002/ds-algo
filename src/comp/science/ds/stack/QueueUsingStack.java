package comp.science.ds.stack;

import java.util.Stack;

public class QueueUsingStack {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public QueueUsingStack() {
    }

    public void enQueue(int value){

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(value);

        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

    }

    public int deQueue(){

        if(stack1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else
        return stack1.pop();
    }

    /***
     * Different approach for enqueue.
     */


}
