import java.util.Scanner;

public class Hiking {
    public static void main(String args[]) {
        System.out.print("Enter a path: ");
        Scanner sc = new Scanner(System.in);
        solution(sc.nextLine());
        sc.close();
    }

    public static void solution(String n) {
        int seaLevel = 0;
        int valley = 0;
        int mountain = 0;
        // turn string into char array
        char[] path = n.toCharArray();
        for (int i = 0; i < path.length; i++) {
            // if char is U, add 1 to seaLevel
            if (path[i] == 'U' || path[i] == 'u') {
                seaLevel++;
            }
            // if char is D, subtract 1 from seaLevel
            if (path[i] == 'D' || path[i] == 'd') {
                seaLevel--;
            }

            if (seaLevel == 0 && (path[i] == 'U' || path[i] == 'u')) {
                mountain++;
            }
            if (seaLevel == 0 && (path[i] == 'D' || path[i] == 'd')) {
                valley++;
            }

        }

        System.out.println("Your path is " + mountain + " mountain and " + valley + " valley");

    }
}
