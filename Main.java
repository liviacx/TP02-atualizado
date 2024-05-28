import java.util.Scanner;
import java.io.File;

public class Main {

  // Método principal apenas para testes
  public static void main(String[] args) {

    ListaInvertida listanome;
    ListaInvertida listadia;
    ListaInvertida listadiretor;
    ListaInvertida listaavaliacao;
    Scanner console = new Scanner(System.in);
    


    try {
      File d = new File("dados");
      if (!d.exists())
        d.mkdir();
      listanome = new ListaInvertida(4, "dados/dicionario.listainv.db", "dados/blocos.listainv.db");
      listadia = new ListaInvertida(4, "dados/dicionario2.listainv.db", "dados/blocos2.listainv.db");
      listadiretor = new ListaInvertida(4, "dados/dicionario3.listainv.db", "dados/blocos3.listainv.db");
      listaavaliacao = new ListaInvertida(4, "dados/dicionario4.listainv.db", "dados/blocos4.listainv.db");

      int opcao;
      do {
        System.out.println("\n\n-------------------------------");
        System.out.println("              MENU");
        System.out.println("-------------------------------");
        System.out.println("1 - Inserir");
        System.out.println("2 - Buscar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Imprimir");
        System.out.println("0 - Sair");
        try {
          opcao = Integer.valueOf(console.nextLine());
        } catch (NumberFormatException e) {
          opcao = -1;
        }
        File file = new File("dados/filmes.db");
        Arquivo<Filme> arquivoFilmes;
        arquivoFilmes = new Arquivo<>("filmes.db", Filme.class.getConstructor());
        switch (opcao) {
          case 1: {
            
            System.out.println( "Digite: nome do filme, dia de lançamento, diretor(a) e avaliação(0-10)");
            String nome = console.nextLine();
            int dia = Integer.valueOf(console.nextLine());
            String diretor = console.nextLine();
            double avaliacao = Double.valueOf(console.nextLine());
            Filme livro1 = new Filme(-1, nome, dia, diretor, avaliacao);
            int dado = arquivoFilmes.create(livro1);
            listanome.create(nome, dado);
            listadia.create(String.valueOf(dia), dado);
            listadiretor.create(diretor, dado);
            listaavaliacao.create(String.valueOf(avaliacao), dado);
            listanome.print("NOME");
            listadia.print("DIA");
            listadiretor.print("DIRETOR");
            listaavaliacao.print("AVALIAÇÃO");
          
          }
            break;
          /*case 2: {
            System.out.println("\nBUSCA");
            System.out.print("Chave: ");
            String chave = console.nextLine();
            int[] dados = lista.read(chave);
            System.out.print("Dado: ");
            for (int i = 0; i < dados.length; i++)
              System.out.print(dados[i] + " ");
          }
            break;
          case 3: {
            System.out.println("\nEXCLUSÃO");
            System.out.print("Chave: ");
            String chave = console.nextLine();
            System.out.print("Dado: ");
            int dado = Integer.valueOf(console.nextLine());
            lista.delete(chave, dado);
            lista.print();
          }
            break;
          case 4: {
            lista.print();
          }
            break;
         */ case 0:
            break;
          default:
            System.out.println("Opção inválida");
        }
      } while (opcao != 0);

    } catch (Exception e) {
      e.printStackTrace();
    }
    console.close();
  }
}