import java.util.ArrayList;

public class ForL{
public static void main(String[]args){

    ArrayList<String> stringList = new ArrayList<>();

      
        stringList.add("Mango");
        stringList.add("Banana");
        stringList.add("Orange");
        

        
        for (String fruit : stringList) {
            
            System.out.println(fruit);
        }
}
}
