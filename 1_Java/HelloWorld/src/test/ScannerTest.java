package test;

//1.포함시키기!
import java.util.Scanner;
	
	
public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아무 단어");
		
		String str = sc.nextLine();
		
		System.out.println(str);
		
		sc.close();		//생략 가능함!
	}
	
}
