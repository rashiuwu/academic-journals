class Banker
{
    int av[]= {16,2,5,2};
    int max[][]= {
        {3,2,2,1},
        {8,12,0,0},
        {2,1,0,0},
        {4,3,0,0},
        {2,0,3,1}
    };
    int alloc[][]= {
        {1,1,1,0},
        {2,1,0,0},
        {1,0,0,0},
        {2,1,0,0},
        {1,0,0,0}
    };
    int need[][];
    int m=4,n=5;

    Banker()
    {
        need=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                need[i][j]=max[i][j]-alloc[i][j];
            }
        }
    }
    boolean isSafe()
    {
        int work[]=new int[m];
        boolean finish[]=new boolean[n];
 	boolean incomplete=false;

        for(int i=0;i<m;i++)
        {
            work[i]= av[i];
        }
        for(int i=0;i<n;i++)
        {
            finish[i]=false;
        }
        for(int i=0;i<n;i++)
        {
		incomplete=false;
            if(finish[i] == false)   
            {
                for(int j=0;j<m;j++)  
                {
                    if(need[i][j]>work[j])
                    {
                        incomplete=true;
                        System.out.println(i+" :"+j+" :" +need[i][j] +" :" +work[j]);
                    }
                    if(need[i][j]!=0 && need[i][j]<=work[j])
                    {
                        work[j]=work[j]-need[i][j];
                        work[j]=work[j]+max[i][j];
                    }
                    System.out.println("Work[j] " +work[j]);
                }
	}
                if(!incomplete)
                {
                    finish[i]=true;
                }
 
                if(finish[i])
                {
                    System.out.println("Process " +i+ " can be completed");
                }
                else
                {
                    System.out.println("Process " +i+ " can NOT be completed");
                } 
	}
           for(int i=0;i<n;i++)
           {
                    if(!finish[i])
                    {
                        return false;
                    }  
           }
            return false;  

      }
}
       
class Os
{
    public static void main(String ar[])
    {
        Banker b=new Banker();
        System.out.println("Applying bankers algorithm");
        if(b.isSafe())
        {
            System.out.println("In safe state");
        }
        else
        {
            System.out.println("Not in safe state");
        }
    }
}

