package comp.science.ds.graph;

public class GraphClass {

    public static void main(String[] args) {

        Graph graph = new Graph(5);
        graph.addEdges(0,1);
        graph.addEdges(1,2);
        graph.addEdges(2,3);
        graph.addEdges(3,4);
        graph.addEdges(1,4);
        graph.addEdges(2,4);

       // graph.printGraph();

        GraphMatrix graphMatrix = new GraphMatrix(5);
        graphMatrix.addEdge(0,1);
        graphMatrix.addEdge(1,2);
        graphMatrix.addEdge(2,3);
        graphMatrix.addEdge(3,4);
        graphMatrix.addEdge(1,4);
        graphMatrix.addEdge(2,4);

        graphMatrix.printGraph();

        graph.BFSSearch(0);

        graph.DFSSearch(1);


        int i = 'a'-'\0';
        char ch = (char)(i+'\0');
        System.out.println("Char:"+i);
        System.out.println("old value:"+ ch);
    }
}

