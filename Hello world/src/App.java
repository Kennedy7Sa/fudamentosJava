import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in); //receber input do teclado 
     
    List<String> nomes  = new ArrayList<>(); //declarando uma lista de strings 
    nomes.add("kennedy");  // adcionando valores na lista 
    nomes.add("Sara"); 
    nomes.add("Laura"); 
    
    while (true) {
        
        System.out.println("Escolha uma opção "); //printando na tela 
        System.out.println("C para cadastrar um novo nome ");
        System.out.println("L para listar todos ");
        System.out.println("A para atualizar um registro ");
        System.out.println("E para excluir um registro ");
        System.out.println("S para sair ");
        String opcaoDigitada = scanner.nextLine();

        
        if (opcaoDigitada.equalsIgnoreCase("c")){ //comparando o valor da string com o que o usuario digitou ignorando maiusculas 
            System.out.println("********Novo registro**********");
            System.out.println("Digite um nome ");
            String nomeDigitado = scanner.nextLine();
        
            nomes.add(nomeDigitado);
            System.out.println(nomes);
            System.out.println("****************************");
        }
        
        else if (opcaoDigitada.equalsIgnoreCase("l") ){
            System.out.println("************Listando*************");
            
            for (String item : nomes) { //iterando a lista e pegando os nomes 
                
                System.out.println(item);
            }
           
            System.out.println("****************************");
        }
        else if (opcaoDigitada.equalsIgnoreCase("a"))
        {
            System.out.println("Digite o nome a ser atualizado");
            String nomeAntigo = scanner.nextLine();
            
            if(nomes.contains(nomeAntigo)){ // verifica se existe o item na lista 
                System.out.println("Digite o novo nome");
                String novoNome = scanner.nextLine();

                int indice = nomes.indexOf(nomeAntigo); //pega o indice da lista 
                nomes.set(indice, novoNome);

                for (String item : nomes) {
                    System.out.println(item);
                }
            }
            else{
                System.out.println("Nome não encontrado");
            }
        }

        else if(opcaoDigitada.equalsIgnoreCase("e")){
            System.out.println("**********Excluindo registro**********");
            System.out.println(nomes);
            System.out.println("Digite o nome a ser excluido");
            String nomeExcluir = scanner.nextLine();
            if(nomes.contains(nomeExcluir)){
            int indice = nomes.indexOf(nomeExcluir);
            nomes.remove(indice);
            System.out.println("********Lista Atualizada********");   
            for (String item : nomes) {
                    System.out.println(item);
                }
            }else{
                System.err.println("Nome não encontrado");
            }
        }

       else if(opcaoDigitada.equalsIgnoreCase("s" ) ){
        System.out.println("Saindo do programa");
        break;
       }
    }
    
     

        
        





    }
}
