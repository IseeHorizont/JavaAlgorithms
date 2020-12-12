
public class Main {

    public static void main(String[] args) {
        Graph myGraph = new Graph(10);
        myGraph.addEdge(0, 1);
        myGraph.addEdge(1, 2);
        myGraph.addEdge(1, 4);
        myGraph.addEdge(0, 4);
        myGraph.addEdge(2, 4);
        myGraph.addEdge(4, 6);
        //myGraph.addEdge(5, 6);
        myGraph.addEdge(6, 7);
        myGraph.addEdge(7, 8);
        myGraph.addEdge(4, 8);
        myGraph.addEdge(8, 9);
        myGraph.addEdge(4, 9);
        myGraph.addEdge(3, 9);

        findSmallestRoad(myGraph, 0, 8);
        findSmallestRoad(myGraph, 4, 5);
        findSmallestRoad(myGraph, 1, 7);

    }

    public static void findSmallestRoad(Graph g, int start, int finish){
        BreadthFirstPaths bfs = new BreadthFirstPaths(g, start);
        if(bfs.hasPathTo(finish)){
            System.out.println("Кратчайший путь от точки " + bfs.getSource() + " до указанной Вами: "
                    + bfs.pathTo(finish));
        }else{
            System.out.println("Маршрута пока не существует :(");
        }

    }
}
