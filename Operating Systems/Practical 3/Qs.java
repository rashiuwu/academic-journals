class Q {
int n;
boolean valueset = false;
synchronized int get() {
while (!valueset) {
try {
wait();
} catch (InterruptedException e) {
System.out.println("Exception Caught");
}
}
System.out.println("GOT: " + n);
valueset = false;
notify();
return n;
}
synchronized void put(int x) {
while (valueset) {
try {

wait();
} catch (InterruptedException e) {
System.out.println("Exception Caught");
}
}
this.n = x;
valueset = true;
System.out.println("PUT: " + n);
notify();
}
}
class Producer implements Runnable {
Q q;
Producer(Q q) {
this.q = q;
new Thread(this, "Producer").start();
}
public void run() {
int i = 0;
while (true) {
q.put(i++);
try {
Thread.sleep(50);
} catch (InterruptedException e) {
System.out.println("Producer interrupted");
}
}
}
}
class Consumer implements Runnable {
Q q;

Consumer(Q q) {
this.q = q;
new Thread(this, "Consumer").start();
}
public void run() {
while (true) {
int val = q.get();
try {
Thread.sleep(50);
} catch (InterruptedException e) {
System.out.println("Consumer interrupted");
}
}
}
}
public class Qs {
public static void main(String[] args) {
Q q = new Q();
new Producer(q);
new Consumer(q);
System.out.println("Press Ctrl+C to stop.");
}
}
