package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int quantity;
		Character gender;
		double paymentValue = 0.00;
		Product Product = new Product();

		List<Product> conta = new ArrayList<>();

		System.out.println("Sexo: (M/F)");
		gender = sc.next().charAt(0);
		System.out.println("quantity de cervejas :");
		quantity = sc.nextInt();
		conta.add(new Product("cerveja", 5.00, quantity));
		System.out.println("quantity de refrigerantes :");
		quantity = sc.nextInt();
		conta.add(new Product("refrigerante", 3.00, quantity));
		System.out.println("quantity de Espetinhos :");
		quantity = sc.nextInt();
		conta.add(new Product("Espetinho", 7.00, quantity));

		for (Product i : conta) {
			paymentValue += i.getPrice() * i.getQuantity();
		}

		System.out.println("RELATORIO :");
		System.out.print("Consumo R$:");
		System.out.printf("%.2f\n", paymentValue);

		if (paymentValue > 30) {
			System.out.println("Isento de Couvert");
		} else {
			paymentValue += 4.00;
			System.out.println("Couvert  R$: 4,00");
		}

		paymentValue += Product.ticketValue(gender);

		System.out.print("Ingresso R$:");
		System.out.printf("%.2f\n", Product.ticketValue(gender));
		System.out.println();

		System.out.print("Valor a pagar R$: ");
		System.out.printf("%.2f\n", paymentValue);

		sc.close();
	}
}
