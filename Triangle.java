import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = keyboard.nextInt();
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n-i-1; k++) {
				System.out.print	(" ");
			}
			for (int j = 0; j < 2*i +1; j++) {
				System.out.print("*");
			}
			for (int k = 0; k < n-i-1; k++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
