package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Produto;
import java.util.Scanner;

//Responsável por interagir com o usuário
public class Terminal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do produto");
        double valor = entrada.nextDouble();

        System.out.println("Digite o código do produto");
        int codigo = entrada.nextInt();

        System.out.println("O produto está disponivel? (true/false");
        boolean disponivel = entrada.hasNextBoolean();

        Produto product = new Produto();

        product.nome = "";
        product.preco = valor;
        product.codigo = codigo;
        product.disponivel = disponivel;

        System.out.println(product.nome);










        //Ler as informações do Produto (sem fornecedor por enquanto)

        //Instanciar a classe produto

    //Colocar as informações no objeto produto

    //Exibir as informações do objeto produto







         }
}
