public class Exercise {
    public static void main(String[] args) {
        
        double num1 = 7;
        double num2 = 3;
        char operator = '+';
        String again = "y"; 

        // TODO: Run the loop while 'again' equals 'y'
        
        // TODO: Use predefined numbers num1 = 7 and num2 = 3
        
        // TODO: Use predefined operator '+'
        
        // TODO: Perform the calculation based on the operator using if-else conditions
        
        // TODO: Check if num2 is zero before performing division and display a warning if true
        
        // TODO: Set 'again' to 'n' to stop the loop after one execution
        
        // TODO: Display a thank you message after the loop ends
        double result=0.0;
        
        while(again=="y"){
            if(operator=='+'){
                result=num1+num2;
                again ="n";
            }else if(operator=='-'){
                result=num1-num2;
                again ="n";
            }else if(operator=='*'){
                result=num1*num2;
                again ="n";
            }else if(operator=='/'){
                if(num2==0){
                System.out.println("Cannot divide by zero.");
                }else{
                result=num1/num2;
                }
                again ="n";
            }
        } System.out.println("Result: "+result);
        System.out.println("Thank you for using the calculator.");
        
    }
}
