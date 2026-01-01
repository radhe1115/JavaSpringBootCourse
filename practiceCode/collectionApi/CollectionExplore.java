
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



class Student implements Comparable<Student>{
  String name;
  int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
      return "Student [name=" + name + ", age=" + age + "]";
    }

    public int compareTo(Student that)  {
      return (this.age>that.age)?1:-1;
    }

    
}

public class CollectionExplore{
  public static void main(String[] args)  {
    List<Integer> num = new ArrayList<>();
    num.add(1);
    num.add(5);
    num.add(36);
    num.add(38);
    num.add(34);
    num.add(32);
    System.out.println(num.size());
    System.out.println(num);
    Collections.sort(num);
    System.out.println(num);
    
    Map<String, Integer> frineds = new HashMap<>();  
    frineds.put("Radhakrushna", 3);
    frineds.put("Prasad",1);
    frineds.put("Ajinkya", 2);
    frineds.put("Ketan", 4);
    
    System.out.println(frineds);
    System.out.println(frineds.hashCode());
    System.out.println(frineds.keySet());
    System.out.println(frineds.containsKey("Prasad"));
    System.out.println(frineds.containsKey("Mahesh"));
    
    for(String key :frineds.keySet()) {
    	System.out.printf("%s : %d \n",key,frineds.get(key));
    }

    System.out.println("---------------------------------------");

    List<Student> stud = new ArrayList<>();

    stud.add(new Student(24, "ajit"));
    stud.add(new Student(22, "yug"));
    stud.add(new Student(51, "lala"));
    stud.add(new Student(21, "Anwar"));
    stud.add(new Student(23, "yuti"));
    stud.add(new Student(41, "ramesh"));

    for(Student st :stud)
    System.out.println(st);
  System.out.println("================using Comparable interface ==================");

    Collections.sort(stud);
    for(Student st :stud)
    System.out.println(st);

    System.out.println("================using Comparator Interface ==================");

/*     Comparator<Student> com =   new Comparator<Student>() {
      public int compare(Student i, Student j){
              if (i.age>j.age)
                return 1;
              else 
                return -1;
      }
    };

    all this code can be reduced to single line using java 8 features
    */
  Comparator<Student> com = ( i,  j)->{ return (i.age>j.age)?1:-1; };
  Collections.sort(stud,com);
  
  for(Student st :stud)
  System.out.println(st);





  }
}