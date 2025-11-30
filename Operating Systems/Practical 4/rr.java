import java.util.*;
class job implements Runnable
{
int process_id,no_of_instr,time_quantum;
Thread t;
job(int pid,int instr,int tq)
{
process_id=pid;
no_of_instr=instr;
time_quantum=tq;
t=new Thread(this);
t.start();
}
public void run()
{
try
{
System.out.println("Process id="+process_id);
for(int i=1;i<=no_of_instr;i++)
{
System.out.println("Execute instr_no "+i+" of process"+process_id);
Thread.sleep(time_quantum);
}
System.out.println("job"+process_id+" over");
}
catch(Exception e)

{
System.out.println("job has interrupted");
}
}
}
class rr
{
public static void main(String args[])
{
try
{
int process_id,time_quantum;
Scanner sc=new Scanner (System.in);
System.out.println("Enter a user process starts a number:");
process_id=sc.nextInt();
System.out.println("Enter time quantum in (miliseconds)");
time_quantum=sc.nextInt();
job j1=new job(++process_id,24,time_quantum);
job j2=new job(++process_id,9,time_quantum);
job j3=new job(++process_id,3,time_quantum);
}
catch(Exception e)
{
System.out.println("process is failed");
System.out.println("please contact Admin");
}
}
}
