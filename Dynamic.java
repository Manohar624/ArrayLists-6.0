import java.util.ArrayList;
import java.util.ListIterator;
class Person {
  private String name;
  private int age;

  
  public Person(String name, int age) {
      this.name = name;
      this.age = age;
  }

 
  @Override
  public String toString() {
      return "Name: " + name + ", Age: " + age;
  }
}public class Dynamic{
public static void main(String[]args){
  ArrayList<Person> personList = new ArrayList<>();
        
  personList.add(new Person("Balu", 30));
  personList.add(new Person("Manu", 25));
  personList.add(new Person("Hari", 35));

  ListIterator<Person> listIterator = personList.listIterator();
  while (listIterator.hasNext()) {
      System.out.println(listIterator.next());
  }
}
}
