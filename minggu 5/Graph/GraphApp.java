package graph;

public class GraphApp {
    public static void main(String[] args){
        
        Graph theGraph = new Graph();
        
        theGraph.addVertex('A'); // 0
        theGraph.addVertex('B'); // 1
        theGraph.addVertex('C'); // 2
        theGraph.addVertex('D'); // 3
        theGraph.addVertex('E'); // 4
        
        
        theGraph.addEdge(0, 1); // AB
        theGraph.addEdge(1, 2); // BC
        theGraph.addEdge(2, 3); // AD
        theGraph.addEdge(3, 4); // DE
        
        Graph thisGraph = new Graph();
        
        thisGraph.addVertex('A'); // 0
        thisGraph.addVertex('B'); // 1
        thisGraph.addVertex('C'); // 2
        thisGraph.addVertex('D'); // 3
        thisGraph.addVertex('E'); // 4
        thisGraph.addVertex('F'); // 5
        
        thisGraph.addEdge(0, 1); // AB
        thisGraph.addEdge(1, 5); // BF
        thisGraph.addEdge(5, 2); // FC
        thisGraph.addEdge(2, 3); // CD
        thisGraph.addEdge(3, 4); // DE
        
      
        theGraph.display();
        theGraph.bfs();
        
        thisGraph.display();
        thisGraph.dfs();
        
        
    }
    
}
