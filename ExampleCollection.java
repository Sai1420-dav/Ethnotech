import java.util.*;

class ExampleCollection {

    public static void display(Queue<String> q, ArrayList<String> al) {
        for (String student : q) {
            if (al.contains(student)) {
                System.out.println("Registered: " + student);
            } else {
                System.out.println("Not Registered: " + student);
            }
        }
    }

    public static void main(String[] args) {

        Queue<String> hs = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of old students:");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter old student names:");
        for (int i = 0; i < n; i++) {
            hs.add(sc.nextLine());
        }

        ArrayList<String> ls = new ArrayList<>(hs);

        System.out.println("Old Students: " + ls);
        System.out.println("Enter student names:");
        for (int i = 0; i < 5; i++) {
            hs.add(sc.nextLine());
        }

        System.out.println("\nResult:");
        display(hs, ls);

    }
}