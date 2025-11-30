class Mem_mgmt
{
int pages[];
int mem_block[];
int pages_faults;
Mem_mgmt(int fs[], int n)
{
pages = new int[fs.length];
for (int i = 0; i < fs.length; i++)
{
pages[i] = fs[i];
}
mem_block = new int[n];
for (int i = 0; i < n; i++)
{
mem_block[i] = -1;
}
}
void disMemBlock()
{
for (int i = 0; i < mem_block.length; i++)
{
System.out.print(" | " + mem_block[i] + " ");
}

System.out.println();
}
void fifo()
{
System.out.println("====== FIFO ======");
System.out.println("Initial Memory Layout:");
disMemBlock();
int mem_block_num = 0;
pages_faults = 0;
for (int i = 0; i < pages.length; i++)
{
boolean present = false;
for (int j = 0; j < mem_block.length; j++)
{
if (mem_block[j] == pages[i])
{
present = true;
break;
}
}
if (!present)
{
System.out.println("Loading Page No. " + (i + 1) + " : " + pages[i]);
mem_block[mem_block_num] = pages[i];
mem_block_num++;
pages_faults++;

if (mem_block_num == mem_block.length)
{
mem_block_num = 0;
}
disMemBlock();
}
}
System.out.println("\nTotal Page Faults: " + pages_faults);
}
}
class Osprac
{
public static void main(String [] args)
{
System.out.println("RashiSawardekar.SYIT-B-093.");
int frame_sequence[] = {7,0,1,2,0,3,0,4,2,3,0,3,2,3};
System.out.println("\n Enter the FIFO code");
System.out.println("1. FIFO");
Mem_mgmt m = new Mem_mgmt(frame_sequence, 3);
m.fifo();
}
}
