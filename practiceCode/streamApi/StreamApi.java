import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class StreamApi {
  public static void main(String[] args) {
    List<Integer>  numList =  Arrays.asList(77,76,97,42,43,65,21,98);

    //different ways to print a List
    //simple For Loop

    // for(int i = 0 ; i<numList.size();i++) System.out.println(numList.get(i));
    // 

    //using Enhanced For loop

    // for(int n : numList) System.out.println(n);

    // Using forEach()
    // Consumer<Integer> con =  new Consumer<Integer>() {
    //   public void accept(Integer n){
    //       System.out.println(n);
    //   }
    // };
    // numList.forEach(con);

    // numList.forEach(n -> System.out.println(n)); //using labda expression


    // Predicate<Integer>  p =  new Predicate<Integer>() {
    //   public boolean test(Integer n){
    //     return n%2==0;
    //   }
    // };
    // Stream<Integer> s2  = s1.filter(n -> n%2==0);

    // Function<Integer, Integer> mapper = new Function<Integer,Integer>() {
    //    public Integer apply(Integer i){
    //     return i*2;
    //    }
      
    // };

    // Stream<Integer> s3 = s2.map(n -> n*2);
         Stream<Integer>  s1 = numList.stream().filter(n -> n%2!=0).sorted();
         s1.forEach(n -> System.out.println(n));

  }
}
