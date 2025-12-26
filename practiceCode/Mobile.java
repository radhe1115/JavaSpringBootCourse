class Mobile{
int id;
int year;
static String category;

void display(Mobile mob){
System.out.println("Year: "+ mob.year +" - "+mob.category);
}
void display1(){
System.out.println("Year: "+year +" - "+category);
}

public static void main(String [] args){

Mobile mob = new Mobile();
mob.id =1;
mob.year =2010;
mob.category = "Smartphone";// this is not a good practice to call a Static member of class by its object. it will still be a member of class

Mobile mob1 = new Mobile();
mob1.id=2;
mob1.year =2012;
mob1.category= "Smartphone1";

mob.display(mob);
mob1.display1();

System.out.println(mob.hashCode());
System.out.println(mob1.hashCode());

System.out.println(mob.category.hashCode());
System.out.println(mob1.category.hashCode());




} 
}