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

}
