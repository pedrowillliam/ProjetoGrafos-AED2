package grafos;

import java.util.Scanner;

public class Main<TIPO>{

    public static void main(String[] args) {


        Grafo<String> grafo = new Grafo<>();
         //Cidades com sede da Empresa
         grafo.addVertice("Recife"); //0
         grafo.addVertice("Fortaleza"); //1
         grafo.addVertice("Salvador"); //2
         grafo.addVertice("João Pessoa"); //3
         grafo.addVertice("Maceió"); //4
         //Cidades sem sede da Empresa
         grafo.addVertice("Teresina"); //5
         grafo.addVertice("Aracaju"); //6
         grafo.addVertice("Natal"); //7
         grafo.addVertice("São Luís"); //8
         grafo.addVertice("Patos"); //9 
         grafo.addVertice("Campina Grande"); //10
         grafo.addVertice("Caruaru"); //11
         grafo.addVertice("Surubim"); //12 
         grafo.addVertice("Garanhuns"); //13 
         grafo.addVertice("Petrolina"); //14
         grafo.addVertice("Juazeiro do Norte"); //15
         grafo.addVertice("Feira de Santana");//16
         
// Recife,Fortaleza, Salvador, João Pessoa, Maceió,Teresina, Aracaju, Natal, São Luís, Patos, Campina Grande, Caruaru, Surubim, Garanhuns, Petrolina, Juazeiro do Norte, Feira de Santana
 
         grafo.addAresta(133.2, "Recife", "Caruaru");//ok
         grafo.addAresta(133.2, "Caruaru", "Recife");//ok
         grafo.addAresta(117.0, "Recife", "João Pessoa");//ok
         grafo.addAresta(117.0, "João Pessoa", "Recife");//ok
         grafo.addAresta(259.0, "Recife", "Maceió");//ok
         grafo.addAresta(120.0,"Recife","Surubim");//ok
         grafo.addAresta(120.0,"Surubim","Recife");//ok 
         grafo.addAresta(202.0, "Recife", "Campina Grande");//ok
         grafo.addAresta(202.0, "Campina Grande", "Recife");//ok
         grafo.addAresta(673.0, "Fortaleza", "João Pessoa");//ok
         grafo.addAresta(673.0, "João Pessoa", "Fortaleza");//ok
         grafo.addAresta(604.0, "Fortaleza", "Teresina");//ok
         grafo.addAresta(604.0, "teresina", "Fortaleza"); //ok
         grafo.addAresta(524.0, "Fortaleza", "Natal"); //ok
         grafo.addAresta(524.0, "Natal", "Fortaleza");//ok
         grafo.addAresta(899.0, "Fortaleza", "São Luís");//ok
         grafo.addAresta(899.0, "São Luís", "Fortaleza");//ok
         grafo.addAresta(522.0, "Fortaleza", "Patos");//ok
         grafo.addAresta(522.0, "Patos", "Fortaleza");//ok
         grafo.addAresta(616.0, "Fortaleza", "Campina Grande");//ok
         grafo.addAresta(493.0, "Fortaleza", "Juazeiro do Norte");// ok
         grafo.addAresta(324.0, "Salvador", "Aracaju");//ok
         grafo.addAresta(324.0, "Aracaju", "Salvador");//ok
         grafo.addAresta(116.0, "Salvador", "Feira de Santana");//ok
         grafo.addAresta(181.0, "João Pessoa", "Natal");//ok
         grafo.addAresta(181.0, "Natal", "João Pessoa");//ok
         grafo.addAresta(127.0, "João Pessoa", "Campina Grande");//ok
         grafo.addAresta(127.0, "Campina Grande", "João Pessoa");//ok
         grafo.addAresta(238.0, "João Pessoa", "Caruaru");//ok
         grafo.addAresta(238.0, "Caruaru", "João Pessoa");//ok
         grafo.addAresta(176.0, "João Pessoa", "Surubim");//ok
         grafo.addAresta(176.0, "Surubim", "João Pessoa");//ok
         grafo.addAresta(276.0, "Maceió", "Aracaju");//ok
         grafo.addAresta(276.0, "Aracaju", "Maceió");//ok
         grafo.addAresta(194.0, "Maceió", "Caruaru");//ok
         grafo.addAresta(194.0, "Caruaru", "Maceió");//ok
         grafo.addAresta(171.0, "Maceió", "Garanhuns");//ok
         grafo.addAresta(171.0, "Garanhuns", "Maceió");//ok
         grafo.addAresta(687.0, "Maceió", "Petrolina");//ok
         grafo.addAresta(687.0, "Petrolina", "Maceió");//ok
         grafo.addAresta(439.0, "Teresina", "São Luís");//ok
         grafo.addAresta(439.0, "São Luís", "Teresina");//ok
         grafo.addAresta(860.0, "Teresina", "Patos");//ok
         grafo.addAresta(860.0, "Patos", "Teresina");//ok
         grafo.addAresta(646.0, "Teresina", "Petrolina");//ok
         grafo.addAresta(646.0, "Petrolina", "Teresina");//ok
         grafo.addAresta(590.0, "Teresina", "Juazeiro do Norte");//ok
         grafo.addAresta(590.0, "Juazeiro do Norte", "Teresina");//ok
         grafo.addAresta(607.0, "Aracaju", "Patos");//ok
         grafo.addAresta(607.0, "Patos", "Aracaju");//ok
         grafo.addAresta(313.0, "Aracaju", "Garanhuns");//ok
         grafo.addAresta(313.0, "Garanhuns", "Aracaju");//ok
         grafo.addAresta(477.0, "Aracaju", "Petrolina");//ok
         grafo.addAresta(477.0, "Petrolina", "Aracaju");//ok
         grafo.addAresta(310.0, "Aracaju", "Feira de Santana");
         grafo.addAresta(310.0, "Feira de Santana", "Aracaju");
         grafo.addAresta(333.3, "Natal", "Patos");
         grafo.addAresta(333.3, "Patos", "Natal");
         grafo.addAresta(236.0, "Natal", "Campina Grande");
         grafo.addAresta(236.0, "Campina Grande", "Natal");
         grafo.addAresta(177.0, "Patos", "Campina Grande");
         grafo.addAresta(177.0, "Campina Grande", "Patos");
         grafo.addAresta(294.0, "Patos", "Garanhuns");
         grafo.addAresta(294.0, "Garanhuns", "Patos");
         grafo.addAresta(541.0, "Patos", "Petrolina");
         grafo.addAresta(541.0, "Petrolina", "Patos");
         grafo.addAresta(294.0, "Patos", "Juazeiro do Norte");
         grafo.addAresta(294.0, "Juazeiro do Norte", "Patos");
         grafo.addAresta(147.0, "Campina Grande", "Caruaru");
         grafo.addAresta(147.0, "Caruaru", "Campina Grande");
         grafo.addAresta(99.8, "Campina Grande", "Surubim");
         grafo.addAresta(99.8, "Surubim", "Campina Grande");
         grafo.addAresta(548.0, "Garanhuns", "Petrolina");
         grafo.addAresta(548.0,"Petrolina", "Garanhuns");
         grafo.addAresta(348.0, "Petrolina", "Juazeiro do Norte");
         grafo.addAresta(348.0, "Juazeiro do Norte", "Petrolina");
         grafo.addAresta(396.0, "Petrolina", "Feira de Santana");
         grafo.addAresta(396.0, "Feira de Santana", "Petrolina");
         grafo.addAresta(101.0, "Garanhuns", "Caruaru");
         grafo.addAresta(101.0, "Caruaru", "Garanhuns");      
         grafo.addAresta(67.9, "Surubim", "Caruaru");
         grafo.addAresta(67.9, "Caruaru", "Surubim");
         grafo.addAresta(621.0, "Campina Grande", "Fortaleza");
         grafo.addAresta(581.0, "Petrolina", "Caruaru");
         grafo.addAresta(581.0, "Caruaru", "Petrolina");


         Dijkstra<String> obj = new Dijkstra<String>();
         Scanner scanInt = new Scanner(System.in);
         Scanner scanCidade = new Scanner(System.in);
         Scanner scanDestino = new Scanner(System.in);
         Scanner scanIndex = new Scanner(System.in);
 
         while (true) {
            System.out.println("\nDIGITE A AÇÃO: \n1 BUSCA EM LARGURA \n2 ROTA MAIS CURTA ENTRE DUAS CIDADES \n3 TODAS AS ROTAS MAIS CURTAS PARTINDO DA CIDADE \n4 DISTÂNCIA DE DETERMINADA ARESTA \n5 ENCERRAR");

            int acao = scanInt.nextInt();

            switch (acao) {
                case 1:
                    System.out.println("Digite o Número da cidade que você quer começar: \nRecife: 0\nFortaleza: 1\nSalvador: 2\nJoão Pessoa: 3\nMaceió: 4\nTeresina: 5\nAracaju: 6\nNatal: 7\nSão Luís: 8\nFeira de Santana: 9\nCampina Grande: 10\nCaruaru: 11\nJuazeiro do Norte: 12\nArapiraca: 13\nPetrolina: 14");
                    int index = scanIndex.nextInt();
                    grafo.buscaLargura(index);
                    break;
                case 2:
                    System.out.println("Qual cidade é o ponto de partida?");
                    String cidade = scanCidade.nextLine();
                    
                    // Limpar o caminho antes de calcular o menor caminho
                    for (Vertice<String> vertice : grafo.getVerticesG()) {
                        vertice.caminho.clear();
                        vertice.distanciaMin = Double.POSITIVE_INFINITY;
                    }
                
                    obj.menorCaminho(grafo.getVertice(grafo.getVertice(cidade).getDado()));
                    
                    System.out.println("Destino desejado:");
                    String dest = scanDestino.nextLine();
                    
                    for (Vertice<String> rota : grafo.getVerticesG()) {
                        if (rota.getDado().equals(dest)) {
                            System.out.print("Destino - " + rota.getDado() + " , Distância Mínima - " + rota.distanciaMin + "\nCaminho - [ ");
                            for (Vertice<String> caminhoV : rota.caminho) {
                                System.out.print(caminhoV.getDado() + " > ");
                            }
                            System.out.println("" + rota.getDado() + " ]");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Você quer ver os caminhos de partindo de que cidade?");
                    String cidade2 = scanCidade.nextLine();
                    obj.menorCaminho(grafo.getVertice(grafo.getVertice(cidade2).getDado()));
                    for (Vertice<String> rota2 : grafo.getVerticesG()) {
                        System.out.print("\nDestino - " + rota2.getDado() + " , Distância Mínima - " + rota2.distanciaMin + "\nCaminho - [ ");
                        for (Vertice<String> caminhoV2 : rota2.caminho) {
                            System.out.print(caminhoV2.getDado() + " > ");
                        }
                        System.out.println("" + rota2.getDado() + " ]");
                    }
                    break;
                case 4:
                    System.out.println("Você gostaria de ver a distância(em Km) de que aresta?");
                    System.out.println("Início: ");
                    String verticeI = scanCidade.nextLine();
                    System.out.println("Destino: ");
                    String verticeF = scanDestino.nextLine();
                    if (grafo.getAresta(grafo.getVertice(verticeI), grafo.getVertice(verticeF)) == null) {
                        System.out.println("Essa aresta não existe!");
                    } else {
                        System.out.println("A distância entre " + verticeI + " e " + verticeF + " é de: " + grafo.getAresta(grafo.getVertice(verticeI), grafo.getVertice(verticeF)).getDistancia() + " Km");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, digite novamente.");
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    System.exit(0);
                    break;
                
            }
        }
    }
}