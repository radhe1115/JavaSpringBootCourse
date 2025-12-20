public class CarTaxi extends Taxi{
public static void main(String [] args){
//Car car =new Car();
//Taxi taxi = new Taxi();

//public class CarTaxi extends Car extends Taxi -  this is not allowed in java just as java does not supports multiple inheritance to avoid problem of //ambiguiety 

CarTaxi carTaxi = new CarTaxi();
carTaxi.getCar(); 
carTaxi.getTaxi();
}
}