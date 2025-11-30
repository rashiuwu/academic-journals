import java.util.*;

class Proc {
    Proc() {
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;
        float avg;
        int[] p = new int[20];
        int[] wt = new int[20];

        System.out.print("Enter the number of processes in CPU: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the CPU time for process " + i + ": ");
            p[i] = sc.nextInt();
        }

        wt[0] = 0;

        for (int i = 1; i < n; i++) {
            wt[i] = wt[i - 1] + p[i - 1];
            System.out.println("Waiting time for process " + i + ": " + wt[i]);
            sum += wt[i];
        }

        avg = (float) sum / n;
        System.out.println("Average waiting time: " + avg);
    }
}

public class os1 {
    public static void main(String[] args) {
        new Proc();
    }
}


