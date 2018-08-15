package HW2;

public class Computer {
    
	String Brand = "Apple";
	String Model = "MacBook Air";
	String OperatingSystem = "macOS High Sierra";
	String Processor = "Intel core i7";
	String Color = "Silver";
	
	public void DisplayComputerConfiguration() {
		System.out.println("This computer's configuration is "
	+ Brand + " "+ Model +" "+ OperatingSystem +" "+Processor);
       }
	public void DisplayColor() {
		System.out.println("and the color is " + Color);
	}

}
