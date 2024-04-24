package Java.Problems.Graph;

import java.util.ArrayList;

public class Dfs {


    public void dfsrec(ArrayList<ArrayList<Integer>> adj,ArrayList< Integer> out,boolean visited[],int node){



        // https://takeuforward.org/data-structure/depth-first-search-dfs/

        //*
        // Time Complexity: For an undirected graph, O(N) + O(2E), For a directed graph, O(N) + O(E),
        // Because for every node we are calling the recursive function once, the time taken is O(N) and
        // 2E is for total degrees as we traverse for all adjacent nodes.
        //
        //Space Complexity: O(3N) ~ O(N), Space for dfs stack space, visited array and an adjacency list.
        //
        // *
        // marking current node visited
        visited[node]=true;
        out.add(node);

        for(Integer it: adj.get(node)){

            if(visited[it]==false){

                dfsrec(adj,out,visited,node);
            }

        }


    }

    public void dfs(ArrayList <ArrayList< Integer >> adj, int vertex){

        boolean visited[] = new boolean[vertex+1];
        visited[0]=true;
        ArrayList<Integer> output = new ArrayList<>();




    }
    public static void main(String[] args) {

        ArrayList <ArrayList< Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);
    }
}
