package br.com.fiap.loja.model;

public class Produto {

   public double preco;
   public int codigo;
   public String nome;
   public boolean disponivel;
   public Fornecedor fornecedor;


   //Metodo
   public double calcularDesconto(){
      double desconto = preco * 0.2;
      return desconto;

   }

   public void aumentarPreco(double porcentagem){
      preco += preco *  porcentagem /100;


   }
   //Criar um metodo para calcular o valor total da compra
   //Dado a quantidade, calcular o valor da compra


}
