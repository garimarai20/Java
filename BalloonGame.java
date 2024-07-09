import java.util.Arrays;
import java.util.Scanner;

public class BalloonGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of balloons
        int N = scanner.nextInt();

        // Input: Array of power required to burst each balloon
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // Output: Minimum time required to burst all the balloons
        System.out.println(minimumTimeToBurstBalloons(N, A));
    }

    public static int minimumTimeToBurstBalloons(int N, int[] A) {
        // Sort the array to burst balloons in ascending order of power required
        Arrays.sort(A);

        int time = 0;
        int power = 1;
        int factor = 1;

        for (int i = 0; i < N; i++) {
            int requiredPower = A[i];

            // Increase time until the dart power reaches the required power to burst the balloon
            while (power < requiredPower) {
                time++;
                power += factor;
            }

            // Burst the balloon
            time++;  // It takes an additional minute to burst the balloon
            power = 0;
            factor++;
            power += factor;  // Initialize power for the next balloon burst
        }

        return time;
    }
}

