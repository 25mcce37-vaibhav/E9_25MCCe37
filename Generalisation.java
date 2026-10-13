package Q_1_Demo;
import java.util.*;
import java.math.*;

class Vehicle{
	protected String brand;
}

class Car1 extends Vehicle{
	private int numberOfDoors;
}

interface Drivable{
	void accelerate();
}

//Realization

class Tesla implements Drivable{
	@Override 
	public void accelerate() {
		System.out.println("Accelerating silently.... ");
	}
}

class Engine{
	private String type;
	public Engine(String type) {this.type = type;}
}

class Car{
	private Engine engine;
	
	public Car() {
		//engine is created and owned strictly by this Car 
		//If this car instance is garbage collected , then Engine dies with it 
		this.engine = new Engine("V8");
	}
}

class Wheel{
	private int size;
	public Wheel(int size) {this.size = size;}
}

class Bicycle{
	
	public Wheel frontWheel; 
	public Bicycle(Wheel frontWheel){
		this.frontWheel = frontWheel;
	}
}


class Doctor{
	private String name;
}

class Patient{
	//Association : A Patient is associated with a doctor ,
	//but neither owns or controls the structural life cycle of others 
	private Doctor assignedDoctor;
}

class FormatTool{
	public String cleanText(String input) {return input.trim();}
}

class Document{
	private String text;
	public void printFormatted(FormatTool tool) {
		String clean = tool.cleanText(this.text);
		System.out.println(clean);
	}
}

class Invoice{
	//invoice details
}

class InvoiceFactory{
	public Invoice createInvoice() {
		return new Invoice();
	}
}
class MathUtils{
	public static int square(int x) {
		return x*x;
	}
}

class Calculator{
	public void printSquare(int number) {
			int result = MathUtils.square(number);
			System.out.println(result);
	}
}


class ConfigurationReader{
	public ConfigurationReader() {
		// reads config files 
	}
}

class Application {
	public Application() {
		ConfigurationReader reader = new ConfigurationReader();
	}
}

public class Generalisation {

}
