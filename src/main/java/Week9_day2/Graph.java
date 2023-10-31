package Week9_day2;

import java.util.*;
//exercise 1
public class Graph {
    private Map<Vertex, List<Vertex>> adjustmentVertical = new HashMap<>();
    public void addVertex(String string){
        Vertex vertex = new Vertex(string);
        adjustmentVertical.putIfAbsent(vertex, new ArrayList<>());
    }
    public void addEdge(String label1, String label2 ){
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        if(adjustmentVertical.containsKey(v1)&& adjustmentVertical.containsKey(v2)){
            adjustmentVertical.get(v1).add(v2);
            adjustmentVertical.get(v2).add(v1);
        }
    }
    public List<Vertex> getNeigbours(Vertex vertex ){
       return adjustmentVertical.get(vertex);

    }
    //exercise2

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

}
