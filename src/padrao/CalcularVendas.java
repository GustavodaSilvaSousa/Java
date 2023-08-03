package padrao;

import java.util.Scanner;

public class CalcularVendas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int produtoNumber;
		double preco, total = 0;
		do {
			System.out.printf("Digite o produto ou -1 para sair: %nproduto 1 = 2,98%nproduto 2 = 4,50%n"
					+ "produto 3 = 9,98%nproduto 4 = 4,49%nproduto 5 = 6,87%n");
			produtoNumber = input.nextInt();
			if(produtoNumber == -1)
				break;
			System.out.print("Quantidade vendida: ");
			int qtdVendida = input.nextInt();
			switch (produtoNumber) {

			case 1:
				preco = 2.98;
				total += preco * qtdVendida;
				break;
			case 2:
				preco = 4.5;
				total += preco * qtdVendida;
				break;
			case 3:
				preco = 9.98;
				total += preco * qtdVendida;
				break;
			case 4:
				preco = 4.49;
				total += preco * qtdVendida;
				break;
			case 5:
				preco = 6.87;
				total += preco * qtdVendida;
				break;
			default:
				System.out.println("Número inválido!");

			}
		} while (produtoNumber != -1);

		System.out.printf("Valor total de produtos vendidos é: %.2f", total);

		input.close();
	}
}
