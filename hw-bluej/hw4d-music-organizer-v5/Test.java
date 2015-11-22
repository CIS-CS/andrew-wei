import java.util.ArrayList;

/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test {
    
    private ArrayList<Track> tracks = new ArrayList<Track>();
    private MusicOrganizer musicOrg = new MusicOrganizer();
    
    public void test() {
        
        for(int n = 0; n < 100; n++) {
            tracks.add(new Track("" + n));
        }
        
        for(Track track : tracks) {
            System.out.println(track.getDetails());
        }
    }
}