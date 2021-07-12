package lt.lhu.unit05_02.main;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		customer mas[] = new customer[3];

		for (int i = 0; i < mas.length; i++) {
			customer n = new customer();
			mas[i] = n;

			Scanner sc = new Scanner(System.in);

			System.out.println("Введите данные следующего клиента.");

			System.out.print("Введите имя: ");
			n.setName(sc.nextLine());

			System.out.print("Введите фамилию: ");
			n.setSurname(sc.nextLine());

			System.out.print("Введите отчество: ");
			n.setMiddle_name(sc.nextLine());

			System.out.print("Введите ID: ");
			n.setID(sc.nextLine());

			System.out.print("Введите адрес: ");
			n.setAddress(sc.nextLine());

			System.out.print("Введите номер карты: ");
			n.setCard_number(sc.nextLine());

			System.out.print("Введите банковский счет: ");
			n.setBank_account(sc.nextLine());

			System.out.println();

		}

		Arrays.sort(mas);

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i].getSurname() + " " + mas[i].getName() + " " + mas[i].getMiddle_name() + "\n");

		}
		
		
	}
}
