package comp.science.ds.linkedlist;

public class SampleListProgram {

    public static void main(String[] args) {

        LinkList linkList = new LinkList();
/*
        singleLinkList.addNodeAtBeginning(10);
        singleLinkList.addNodeAtBeginning(20);singleLinkList.addNodeAtBeginning(20);singleLinkList.addNodeAtBeginning(20);singleLinkList.addNodeAtBeginning(20);
        singleLinkList.addNodeAtBeginning(30);
        singleLinkList.addNodeAtBeginning(40);singleLinkList.addNodeAtBeginning(40);
        singleLinkList.addNodeAtBeginning(50);
   */
        linkList.addNodeAtBeginning(10);
        linkList.addNodeAtBeginning(9);
        linkList.addNodeAtBeginning(8);
        linkList.addNodeAtBeginning(7);
        linkList.addNodeAtBeginning(6);
        linkList.addNodeAtBeginning(5);
        linkList.addNodeAtBeginning(4);
        linkList.addNodeAtBeginning(3);
        linkList.addNodeAtBeginning(2);
        linkList.addNodeAtBeginning(1);



        //  singleLinkList.addNodeAtBeginning(1);
       // singleLinkList.addNodeAtBeginning(9);



     //   singleLinkList.displayList();

        //Node temp = singleLinkList.middleOfList();

     //   singleLinkList.displayList();

       // singleLinkList.addOneToList();
       // Node head = singleLinkList.reverseList();
      //  System.out.println("Reverse Lists::");
        //singleLinkList.displayList(head);

        //System.out.println("Middle Element: "+temp.getData());

        //Node head = singleLinkList.deleteMiddleList();

        //singleLinkList.removeDuplicate();

       // singleLinkList.displayList();

       // System.out.println("Loop in system:"+singleLinkList.detectALoop());

        //System.out.println("isPalindrome="+singleLinkList.isPalindrome());

        //Node head = singleLinkList.deleteLastOccurance(9);
       // Node head = singleLinkList.rotateLinkedList(4);
        Node head = linkList.deleteMNnodes(3,2);
        linkList.displayList(head);


    }
}
