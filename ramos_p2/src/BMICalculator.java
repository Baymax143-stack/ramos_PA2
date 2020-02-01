import java.util.Scanner;

public class BMICalculator{
	//Global variables the class must store for the user
	private static String option;
	private static double weight;
	private static double height;
	private static double bodyMassIndex;
	private static String category;
	
	/*Will first read in data
	 * Uses a main public function: readUserData
	 * Utilizes subfunctions: readUnitType, readMeasurementData
	 * readMeasurementData calls readMetricData or readImperialData, setWeight, setHeight
	 */
	
	//Sets unit type, chosen by user
	private static void readUnitType()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Body Mass Index Calculator.");
		System.out.println("You will have the option to calculate your BMI using the imperial system (A) or using the metric system (B).");
		System.out.print("Please enter your option: ");
		BMICalculator.option = input.nextLine();
		System.out.println();
	}
	
	//Sets weight and sets height respectively
	private static void setWeight(double weightValue)
	{BMICalculator.weight = weightValue;}
	private static void setHeight(double heightValue)
	{BMICalculator.height = heightValue;}
	
	//Takes in values for weight and height, making sure values are positive
	private static void readMetricData()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your weight in kilograms: ");
		double w = input.nextDouble();
		if(w < 0)
		{
			while(w < 0)
			{
				System.out.print("Please enter a positive value only: ");
				w = input.nextDouble();
			}
		}
		setWeight(w);
		
		System.out.print("Please enter your height in meters: ");
		double h = input.nextDouble();
		if(h < 0)
		{
			while(h < 0)
			{
				System.out.print("Please enter a positive value only: ");
				h = input.nextDouble();
			}
		}
		setHeight(h);
	}
	private static void readImperialData()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your weight in pounds: ");
		double w = input.nextDouble();
		if(w < 0)
		{
			while(w < 0)
			{
				System.out.print("Please enter a positive value only: ");
				w = input.nextDouble();
			}
		}
		setWeight(w);
		
		System.out.print("Please enter your height in inches: ");
		double h = input.nextDouble();
		if(h < 0)
		{
			while(h < 0)
			{
				System.out.print("Please enter a positive value only: ");
				h = input.nextDouble();
			}
		}
		setHeight(h);
	}
	
	//Called to conduct appropriate collection of data
	private static void readMeasurementData()
	{
		if(BMICalculator.option.compareTo("A") == 0) //entering weight and height in imperial system
		{
			readImperialData();
		}
		else //entering weight and height in metric system
		{
			readMetricData();
		}
	}
	
	//Called to read all data entered by user
	public void readUserData()
	{
		readUnitType();
		readMeasurementData();
	}
	
	
	/* Will next calculate BMI and BMI category
	 * Uses a main function: calculateBmi
	 * Utilizes subfunctions: calculateBmiCategory
	 * calculateBmi will call getWeight and getHeight
	 */
	//Assigns category based on BMI
	private static void calculateBmiCategory()
	{
		if(BMICalculator.bodyMassIndex < 18.5)
		{BMICalculator.category = "Underweight";}
		else if(BMICalculator.bodyMassIndex >= 18.5 && BMICalculator.bodyMassIndex <= 24.9)
		{BMICalculator.category = "Normal Weight";}
		else if(BMICalculator.bodyMassIndex >= 25 && BMICalculator.bodyMassIndex <= 29.9)
		{BMICalculator.category = "Overweight";}
		else
		{BMICalculator.category = "Obese";}
	}
	
	//Returns weight and height respectively
	public static double getWeight()
	{return BMICalculator.weight;}
	public static double getHeight()
	{return BMICalculator.height;}
	
	//Calculates BMI based on units and calls to assign category
	public void calculateBmi()
	{
		if(BMICalculator.option.compareTo("A") == 0)
		{BMICalculator.bodyMassIndex = (703 * BMICalculator.weight)  / (BMICalculator.height * BMICalculator.height);}
		else if(BMICalculator.option.compareTo("B") == 0)
		{BMICalculator.bodyMassIndex = BMICalculator.weight / (BMICalculator.height * BMICalculator.height);}
		
		calculateBmiCategory();
	}
	
	
	/* Will finally display BMI results
	 * Uses a main public function: displayBmi
	 * Utilizes subfunctions: getBmi and getBmiCategory
	 */
	//Returns BMI and BMI Category respectively
	public static double getBmi()
	{return BMICalculator.bodyMassIndex;}
	public static String getBmiCategory()
	{return BMICalculator.category;}
	
	//Prints out results
	public void displayBmi()
	{
		System.out.printf("%nYour BMI value is: %.2f", getBmi());
		System.out.printf("%nYour BMI Category: %s", getBmiCategory());
	}

	/*
	 * 
	 */
	public static void main(String[] args) {
		//BMICalculator app = new BMICalculator();
		//app.readUserData();
		//app.calculateBmi();
		//app.displayBmi();
	}
}
