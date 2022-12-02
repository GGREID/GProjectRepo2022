package general;

import java.util.InputMismatchException;
import java.util.Scanner;

public class myVal {
	public static void main(String[] args) {

	}

	public static Scanner key = new Scanner(System.in);

	public static int validInt(String msg, int min, int max) {
		int num = 0;
		boolean ok;
		do {
			try {
				ok = true;
				My.p(msg);
				num = key.nextInt();
				key.nextLine();
				if (num < min || num > max) {
					ok = false;
					My.p(String.format("\n\tError: Range is %d - %d Please re-enter.", min, max));
				}
			} catch (InputMismatchException e) {
				My.p("\n\tError:  Illegal character(s) in input - Please re-enter.");
				key.nextLine();
				ok = false;
			}
		} while (!ok);
		return num;
	}
	
	
	public static int validInt(String msg) {
		int num = 0;
		boolean ok;
		do {
			try {
				ok = true;
				My.p(msg);
				num = key.nextInt();
				key.nextLine();

			} catch (InputMismatchException e) {
				My.p("\n\tError:  Illegal character(s) in input - Please re-enter.");
				key.nextLine();
				ok = false;
			}
		} while (!ok);
		return num;
	}

}
