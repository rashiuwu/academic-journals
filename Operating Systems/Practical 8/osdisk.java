import java.io.*;
class DevMgmt
{
 int []tracks;
 DevMgmt(int []ds)
{
 tracks=new int[ds.length];
 for(int i=0;i<ds.length;i++)
{
 tracks[i]=ds[i];
}
}
void sstf(int start_track)
{
 System.out.println("----SHORTEST SEEK-TIME FIRST----");
 boolean tracks_bool[]= new boolean[tracks.length];
 int min_dist=0,max_dist=0;
for(int i=0;i<tracks.length;i++)
{
 tracks_bool[i]=false;
 max_dist=max_dist+tracks[i];
}
min_dist=max_dist;
int total_cylinders=0;
int from_track=start_track;
int current_track_index= -1;
System.out.println("Traversing from:- "+from_track);
for(int i=0;i<tracks.length;i++)
{
 System.out.println("Max distance= "+max_dist);
 int to_track_index=0;
for(int t=0;t<tracks.length;t++)
{

if((!tracks_bool[t])&&(Math.abs(from_track-tracks[t])<min_dist)&&(t!=current_track_index
))
{
System.out.println("Tracks + "+tracks[t]);
to_track_index=t;
min_dist=Math.abs(from_track-tracks[t]);
System.out.println("min_dist= "+min_dist);
}
}
System.out.println();
System.out.println("to track:- "+tracks[to_track_index]);
total_cylinders+=Math.abs(from_track-tracks[to_track_index]);
tracks_bool[to_track_index]=true;
from_track=tracks[to_track_index];
current_track_index=to_track_index;
min_dist=max_dist;
}
System.out.println("Total cylinders traversed ="+total_cylinders);
}
}
class osdisk
{
public static void main (String []args) throws Exception
{
 System.out.println("Rashi Sawardekar .SYIT-B-093.");
 System.out.println("SSTF");
 int disk_sequence[]={98,183,37,122,14,124,65,67};
 int track=53;
 DevMgmt m= new DevMgmt(disk_sequence);
 m.sstf(track);
}
}


