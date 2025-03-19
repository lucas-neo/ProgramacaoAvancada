package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        Set<Produto> produtos = new HashSet<>();

        do {
            System.out.println("\n---Menu---");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto por código");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Cadastrando produto...");
                    System.out.print("Digite o código do produto: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();

                    Produto novoProduto = new Produto(codigo, nome, preco);

                    if (produtos.contains(novoProduto)) {
                        System.out.println("Erro: Já existe um produto com esse código!");
                    } else {
                        produtos.add(novoProduto);
                        System.out.println("Produto cadastrado com sucesso!");
                    }
                    break;

                case 2:
                    System.out.println("Buscando produto...");
                    System.out.print("Qual o código do produto? ");
                    codigo = scanner.nextInt();

                    Produto produtoBuscado = null;
                    for (Produto p : produtos) {
                        if (p.getCodigo() == codigo) {
                            produtoBuscado = p;
                            break;
                        }
                    }

                    if (produtoBuscado != null) {
                        System.out.println("Produto encontrado! " + produtoBuscado);
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 3);

        scanner.close();
    }
}
