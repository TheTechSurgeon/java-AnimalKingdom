package animalkingdom;

import java.util.ArrayList;
public class Main{
    public static void filterAnimals(ArrayList<Animals> animals, Filter tester){
        for (Animals a :animals){
            if (tester.test(a)){
                System.out.println(a.getName() + "" + getYear());
            }
        }
        
    }

}
