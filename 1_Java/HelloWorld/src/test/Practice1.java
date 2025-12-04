package test;


	
import java.util.Scanner;
	
public class Practice1{
	public static void main(String[] args) {
		
		System.out.print("이름:");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		/*
		System.out.print("Hello,");
		System.out.print(name);
		System.out.print("!");
		*/
		System.out.println("Hello," + name + "!");
		
		
		
	}
}
