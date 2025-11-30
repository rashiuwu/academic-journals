import java.util.*;

class Job {
    int Pid, size;

    Job(int Process_id, int n) {
        Pid = Process_id;
        size = n;
    }
}

class MemMgmt {
    int mem_array[];
    Vector<Job> jobqueue;

    MemMgmt(Vector<Job> v) {
        jobqueue = v;
        mem_array = new int[20];
        for (int i = 0; i < 20; i++) {
            mem_array[i] = 0;  // 0 means free block
        }
        System.out.println("Initial memory layout:");
        System.out.println();
        System.out.print(" | ");
        printArray();
    }

    void printArray() {
        for (int i = 0; i < mem_array.length; i++) {
            if (mem_array[i] == 0)
                System.out.print("_ | ");
            else
                System.out.print(mem_array[i] + " | ");
        }
        System.out.println();
    }

    void addJob(Job job) {
        jobqueue.add(job);
    }

    void firstfit() {
        System.out.println("\nApplying First Fit Policy\n");
        for (Job job : jobqueue) {
            boolean allocated = false;
            for (int i = 0; i <= mem_array.length - job.size; i++) {
                boolean canAllocate = true;
                for (int j = i; j < i + job.size; j++) {
                    if (mem_array[j] != 0) {
                        canAllocate = false;
                        break;
                    }
                }
                if (canAllocate) {
                    for (int j = i; j < i + job.size; j++) {
                        mem_array[j] = job.Pid;
                    }
                    System.out.println("Job " + job.Pid + " allocated from block " + i + " to " + (i + job.size - 1));
                    allocated = true;
                    break;
                }
            }
            if (!allocated) {
                System.out.println("Job " + job.Pid + " cannot be allocated - insufficient space.");
            }
            printArray();
        }
    }
}

public class OS7 {
    public static void main(String[] args) throws Exception {
        Vector<Job> v = new Vector<>();
        MemMgmt m = new MemMgmt(v);

        Job job1 = new Job(500, 9);
        Job job2 = new Job(200, 2);
        Job job3 = new Job(900, 6);

        m.addJob(job1);
        m.addJob(job2);
        m.addJob(job3);
        m.firstfit();
    }
}

