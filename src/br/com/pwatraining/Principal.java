package br.com.pwatraining;

/*==================================================================================
********************* Projeto Comandos Básicos e Tabuada   *************************
************************Projeto Conceitual e Educativo *****************************
************************************************************************************
***************** Autor: Anderson Fábio da Silva - PWA TRAINING ********************
*##################################################################################*
* Aprendizado : Entrada, Processamento e Saída                                     *
* Data        : 06/01/2022                                                         *
* Site        : http://www.pwatraining.com.br                                      *
* Facebook    : https://www.facebook.com/ead.pwatraining                           *
* Instagram   : https://www.instagram.com/pwatraining                              *
* Youtube     : https://www.youtube.com/@pwatraining                               *
* WhatsApp    : https://wa.me/5513991119722                                        *
* Sala de Aula: https://classroom.google.com/c/NTQwOTgxNzQ4MzYx?cjc=cbdiphq        *
* 																				   *
* Autorizado a Cópia e Distribuição Mantendo Este Quadro Informativo               *
*==================================================================================*/

//Início da Importação de Recursos
import java.util.Scanner;
//Fim da Importação de Recursos

// https://classroom.google.com/c/NTQwOTgxNzQ4MzYx?cjc=cbdiphq

//https://youtu.be/KGEP0gii6KU

public class Principal {

	public static void main(String[] args) {
		// Início do seu espaço de trabalho

		// Criando um input
		Scanner entradaDados = new Scanner(System.in);
		
		// Definindo a tabuada desejada
		System.out.print("Informe a Tabuada Desejada: ");
		int tabuada = entradaDados.nextInt();
		System.out.println("");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(tabuada+" * "+i+" = "+tabuada*i);
		}
		
		entradaDados.close();

		// Final do seu espaço de trabalho
	}
}

/*
* Teoria
* 
* Identação
* ;
* {}
* Comentários
* 
* 
* */

/*  
	FERRAMENTAS
	
	Como armazeno uma informação na memória
		1 - Para textos		==> String 	nomeDesejado = "Conteudo Desejado";
		2 - Para valores	==>	Float	nomeDesejado = 9f;
	 	
	Como imprimir uma mensagem
		System.out.print("Mensagem a Ser Impressa");  

	Como Solicitar Informação ao Usuário
		1 - Importar Recurso  			==> import java.util.Scanner;
		2 - Criar Recurso	  			==> Scanner input = new Scanner(System.in);
		3 - Informar o Recurso Desejado	==>	System.out.print("Informe seu Nome: ");
		4 - Acionar Recurso				==> String nome = input.nextLine();
		5 - Destruir Recurso			==> input.close();

	Como crio uma lista de informações
		1 - Importar Recurso			==> import java.util.ArrayList;
		2 - Importar Recurso			==>	import java.util.List;
		3 - Criar Recurso				==> List<TipodeInformacao> nomeLista = new ArrayList<TipoInformacao>();
		4 - Adicionar Valores a Lista	==> nomeLista.add("Valor Desejado");

	Condicional
		int x = 10;
		if(x == 10) {
			System.out.print("Igual a 10");
		} else {
			System.out.print("Diferente de 10");
		}
		
		Em portugues ficaria
		
		se(x == 10) {
			System.out.print("Igual a 10");
		} senão {
			System.out.print("Diferente de 10");
		}


	Como construo um bloco de repetição
	
		POR LISTA
		
		1 - Informar Inicio da Repetição==> for(TipoLista nomeItem : nomeLista)
		2 - Exemplo imprimir uma lista:
		for(String item : lista) {
			System.out.print(item);
		}
		
		POR INCREMENTO
		1 - Informar os parametros, inicio, termino e avanço
		  Ex: for(int i = 1; i <= 10; i++) {
				System.out.print("Estou na posição: "+i);
		  }
		  
		INDEFINIDO
		
		int item = 1;
		while(true) {
			if(item > 10) {
				break;
			} 
			System.out.print("Continuo na repetição");	
		}

*/


