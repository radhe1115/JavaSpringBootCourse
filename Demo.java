 class A{ // if a Class is made final then we can not inherit the class	

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

 int age = 18;
System.out.println(age);



}



}