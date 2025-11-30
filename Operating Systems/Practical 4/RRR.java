import java.util.*;
class job implements Runnable
{
int process_id,no_of_instructions,time_quantum;
Thread t;
job(int pid, int instr, int tq) {
process_id = pid;
no_of_instructions = instr;
time_quantum = tq;
t = new Thread(this);
t.start();
}
public void run(){
try{
int x=0;
System.out.println("Process id:" +process_id);
for (int i=0;i<=no_of_instructions;i++){
System.out.println("Excecution of instruction no. "+i+" of process "+process_id);
Thread.sleep(time_quantum);
x=i;
System.out.println("X value is "+x+ " of process" + process_id);
}

System.out.println("Job over of : "+process_id);
}
catch(Exception e){
System.out.println("Exception occurred!!" +e);
}
}
}
class RRR
{
public static void main(String arr[])
{
try{
int process_id, time_quantum;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the time quantum in milliseconds:");
time_quantum=sc.nextInt();
job j1=new job(1,24,time_quantum);
job j2=new job(2,9,time_quantum);
job j3=new job(3,3,time_quantum);
}
catch(Exception e){
System.out.println("Error occurred!!" +e);

}
}
}
