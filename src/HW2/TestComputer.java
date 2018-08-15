package HW2;

public class TestComputer {

	public static void main(String[] args) {
		Computer myComputer = new Computer();
		myComputer.Brand = ("Apple");
		myComputer.Model = ("macBook Air");
		myComputer.OperatingSystem = ("macOS High Sierra");
		myComputer.Processor = ("Intel Core i7");
		myComputer.Color = ("Silver");
		
		myComputer.DisplayComputerConfiguration();
		myComputer.DisplayColor();
		
		System.out.println();
		
	}

	
}
