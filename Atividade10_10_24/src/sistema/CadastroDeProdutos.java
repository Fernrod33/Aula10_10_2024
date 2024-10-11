package sistema;

import java.util.ArrayList;
import java.util.Scanner;
import objetos.Produto;

public class CadastroDeProdutos {
	
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Produto> lista;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bem vindo ao sistema!");
		boolean continuar = true;
		while (continuar) {
			exibirMenu();
			int escolha = scan.nextInt();
			switch (escolha) {
				case 1: {
					cadastrarProduto();
					break;
				}
				case 2: {
					for (Produto novoProduto : lista) {
						System.out.println(novoProduto.toString());
					}
					break;
				}
				case 3: {
					continuar = false;
					System.out.println("Saindo do sistema!");
					return;
				}
				default: {
					System.out.println("Opcao incorreta, tente novamente");
				}
			}
		}
	}
	
	static void cadastrarProduto() {
		System.out.println("Digite o nome do produto:");
		String nome = scan.next();
		System.out.println("Digite o preco do produto:");
		double preco = scan.nextDouble();
		System.out.println("Digite a quantidade do produto:");
		int quantidade = scan.nextInt();
		Produto novoProduto = new Produto(nome, preco, quantidade);
		lista.add(novoProduto);
		System.out.println("Produto cadastrado com sucesso!");
	}
	
	static void exibirMenu() {
		System.out.println("Digite a opcao desejada:\n"
				+ "1. Cadastrar novo produto.\n"
				+ "2. Listar produtos cadastrados.\n"
				+ "3. Sair do sistema.");
	}
	
}
