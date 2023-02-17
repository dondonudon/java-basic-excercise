import java.util.HashMap;

public class CategorizeNumber {
    public static void main(String args[]) {
        int[] numbers = { 1, 2, 3, 3, 2, 1, 5, 5, 5, 8, 9, 9, 1, 2, 3, 7, 6, 6, };
        solution(numbers);
    }

    static void solution(int[] numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int max = Integer.MIN_VALUE;
        int maxCount = Integer.MIN_VALUE;

        for (int num : numbers) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);

            if (count > maxCount) {
                maxCount = count;
                max = num;
            }
        }

        // print result
        System.out.println("Each occurrence of numbers: " + map);
        System.out.println("Max number with maximum occurrence: " + max);

    }
}