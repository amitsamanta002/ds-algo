package comp.science.ds.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

        private int V;
        private ArrayList<ArrayList<Integer>> adj ;

        public Graph(int V){
            adj = new ArrayList<ArrayList<Integer>>(this.V);

            for(int i=0;i<V;i++){
                adj.add(new ArrayList<>());
            }
        }

        public void addEdges(int v, int u){

            adj.get(v).add(u);
            adj.get(u).add(v);
        }

        public void printGraph(){
            for(int i=0;i<adj.size();i++){
                System.out.print("vertex:"+i);
                Iterator itr = adj.get(i).iterator();
                while(itr.hasNext()){
                 System.out.print("->"+itr.next());
                }
                System.out.println();
            }
        }

    /***
     *  BFS search staring fom s node.
     * @param s
     */
        public void BFSSearch(int s){
            Queue<Integer> queue = new LinkedList<>();
            boolean [] visited = new boolean[adj.size()];

            queue.add(s);
            visited[s] = true;

            System.out.println("BFS Search:");
            System.out.print(s);

            while(!queue.isEmpty()){
                int node = queue.poll();
                Iterator<Integer> itr = adj.get(node).iterator();
                while(itr.hasNext()){
                    int n = itr.next();
                    if(!visited[n]){
                        System.out.print("->"+n);
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
            System.out.println();
        }

    /**
     * DFS search starting from v node.
     * @param v
     */
    public void DFSSearch(int v){
        boolean[] visited = new boolean[adj.size()];
        System.out.println("DFS Search:");
        DFSUtil(v,visited);
    }

        private void DFSUtil(int v, boolean[] visited){

            visited[v] = true;
            System.out.print("->"+v);

            Iterator<Integer> itr = adj.get(v).iterator();
            while(itr.hasNext()){
                int n = itr.next();
                if(!visited[n])
                    DFSUtil(n,visited);
            }
        }

}
