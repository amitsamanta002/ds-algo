package comp.science.ds.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree {

    public TNode root = null ;


    public void inOrder(TNode root){
        if(root == null)
            return;

        inOrder(root.lChild);
        System.out.println("Val:"+root.data);
        inOrder(root.rChild);
    }

    public void inorderWORecursion(TNode root){
        if(root == null)
            System.out.println("Tree is empty");

        TNode current = root;
        Stack<TNode> stack = new Stack<>();

        while(current!=null || stack.size() > 0){

            while(current!=null) {
                stack.push(current);
                current = current.lChild;
            }
             TNode temp = stack.pop();
             System.out.println("Element:"+temp.data);
             current = temp.rChild;
        }
    }

    public void postOrder(TNode root){
        if(root == null)
            System.out.println("Tree is empty");

        Stack<TNode> stack = new Stack<>();
        TNode current = root;

        while(current!=null || !stack.isEmpty()){

            while (current != null){
                stack.push(current);
                current = current.rChild;
            }

            TNode temp = stack.pop();
            System.out.println("Data:"+temp.data);
            current = temp.lChild;
        }

    }

    public void preOrder(TNode root){
        if(root == null)
            System.out.println("Tree is Empty");

        Stack<TNode> stack = new Stack<>();
        TNode current = root;

        while(current!=null || !stack.isEmpty()){

            while(current!=null){
                System.out.println("Elements:"+current.data);
                stack.push(current);
                current = current.lChild;
            }

            current = stack.pop().rChild;

        }

    }



    public void insert( int data){

        if(root == null){
            root = new TNode(data);
            return ;
        }

        Queue<TNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            TNode temp = queue.poll();  //taking the first element of the queue.
            if(temp.lChild == null){
                temp.lChild = new TNode(data);
                break;
            }else
                queue.add(temp.lChild);

            if(temp.rChild == null){
                temp.rChild = new TNode(data);
                break;
            }else
                queue.add(temp.rChild);
        }

        return ;
    }
}
