import java.util.Scanner;

public abstract class Shape {		//배열의 활용법을 모르겠습니다..
	public int number=0;
	
	public  void draw() {
		
	}
	public void draw(int n) {
		
	}
	public void draw(int x, int y) {
		
	}
	
	public static void main(String[] args) {
		int numberofShapes;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("도형의 개수: ");
		numberofShapes = scan.nextInt();
		
		Shape array = new Shape(numberofShapes); 
		
	}
}

class Point extends Shape{
	public void draw() {
		System.out.println("*");
	}
}

abstract class  AbstLine extends Shape{
	public void draw(int n) {
		this.drawLine(n);
	}
	public  void drawLine(int n) {
	}
}

class Rectangle extends Shape{
	public void draw(int x, int y) {
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				System.out.print("*");
				
			}
			System.out.print("\n");
		}
	}
}

class HorzLine extends AbstLine{
	public void draw() {
		
	}
	public void drawLine(int n) {
		for(int i=0;i<n;i++) {
			System.out.print("-");
		}
	}
}

class vertLine extends AbstLine{
	public void draw() {
		
	}
	public void drawLine(int n) {
		for(int i=0;i<n;i++) {
			System.out.print("|\n|\n\n");
		}
	}
}