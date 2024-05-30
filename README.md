# TP2-aeds3-busca-por-palavras
Segundo trabalho prático da disciplina de Algoritmos e Estruturas de Dados III

## RELATÓRIO ##

### 1. Introdução ###
    
O trabalho consiste em implementar um sistema de busca por palavras em uma lista. Para isso, foi utilizado uma lista invertida, que é uma estrutura de dados que armazena, para cada
palavra, uma lista de filmes que contém essa palavra. A lista de filmes é uma lista encadeada, onde cada termo possui um título e um identificador. A lista invertida é uma árvore AVL, onde cada nó possui uma palavra e uma lista.

### 2. Dificuldades ###  

Tivemos dificuldades ao implementar os métodos read e removeAcentos, mas conseguimos resolver com a colaboração dos colegas de sala. Durante o processo, notamos uma peculiaridade no funcionamento do método removeAcentos, que variava de máquina para máquina. Em algumas, observamos a adição de uma interrogação nas palavras com acentos, pois eram removidos antes de chegarem ao método. No entanto, em outras máquinas, o método removeAcentos operava corretamente.

### 3. Classes e Métodos ###  
- ListaInvertida:
  - ```java
    public class ListaInvertida
    
    create(String c, int d): Este método insere um dado na lista de uma chave de maneira não ordenada. Ele verifica se o dado já existe na lista da chave. Se existir, o método retorna falso. Se não existir, o método adiciona o dado à lista da chave.  
    
    read(String c): Este método retorna a lista de dados de uma determinada chave. Ele calcula a interseção dos conjuntos de dados correspondentes a cada palavra na chave e retorna o resultado.  
    
    update(String c, int d, String nc): Este método atualiza cada chave (cada palavra) de um dado com novas chaves. Ele deleta as chaves antigas e cria novas.
      
    delete(String c, int d): Este método remove um dado de uma chave, mas não apaga a chave nem os blocos. Ele verifica se o dado existe na lista da chave. Se existir, o método remove o dado da lista.  
    
    print(String a): Este método imprime todas as listas invertidas. Ele percorre todas as chaves e imprime a chave e sua lista.  
    
    isStopWord(String word): Este método verifica se uma palavra é uma "stop word", ou seja, uma palavra comum que geralmente é filtrada em uma busca. 
     
    removeAcentos(String str): Este método remove os acentos de uma string.
    
- Filme:
    - ```java
        public class Filme
      
        byte[] toByteArray(): Este método converte os atributos do objeto Filme em um array de bytes. 
      
        void fromByteArray(byte[] byteArray): Este método converte um array de bytes em um objeto Filme.
      
- Arquivo:
  - ```java
    public class Arquivo
    
    int create(T obj): Este método cria um novo registro no arquivo. Ele incrementa o último ID, define o ID do objeto, converte o objeto em um array de bytes e escreve no arquivo. Se houver espaço suficiente em um registro deletado, o novo registro é escrito lá. Caso contrário, é escrito no final do arquivo.
    
    boolean update(T obj): Este método atualiza um registro existente no arquivo. Se o novo tamanho do registro for maior que o antigo, ele procura por um espaço vazio suficiente para armazenar o novo registro. Se nenhum espaço vazio suficiente for encontrado, o novo registro é adicionado no final do arquivo. Se o novo tamanho for menor ou igual ao antigo, o registro é atualizado no mesmo local.
    
    T read(int id): Este método lê um registro do arquivo com o ID fornecido. Ele retorna o objeto correspondente ao registro, ou null se o registro não for encontrado.
    
    boolean delete(int id): Este método deleta um registro do arquivo com o ID fornecido. Ele retorna true se o registro foi deletado com sucesso, ou false se o registro não foi encontrado.
    
    long getenderecoid(int id): Este é um método privado que retorna o endereço de um registro com o ID fornecido. Ele retorna -1 se o registro não for encontrado.
    
    void close(): Este método fecha o arquivo. Ele é chamado quando o objeto Arquivo não é mais necessário.

- Main:
  - ```java
    public class Main
    
    main(String[] args): Este método é o método principal do programa, onde é feita a leitura dos arquivos de entrada e a execução das operações de inclusão, alteração, remoção e busca de filmess.

### 4. Checklist ###

- A inclusão de um filme acrescenta os termos do seu título à lista invertida? Sim, a inclusão de um filme acrescenta os termos do seu título à lista invertida.
- A alteração de um filme modifica a lista invertida removendo ou acrescentando termos do título? Sim, a alteração de um filme modifica a lista invertida removendo e acrescentando termos do título.
- A remoção de um filme gera a remoção dos termos do seu título na lista invertida? Sim, a remoção de um filme gera a remoção dos termos do seu título na lista invertida.
- Há uma busca por palavras que retorna os filmes que possuam essas palavras? Sim, há uma busca por palavras que retorna os filmes que possuam essas palavras.
- Essa busca pode ser feita com mais de uma palavra? Sim, essa busca pode ser feita com mais de uma palavra.
- As stop words foram removidas de todo o processo? Sim, as stop words foram removidas de todo o processo.
- Que modificação, se alguma, você fez para além dos requisitos mínimos desta tarefa? Criação de um método para remover acentos e caracteres especiais, além da criação de um arquivo contendo todas as stop words para facilitar o processo do trabalho.
- O trabalho está funcionando corretamente? Sim, o trabalho está funcionando corretamente.
- O trabalho está completo? Sim, o trabalho está completo.
- O trabalho é original e não a cópia de um trabalho de um colega? Sim, o trabalho é original e desenvolvido por Lívia Câmara, Sophia Carrazza e Yan Sabarense.
