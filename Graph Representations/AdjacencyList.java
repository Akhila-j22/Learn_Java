import java.util.ArrayList;
import java.util.List;
class AdjacencyList{
    static void addEdge(List<List<Integer>> adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void displayAdjList(List<List<Integer>> adj){
        for(int i=0;i<adj.size();i++){
            System.out.print(i+":");
            for(int j:adj.get(i)){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int V=4;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,2,3);
        addEdge(adj,1,3);
        System.out.println("Adjacency List:");
        displayAdjList(adj);
    }
}
