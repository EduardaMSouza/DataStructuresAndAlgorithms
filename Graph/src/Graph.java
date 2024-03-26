import java.util.ArrayList;
import java.util.HashMap;


public class Graph {

    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public HashMap<String, ArrayList<String>> getAdjList() {
        return adjList;
    }

    public void printGraph() {
        System.out.println(adjList);
    }

    public boolean addVertex(String a) {
        if (!adjList.containsKey(a)) {
            adjList.put(a, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String a, String b) {
        if (!(adjList.containsKey(a) && adjList.containsKey(b))) return false;
        adjList.get(a).add(b);
        adjList.get(b).add(a);
        return true;
    }

    public boolean removeEdge(String a, String b) {
        if (!(adjList.containsKey(a) && adjList.containsKey(b))) return false;
        adjList.get(a).remove(b);
        adjList.get(b).remove(a);
        return true;
    }

    public boolean removeVertex(String d) {
        if (!(adjList.containsKey(d))) return false;
        for (String key: adjList.get(d)) {
            adjList.get(key).remove(d);
        }
        adjList.remove(d);
        return true;
    }

    // WRITE ADDVERTEX METHOD HERE //
    //                             //
    //                             //
    //                             //
    //                             //
    /////////////////////////////////

}