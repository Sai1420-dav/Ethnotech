import java.util.*;
class hashMap{
    public static void main(String[] args) {

        //HashMap 
        Map<String,Integer> number = new HashMap<>();
        number.put("two", 2);
        number.put("four", 4);
        number.put("six", 6);
System.out.println("These are even numbers " + number);

//Linked HashMap From Hash Map - Implements

LinkedHashMap<String,Integer> numberTwo= new LinkedHashMap<>(number);
numberTwo.put("Three", 3);
System.out.println("These are odd numbers " + numberTwo);

        // hs.put("Apples",1);
        // hs.put("Bananas",4);
        // hs.put("Mangoes",12);
        // hs.put("Straw berries",6);
        // hs.put("Amla",3);
        // System.out.println(hs);
        // System.out.println(hs.get("Apples"));
        // System.out.println(hs.remove("Apples"));
        // System.out.println(hs);
        // System.err.println(hs.containsKey("Apples"));
    }
}