package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
    Scanner sc = new Scanner(System.in);

    Product product = new Product();
    System.out.println("-----INSIRA OS DADOS DO PRODUTO-----");
    System.out.print("NOME: ");
    product.name = sc.nextLine();
    System.out.print("VALOR: ");
    product.price = sc.nextDouble();
    System.out.print("QUANTIDADE EM ESTOQUE: ");
    product.quantity = sc.nextInt();

    System.out.println();
    System.out.println("DADOS DO PRODUTO: " + product);

    System.out.println();
    System.out.println("QUANTIDADE PARA ADICIONAR NO ESTOQUE: ");
    int quantity = sc.nextInt();
    product.addProducts(quantity);

    System.out.println();
    System.out.println("-----DADOS ATUALIZADOS-----" + product);

    System.out.println();
    System.out.println("QUANTIDADE PARA REMOVER DO ESTOQUE: ");
    quantity = sc.nextInt();
    product.removeProducts(quantity);

    System.out.println();
    System.out.println("-----DADOS ATUALIZADOS-----" + product);

    sc.close();
    }
}
