import java.util.LinkedList;
import java.util.Scanner;
class LL{
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the students names:");
        for(int i=0;i<3;i++)
        {
            ls.add(sc.nextLine());
        } 
        System.out.println("Old students"+ls);
        System.out.println("Enter the new students names:");
        for(int i=0;i<3;i++)
        {
            ls.add(sc.nextLine());
        }  
        System.out.println("New students"+ls);
        System.out.println("Enter the student name to remove:");
        String str = sc.nextLine();
        ls.remove(str);
        System.out.println(ls);
        System.out.println(ls.contains("David"));
        

    }
}