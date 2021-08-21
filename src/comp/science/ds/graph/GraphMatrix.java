package comp.science.ds.graph;

public class GraphMatrix {

    private int [][] graph ;
    private int v;

    public GraphMatrix(int v){
        System.out.println("Graph matrix length:"+v);
        graph = new int[v][v];
    }

    public void addEdge(int v, int u){

   //     System.out.println(graph.length);
        graph[v][u] =1;
        graph[u][v] =1;
    }

    public void printGraph(){
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph.length;j++){
                if(graph[i][j]==1){
                    System.out.println(i+"->"+j);
                }
            }
            System.out.println();
        }
    }
}
