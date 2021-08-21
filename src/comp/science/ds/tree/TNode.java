package comp.science.ds.tree;

public class TNode {
    int data;
    TNode lChild;
    TNode rChild;

    public TNode(int data){
        this.data = data;
        this.lChild = null;
        this.rChild = null;
    }

    @Override
    public String toString() {
        return "TNode{" +
                "data=" + data +
                ", lChild=" + lChild +
                ", rChild=" + rChild +
                '}';
    }
}
