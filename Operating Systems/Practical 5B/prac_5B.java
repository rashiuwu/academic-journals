class mem_mange
{
int pages[], mem_block[];
mem_mange(int fs[], int n)
{
pages = new int[fs.length];
for(int i=0; i<fs.length; i++)
pages[i] = fs[i];
mem_block = new int[n];
for(int i=0; i<n; i++)
mem_block[i] = -1;

}
void disp_mem_block()
{
System.out.print(" | ");
for(int i=0; i<mem_block.length; i++)
System.out.print( mem_block[i] + " | ");
System.out.println();

}
void oppr()
{
int mem_block_num = 0, page_fault = 0;
System.out.println("==========OPPR==========");
System.out.println("Initial Memory Layout");
disp_mem_block();
for(int i=0; i<pages.length; i++)
{
boolean present = false;
for(int j=0; j<mem_block.length; j++)
{
if(pages[i] == mem_block[j])
{
present = true;
break;
}
}
if(!present)
{
mem_block_num = -1;
int longest_page = -1;
for(int j=0; j<mem_block.length; j++)
{
int k =0;
for(k=i+1; k<pages.length; k++)
{
if(mem_block[j] == pages[k])
{

if(k > longest_page)
{
longest_page = k;
mem_block_num = j;
}
break;
}
}
if(k == pages.length)
{
longest_page = pages.length;
mem_block_num = j;
}
}
mem_block[mem_block_num] = pages[i];
page_fault++;
}
disp_mem_block();
}
System.out.println("Total No. Page Faults = " + page_fault);
}
}

class prac_5B
{
public static void main(String args[])
{
int frame_seq[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2, 0, 1, 7, 0, 1};
mem_mange m = new mem_mange(frame_seq, 3);

m.oppr();
}
}