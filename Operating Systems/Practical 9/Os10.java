class DevMgmt 
{ 
    String disk_sequence; 
    int[] tracks; 
 
    DevMgmt(int[] ds) 
    { 
        tracks = new int[ds.length]; 
        for (int i = 0; i < ds.length; i++) 
        { 
            tracks[i] = ds[i]; 
        } 
    } 
 
    void look(int start_track) 
    { 
        System.out.println("=======LOOK==========="); 
        int p = 0; 
        System.out.println("tracks[p]=" + tracks[p]); 
 
        for (int i = 0; i < tracks.length - 1; i++) 
        { 
            for (int j = 0; j < tracks.length - i - 1; j++) // Added inner loop 
            { 
                if (tracks[j] > tracks[j + 1]) 
                { 
                    int temp = tracks[j]; 
                    tracks[j] = tracks[j + 1]; 
                    tracks[j + 1] = temp; 
                } 
            } 
        } 
 
        System.out.println("Sorted values:"); 
        for (int i = 0; i < tracks.length; i++) 
        { 
            System.out.print(tracks[i] + " "); 
        } 
        System.out.println(); 
 
        System.out.println("After sorting..."); 
        int total_cylinder = 0, from_track = start_track, to_track = 0; 
        System.out.println("traversing from " + from_track); 
 
        int i = 0; 
        for (i = 0; i < tracks.length; i++) 
        { 
            System.out.println("i=" + i + " tracks[i]=" + tracks[i]); 
            /* 
            if (tracks[i] <= start_track) 
            { 
                break; 
            } 
            */ 
        } 
 
        for (int x = 1; x > 0; x--) 
        { 
            System.out.println("to track:" + tracks[x]); 
            to_track = tracks[x]; 
            total_cylinder = total_cylinder + Math.abs(from_track - to_track); 
            from_track = to_track; 
        } 
 
        for (int x = 2; x < tracks.length; x++) 
        { 
            System.out.println("to track:" + tracks[x]); 
            to_track = tracks[x]; 
            total_cylinder = total_cylinder + Math.abs(from_track - to_track); 
            from_track = to_track; 
        } 
 
        System.out.println("total cylinders traversed=" + total_cylinder); 
    } 
} 
 
class Os10 
{ 
    public static void main(String args[]) throws Exception 
    { 
        System.out.println("LOOK"); 
        int disk_sequence[] = {98, 183, 37, 122, 14, 124, 65, 67}; 
        int track = 53; 
        DevMgmt m = new DevMgmt(disk_sequence); 
        m.look(track); 
    } 
}