package br.com.generation.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/*
 * 3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
 * */
public class Produtos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		int i;
		
		String estoque0 = "Nike Air Max";
		String estoque1 = "Adidas";
		String estoque2 = "Nike Shox";
		String estoque3 = "Jordan";
		String estoque4 = "Puma Disk";
		
		ArrayList<String> estoques = new ArrayList<>();
		
		estoques.add(estoque0);
		estoques.add(estoque1);
		estoques.add(estoque2);
		estoques.add(estoque3);
		estoques.add(estoque4);
		
		for(i = 0; i < estoques.size(); i++) {
			System.out.println("Esoque da Loja "+ (i + 1) + "° " + estoques.get(i));
			
		} 
		
		i = ler.nextInt();
		estoques.remove(i-1);
		
		System.out.println("Produto Disponiveis no Momento São: ");
		Collections.sort(estoques);
		System.out.println(estoques);
		
		
	}

}
