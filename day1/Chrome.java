package week1.day1;

public class Chrome {
	public void getName () {
		System.out.println("Browser");
	}
	public void printName () {
		System.out.println("Chrome");
	}

	public static void main(String[] args) {
		Chrome operation = new Chrome();
		operation.getName();
		operation.printName();
		System.out.println("This is Google Chrome");

	}

}
