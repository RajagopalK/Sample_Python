package main.java;

public class Main {

	public int a, b, c;

	public Main(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int sum() {
		return a + b + c;
	}

	public int multiply() {
		return a * b * c;
	}

	public int divide() {
		Main m1 = new Main(a, b, c);
		return m1.sum() % 10;
	}

	public static void main(String[] args) {
		System.out.println("Main_Class");
		Main m = new Main(2, 3, 6);
		System.out.println(m.sum());
		System.out.println(m.multiply());
		System.out.println(m.divide());
	}

}
