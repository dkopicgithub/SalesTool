package dk.demo.salestool;

public class SalesData {
	
	int data[] = { 0, 4, 42 };

	public void display() {
		System.out.println("Data: ");
		for (int i:data) {
			System.out.println("Next value: " + i);
			System.out.println("This is all values");
		}
	}

}
