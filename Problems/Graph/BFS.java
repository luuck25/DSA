package Java.Problems.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<5;i++){
        // add blank arraylist as we cannot add in null
            adj.add(new ArrayList<>());
        }

        // add edge info
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

    }

    // https://takeuforward.org/graph/breadth-first-search-bfs-level-order-traversal/
    // https://www.programiz.com/dsa/graph-bfs
    /*
    * take a visited array
    *
    * add adjacent neighbours in queue and poll them and leave what are already visited
    *
    * */

    public static ArrayList<Integer> BFSGraph(int vertex,ArrayList<ArrayList<Integer>> adj){
        Boolean[] visited = new Boolean[vertex];
        Queue<Integer> q = new LinkedList<>();

        ArrayList<Integer> output = new ArrayList<>();

        q.add(0);
        visited[0]=true;

        while(!q.isEmpty()){
            Integer node = q.poll();
            output.add(node);

            for(Integer it : adj.get(node)){

               if(visited[it]=false) {
                   visited[it] = true;
                   q.add(it);
               }
            }
        }
        return output;
    }
}
