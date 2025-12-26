class Operators{
	
	/*
	* Relational operators in java
	* Example (a=10, b=5)
	* Equal to 		--> a==b 	false
	* Not equal to		--> a != b	true
	* Greater than		--> a > b	true
	* Less than		--> a < b	false
	* Greater or equal	--> a >= b	true
	* Less or equal		--> a <= b	false
	*/

	/*
	* logical operators in java
	* logical AND 	--> &&
	* logical OR 	--> ||
	* logical NOT 	--> !
	*/
	public static void main(String[] args){
		int x = 6;
		int y = 7;
		
	boolean result = x>y && x<=y;
	System.out.println(!result);

	int a = 20,b = 10;
         
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(b*a));
        System.out.println("Division: "+(a/b));
        System.out.println("Is a greater than b? "+(a>b));
        System.out.println("Is a > b and b > 0? "+(a>b && b>0));
		
	}
}
