package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Fornecedor;
import br.com.fiap.loja.model.Produto;
import java.util.Scanner;

//Responsável por interagir com o usuário
public class Terminal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Ler as informações do produto
        System.out.println("Digite o preço do produto");
        double preco = entrada.nextDouble();

        System.out.println("Digite o nome do produto");
        String nomeProduto = entrada.next() + entrada.nextLine();

        System.out.println("Digite o código do produto");
        int codigo = entrada.nextInt();

        System.out.println("O produto está disponivel? (true/false");
        boolean disponivel = entrada.nextBoolean();

        //ler os dados do fornecedor
        System.out.println("Digite o cnpj do fornecedor");
        String nomeFornecedor = entrada.next() + entrada.nextLine();

        System.out.println("Digite o nome do fornecedor");
        String numeroCnpj = entrada.next() + entrada.nextLine();


        //Instanciar a classe produto
        Produto product = new Produto();

        //Instanciar o fornecedor
        Fornecedor f = new Fornecedor();

        //Colocar as informações do fornecedor
        f.cnpj = numeroCnpj;
        f.nome = nomeFornecedor;

        //Exibir as informções do fornecedor
        product.fornecedor = f;


        //Colocar as informações do objeto produto
        product.nome = nomeProduto;
        product.preco = preco ;
        product.codigo = codigo;
        product.disponivel = disponivel;

        //Exibir as informções do objeto produto
        System.out.println("nome: " + product.nome);
        System.out.println("preço: " + product.preco);
        System.out.println("produto: " + product.codigo);
        System.out.println("disponivel: " + product.disponivel);

        //Exibir as informções do objeto do fornecedor
        System.out.println("cnpj: " + product.fornecedor.cnpj);
        System.out.println("nome fornecedor: " + product.fornecedor.nome);



        //Metodo
        double promocao = product.calcularDesconto();
        System.out.println("Desconto: " + promocao);

        System.out.println("Qual a % de aumento");
        double porcentagem = entrada.nextDouble();

        product.aumentarPreco(porcentagem);

        System.out.println("Novo preco: " + product.preco);





         }
}
