package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class mainRooms {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rooms[] vc = new Rooms[10];
		try {
			System.out.println("How many rooms will be rented? ");
			int Room = sc.nextInt();

			for (int i = 0; i < Room; i++) {
				System.out.println("Rent #" + (i + 1));
				sc.nextLine();
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Email: ");
				String email = sc.nextLine();
				System.out.println("Room: ");
				int room = sc.nextInt();
				vc[i] = new Rooms(name, email, room);
			}
			if (vc.length > 0) {
				System.out.println("Busy rooms:");
				for (int i = 0; i < vc.length; i++) {
					if (vc[i] != null) {
						System.out.println(vc[i].getRoom() + ": " + vc[i].getName() + ", " + vc[i].getEmail());
					}
				}
			} else {
				System.out.println("We don't have occupied rooms.");
			}

			sc.close();
		} catch (Exception e) {
			System.out.println("invalid data");
		}

	}

}
