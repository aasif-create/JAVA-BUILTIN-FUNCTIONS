import java.util.*;
public class CollectionMethods {
    public static void main(String[] args) {
        System.out.println("1. Collections.sort() : SORTS THE LIST IN ASCENDING ORDER");
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(50, 10, 30, 20));
        Collections.sort(list1);
        System.out.println("Sorted list : " + list1);
        System.out.println("<-------------------------------------------------->");

        System.out.println("2. Collections.reverse() : REVERSES THE ORDER OF ELEMENTS IN THE LIST");
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.reverse(list2);
        System.out.println("Reversed list : " + list2);
        System.out.println("<-------------------------------------------------->");

        System.out.println("3. Collections.shuffle() : RANDOMLY SHUFFLES ELEMENTS IN THE LIST");
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Java", "Python", "C", "C++"));
        Collections.shuffle(list3);
        System.out.println("Shuffled list : " + list3);
        System.out.println("<-------------------------------------------------->");

        System.out.println("4. Collections.max() : RETURNS THE MAXIMUM ELEMENT IN THE LIST");
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(25, 100, 65, 40));
        System.out.println("Maximum value : " + Collections.max(list4));
        System.out.println("<-------------------------------------------------->");

        System.out.println("5. Collections.min() : RETURNS THE MINIMUM ELEMENT IN THE LIST");
        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(25, 100, 65, 40));
        System.out.println("Minimum value : " + Collections.min(list5));
        System.out.println("<-------------------------------------------------->");
    }
}
