package comp.science.ds.tree;

import comp.science.ds.linkedlist.Node;

public class BSTClass {

    private TNode root;

    public BSTClass(){
        root = null;
    }

    public void insert(int data){

       root =  insertNode(root, data);
    }

    private TNode  insertNode(TNode root, int data){
        if(root == null){
            root = new TNode(data);
            return root;
        }

        if(root.data> data)
            root.lChild = insertNode(root.lChild,data);

        if(root.data < data)
            root.rChild = insertNode(root.rChild,data);

        if(root.data == data)
            System.out.println("Data can't be inserted as it is already present");

        return root;
    }

    public void inorder(){
        inorderVisit(root);
    }

    private void inorderVisit(TNode root){
        if(root !=null) {
            inorderVisit(root.lChild);
            System.out.println("Value:" + root.data);
            inorderVisit(root.rChild);
        }
    }

    public void postorder(){
        postorderVisit(root);
    }

    private void postorderVisit(TNode root){

        if(root != null) {
            postorderVisit(root.lChild);
            postorderVisit(root.rChild);
            System.out.println("Element:" + root.data);
        }
    }
    public void preorder(){
        preorderVisit(root);
    }
    private void preorderVisit(TNode root){
        if(root !=null){
            System.out.println("Data:"+root.data);
            preorderVisit(root.lChild);
            preorderVisit(root.rChild);
        }
    }

    public void  minVal(){
        minValue(root);
    }
    private void minValue(TNode root){
        int minValue = root.data;

        while(root.lChild != null){
            minValue = root.lChild.data;
            root = root.lChild;
        }
        
        System.out.println("Minimum value:"+minValue);
    }
}
