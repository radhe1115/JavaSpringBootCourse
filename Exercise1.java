// TODO: Create an class called Employee
class Employee{
   private String name;
   private double salary;
   
   public Employee(){
       
   }
   public Employee(String name, double salary){
       this.name =name;
       this.salary =salary;
   }
   
   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name = name;
   }
   
   public double getSalary(){
       return salary;
   }
   public void setSalary(double salary){
       this.salary = salary;
   }
   
   public String getDetails(){
       	return "Name: "+this.name+", "+"Salary: "+this.salary;
   }
}
// TODO: Create a class Manager that:
// - Extends Employee
class Manager extends Employee{
    private String department;
    
    public Manager(String name, double salary, String department){
        super(name,salary);
        this.department=department;
    }
    
    public String getDetails(){
        return super.getDetails()+", Department: "+this.department;
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        // TODO: Create Employee and Manager objects
        // TODO: Print their details using getDetails()
        
        Employee employee= new Employee("Alice",50000.0);
        Employee manager =new Manager("Bob",80000.0,"IT");
	
	System.out.println(employee.getDetails());
	System.out.println(manager.getDetails());
    }
}
