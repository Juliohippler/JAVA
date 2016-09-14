/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria;


public class Livro {
    private String titulo;
    private Double preco;
    private Integer ano;
    private String autor;
    
   
    public Livro (String autor, String titulo, Double preco, Integer ano){
        this.titulo = titulo;
        this.preco = preco;
        this.autor = autor;
        this.ano = ano;
    }
   
     
    //TESTE
    public static void main(String[] args){
        Livro l1 = new Livro("Daniel Defoe", "Robinson Crusoe", 15.50, 1719);

        Livro l2 = new Livro("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
 
        Livro l3 = new Livro("Pat Conroy", "Beach Music", 9.50, 1996);
        
        System.out.println(l1.toString());
    }
}
