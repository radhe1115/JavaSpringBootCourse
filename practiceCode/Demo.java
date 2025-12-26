 class A extends Thread{ // if a Class is made final then we can not inherit the class	

public A(){
super();
System.out.println("in A");
}
public A(String sr){
super();
System.out.println("in A, String as Argument");
}


}
class B extends A{ 
// final public B(){ -- this will show a compilation Error as we can not make a constructor final
 public B(){ 
System.out.println("in B");

}
public B(String sr){
this();
System.out.println("in b, String as Argument");
}

}

class Demo{
int age =17;

public static void main(String [] ags){
//A obj = new B("radhe"); //upcasting

//A object =new B();
//B object1 =(B) (object); //this is called Downcasting

//autoboxing and Unboxing are part of Wrapper classes in java
//Wrapper classes provides a way to use primitive data types (int, boolean, etc..) as objects
//Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
//Unboxing is the reverse process where the object wrapper class is converted back to its primitive type    
Integer i =10;//Autoboxing
int j =i;//Unboxing

//encapsulation in java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit
//In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class
//If a class is made encapsulated, then it is known as a "Java Bean"  

//Abstraction in java is a process of hiding the implementation details and showing only functionality to the user
//In other words, the user will have the information on what the object does instead of how it does it it
//Abstraction can be achieved with either abstract classes or interfaces (to achieve 100% abstraction)
//Abstract class is a class that is declared with the abstract keyword    

//Polymorphism in java is a concept by which we can perform a single action in different ways
//Polymorphism is of two types: Compile time polymorphism and Run time polymorphism 
//Method Overloading is an example of Compile time polymorphism
//Method Overriding is an example of Run time polymorphism
//In method overriding, the method must have the same name and parameters as in the parent class
/*  inheritance in java is a mechanism in which one object acquires all the properties and behaviors of a parent object
//Inheritance is used for code reusability and method overriding  
//Types of Inheritance in Java
1. Single Inheritance - is a type of inheritance in which a class inherits the properties of another class
2. Multilevel Inheritance - is a type of inheritance in which a class is derived from a class which is also derived from another class
3. Hierarchical Inheritance its a type of inheritance in which one parent class is inherited by multiple child classes just like a hierarchy or tree structure
4. Hybrid Inheritance (not directly supported in java through classes but can be achieved through interfaces

 */

 int age = 18;
System.out.println(age);



}



}