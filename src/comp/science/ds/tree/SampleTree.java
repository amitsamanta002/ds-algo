package comp.science.ds.tree;

public class SampleTree {

    public static void main(String[] args) {

        Tree bTree = new Tree();

     /*  bTree.insert(10);
       bTree.insert(5);
       bTree.insert(7);
       bTree.insert(6);
       bTree.insert(9);
       bTree.insert(1);
       bTree.insert(2);
       bTree.insert(3);
       bTree.inOrder(bTree.root);
       bTree.inorderWORecursion(bTree.root);
       bTree.postOrder(bTree.root);
       bTree.preOrder(bTree.root);
*/

        BSTClass binaryTree = new BSTClass();

        binaryTree.insert(50);
        binaryTree.insert(30);
        binaryTree.insert(40);
        binaryTree.insert(20);
        binaryTree.insert(10);
        binaryTree.insert(70);
        binaryTree.insert(80);
        binaryTree.insert(60);
        binaryTree.insert(90);

        binaryTree.inorder();
        binaryTree.postorder();
        binaryTree.preorder();
        binaryTree.minVal();

    }
}
