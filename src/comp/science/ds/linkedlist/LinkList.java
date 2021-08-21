package comp.science.ds.linkedlist;

import java.util.HashSet;
import java.util.Stack;

public class LinkList {

    private Node head;

    public Node addNodeAtBeginning(int data){

        Node newNode = new Node(data);

        if(head == null)
            head = newNode;
        else{
            newNode.setNext(head);
            head = newNode;

        }

        return head;
    }

    public void displayList(){
        Node temp = head;
        if(temp== null)
            System.out.println("List is empty");
        else{
            while(temp !=null){
                System.out.println("Val-> :"+temp.getData());
                temp =  temp.getNext();
            }
        }
    }
    public void displayList(Node head){
        Node temp = head;
        if(temp== null)
            System.out.println("List is empty");
        else{
            while(temp !=null){
                System.out.println("Val-> :"+temp.getData());
                temp =  temp.getNext();
            }
        }
    }

    public Node middleOfList(){
        Node slow = head;
        Node fast = head;

        if(head == null)
            return head;
        else
        {
            while(fast!=null && fast.getNext()!=null){
                fast = fast.getNext().getNext();
                slow = slow.getNext();
            }
            return slow;
        }
    }

    public Node deleteMiddleList(){
        Node slow = head;
        Node fast = head;
     //   Node temp = head;
        Node prev = null;

        if(head == null) {
            System.out.println("List is empty to delete any elements");
        }
        else
        {
            while(fast!=null && fast.getNext()!=null){
                prev = slow;
              //  temp = temp.getNext();
                fast = fast.getNext().getNext();
                slow = slow.getNext();
            }
            prev.setNext(slow.getNext());
        }

        return slow;
    }

    public Node removeDuplicate(){
        /***
         * Remove duplicate in list where all elements are in sorted orders.
         */

        Node current = head;
        while(current !=null && current.getNext()!=null){

            if(current.data == current.next.data)
                current.next = current.next.next;
            else
                current = current.next;
        }

        return head;
    }

    public Node reverseList(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        return prev;
    }

    public Node addOneToList(){
        Node revList = head;

        if(head !=null)
            revList = reverseList(head);

        System.out.println("Reverser List");
        displayList(revList);
        Node current = revList;

        int carry = 1, rem=0;

        while (current!=null){

            int sum = current.data + carry;
            rem = sum%10;
            carry = sum/10;
            current.data = rem;

            if(current.next == null && carry !=0){
                current.next = new Node(carry);
                break;
            }

            current=current.next;
        }

        revList = reverseList(revList);
        System.out.println("After additions:");
        displayList(revList);


        return head;
    }

    public boolean detectALoop(){
        Node current = head;
        HashSet<Node> hs = new HashSet<>();

        while(current!=null){
            if(hs.contains(current))
                return true;

            hs.add(current);
            current = current.next;
        }
        return false;

    }

    public boolean isPalindrome(){
        Node current = head;
        Stack<Node> stack = new Stack<>();
        while(current !=null){
            stack.push(current);
            current = current.next;
        }
        Node travel = head;
        boolean flag = true;

        while(travel != null){
            Node temp = stack.pop();
            System.out.println("st:"+temp.data);
            System.out.println("tr:"+travel.data);

            if(temp.data == travel.data)
                travel = travel.next;
            else{
                flag = false;
                break;
            }

        }
        return flag;

    }

    public Node deleteLastOccurance(int key){
        Node current = head;
        Node prev = null;

        while(current.next !=null){

            if(current.next.data == key){
                prev = current;
            }
            current = current.next;
        }
        if(prev == null)
            System.out.println("No key found");
        else
            prev.next = prev.next.next;

        return head;
    }

    public Node rotateLinkedList(int key){
        Node current = head;
        Node prev = head;
        Node newhead = null;
        int count =0;

        while(current != null){
            count = count +1 ;
            System.out.println("cut:"+current.data);
            if(count == key){
                newhead = current.next;
                System.out.println("new head:"+newhead.data);
                current.next = null;

                Node temp = newhead;

                while(temp.next != null)
                    temp = temp.next;

                temp.next = prev;
            }
            current = current.next;
        }

        return newhead;
    }

    public Node deleteMNnodes(int m, int n){
        Node  current = head;
        Node temp = null;
        int count =0;

        while(current !=null){
            count = count + 1;

            if(count == m){
                temp = current;
                for(int i=0;i<n && temp.next!=null;i++)
                    temp = temp.next;

                current.next = temp.next;
                count =0;
            }
            current = current.next;

        }
        return head;
    }


}
