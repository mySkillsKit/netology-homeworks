package task21_1_GraphsAboutCity;

public class Graph {

    int[] vertices;//группа островов
    int[][] verticesInfo;// матрица смежности
    int size;

    public Graph(int V) {
        vertices = new int[V];
        verticesInfo = new int[V][V];
        this.size = V;

        for (int i = 0; i < V; i++) {
            vertices[i] = i;
        }

    }

    public void addEdge(int a, int b) {
        verticesInfo[a][b] = 1;
        verticesInfo[b][a] = 1;

    }

        //TODO  adjacent(v):
        //    return vertices_info[v]
    public int[] adjacent(int v) {
        int[] vert = new int[size];
        for (int i = 0; i < size; i++) {
            vert[i] = verticesInfo[v][i];
        }
        return vert;
    }

    public int[] vertices() {
        return vertices;
    }

    public int getSize() {
        return size;
    }

    public void printGraph(int V) {

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(verticesInfo[i][j] + " ");
            }
            System.out.println();

        }

    }

}
