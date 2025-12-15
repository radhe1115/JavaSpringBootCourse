class Ternary{
	public static void main(String[] args){
	//Giving conditional response for having meal or not using ternary Operator
	char hadMeal ='Y';
	String output = "";

	//if (hadMeal =='Y')
	//System.out.println("Good, Stay Healthy!");
	//else
	//System.out.println("Go and eat Something");
	
	output = hadMeal =='Y'?"Good, Stay Healthy!":"Go and eat Something";
	System.out.println(output);
	}
}