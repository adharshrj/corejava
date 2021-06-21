import java.util.Arrays;
  
public class sortAscending {
    public static void main(String[] args)
    {
        int[] array = new int[] { 9, 332, 8, 12, 1, 3 };
  
        System.out.print("Elements of original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        Arrays.sort(array);
        System.out.println();
  
        System.out.println(
            "Ascending order : "
            + Arrays.toString(array));
    }
}