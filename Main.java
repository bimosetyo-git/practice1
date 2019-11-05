import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Version 1.0");
		System.out.println("");
		for (int i=1;i<=10;i++) {
			for(int j=10;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			for(int l=1;l<=i-1;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
