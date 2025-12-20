class A{

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
public B(){
System.out.println("in B");

}
public B(String sr){
this();
System.out.println("in b, String as Argument");
}

}

class Demo{


public static void main(String [] ags){
B obj = new B("radhe");

}



}