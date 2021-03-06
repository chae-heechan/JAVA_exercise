/*
	작성자: 20174046 채희찬
	작성일: 2020.09.14.
	프로그램명: JAVA프로그래밍 예제 2-4
*/
import java.util.Scanner;		//scanner 사용하기 위해 import

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신여부를 빈칸으로 분리하여 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("이름은 " + name + ", ");
		
		String city = scanner.next();
		System.out.print("도시는 " + city + ", ");
		
		int age = scanner.nextInt();
		System.out.print("나이는 " + age + "살, ");
		
		double weight = scanner.nextDouble();
		System.out.print("체중은 " + weight + "kg, ");
		
		boolean issingle = scanner.nextBoolean();
		System.out.println("독신 여부는 " + issingle + "입니다.");
		
		scanner.close();		//scanner 닫기
	}
}
