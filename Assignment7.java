package Assignment7;
import java.util.*;

public class arrayDimention {
    private double average(ArrayList<Integer> numbers){
        double sum = 0;
        for (Integer number : numbers) {
            sum = sum + number;
        }
        return sum/numbers.size();
    }
    public static void main(String[] args) {
        /*int a [][] =
         new int[][]{{1, 1}, {1, 2}, {2, 1}, {2, 2}};
        for (int[] anA : a) {
            for (int anAnA : anA) {
                System.out.print(anAnA + " ");
            }
            System.out.println();
        }*/
        HashMap<Double,ArrayList<Integer>> sort = new HashMap<>();
        arrayDimention arrayDimension = new arrayDimention();
        ArrayList<ArrayList<Integer>> twoDimentionArray = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int x = input.nextInt(),n = random.nextInt(x), m = random.nextInt(x);
        while (m == 0){
            m = random.nextInt(x);
        }
        while (n == 0){
            n = random.nextInt(x);
        }
        System.out.println("array is "+ m + " * " + n);
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(random.nextInt(x));
            }
            twoDimentionArray.add(row);
        }
        for (ArrayList<Integer> aTwoDimentionArray : twoDimentionArray) {
            double avg = arrayDimension.average(aTwoDimentionArray);
            sort.put(avg, aTwoDimentionArray);
            System.out.println(aTwoDimentionArray +" avg is --> "+ avg);
        }
        System.out.println("Sorted Arraylist is : ");
        Object[] sortedKey = sort.keySet().toArray();
        Arrays.sort(sortedKey);
        for (int i = sortedKey.length; i > 0; i--) {
            System.out.println(sort.get((Double) sortedKey[i-1])+ " avg is --> " + sortedKey[i-1]);
        }
    }
}





