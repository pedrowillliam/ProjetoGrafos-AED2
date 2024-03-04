package grafos;

import java.util.*;

public class Dijkstra<TIPO> {


    public void menorCaminho(Vertice<TIPO> inicio) {

        inicio.distanciaMin = 0.0;
        PriorityQueue<Vertice<TIPO>> fila = new PriorityQueue<Vertice<TIPO>>();
        fila.add(inicio);

        while (!fila.isEmpty()) {

            Vertice<TIPO> temp = fila.poll();

            for (Aresta<TIPO> vizinho : temp.vizinhos) {
                Double novaDist = temp.distanciaMin + vizinho.distancia;

                if (vizinho.fim.distanciaMin > novaDist) {
                    // Remove o valor da fila para atualizar a distância.
                    fila.remove(vizinho.fim);
                    vizinho.fim.distanciaMin = novaDist;

                    // Pegue o caminho visitado até agora e adicione o vértice.
                    vizinho.fim.caminho = new LinkedList<Vertice<TIPO>>(temp.caminho);
                    vizinho.fim.caminho.add(temp);

                    //Reinsira o vértice com a nova distância.
                    fila.add(vizinho.fim);
                }
            }
        }
    }
}