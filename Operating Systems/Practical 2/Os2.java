class Room {
    public synchronized void lectures_Taken(String name)throws Exception
{
        System.out.println(name + " enters in room.");
        Thread.sleep(1000); 
        System.out.println(name + " starts  the lecture.");
        Thread.sleep(1000);
        System.out.println(name + " ends the lecture.");  
        Thread.sleep(1000);  
        
    }
}

class Lecture implements Runnable
{
      String name;
      Room r;
      Thread t;
Lecture(String tname,Room r)
{
    name=tname;
    t=new Thread(this,tname);
    this.r=r;
    t.start();
}
public void run()
{ 
    try
    {
       r.lectures_Taken(name);
    }catch(Exception e)
     {
                 System.out.println(e);
          }
    }
}

class Os2 {
    public static void main(String args[]) {
        Room r1 = new Room();
        Lecture l1 = new Lecture("Mousmi Ma'am", r1);
        Lecture l2 = new Lecture("Kirti Ma'am", r1);
        Lecture l3 = new Lecture("Suchita Ma'am", r1);
    }
}
