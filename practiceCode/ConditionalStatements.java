class ConditionalStatements {
	public static void main(String[] args) {

		byte a = 10, b = 20;
		if (a < b && b > 0) {
			System.out.println("condition is true");
			System.out.println("Thank You !");
		} else {
			System.out.println("condition is false");
		}
			System.out.println("=======================================");

		//check the greater number between a, b and c
		int c = 15;
		if (a > b && a > c) {
			System.out.println("A is Greater");
			System.out.println("Thank You !");
		} else if(b>c) {
			System.out.println("B is Greater");
			System.out.println("Thank You !");		
		}else{
			System.out.println("C is Greater");
			System.out.println("Thank You !");}

	}

}