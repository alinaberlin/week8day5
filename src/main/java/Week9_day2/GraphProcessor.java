package Week9_day2;

import java.util.*;


public class GraphProcessor {

    private Vertex current;
//execise2
    public void dfs(Graph graph, Vertex start, Set<Vertex> visited) {
        current = start;
        visited.add(current);
        System.out.println(current.getLabel());
        List<Vertex> neigbours = graph.getNeigbours(current);
        for(Vertex neigbour: neigbours){
            if(!visited.contains(neigbour)){
               dfs(graph, neigbour, visited);
            }
        }
    }
    //exercise3
    public void bfs(Graph graph,  Vertex start){
        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> store = new LinkedList<>();
        visited.add(start);
        store.add(start);
        while(!store.isEmpty()){
            Vertex current= store.poll();
            System.out.print(current + " ");
            for (Vertex n:graph.getNeigbours(current))   {
                if (!visited.contains(n)){
                    visited.add(n);
                    store.add(n);
                }
            }
        }

    }
    public static void main(String[] args){
        Graph graf = new Graph();
        graf.addVertex("Bob");
        graf.addVertex("Bo");
        graf.addVertex("B");
        graf.addEdge("Bob","Bo" );
        graf.addEdge("Bob","B" );
        graf.addEdge("B","Bo" );
        graf.bfs(graf, new Vertex("Bob"));
    }
}
