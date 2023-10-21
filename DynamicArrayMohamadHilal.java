

//Mohmad haj Ahmad
package dynamicarray;

//Mohmad haj Ahmad
/**
 *
 * @author kh
 */
public class DynamicArrayMohamadHilal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Mohmad haj Ahmad
        DynamicArray<Integer> arr = new DynamicArray<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println("*************************************");
        arr.Print();
        arr.insertAt(33, 3);
        System.out.println("After inster element ");
        arr.Print();
        arr.insertAll(1, new Integer[]{665, 88, 5});
        System.out.println("after insert colliction ");
        arr.Print();
        System.out.println("After remove rang ");
        arr.removeAll(1, 3);
        arr.Print();
        System.out.println("Capacity  after remove " + arr.getCapacity());
        System.out.println("mode :" + arr.mode());
        System.out.println("After revers");
        arr.revers();
        arr.Print();
        arr.trim();
        System.out.println("Capacity after trim " + arr.getCapacity());
    }

}
