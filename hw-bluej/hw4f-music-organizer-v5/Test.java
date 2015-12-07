import java.util.ArrayList;

public class Test {
    
    //private ArrayList<Track> tracks = new ArrayList<Track>();
    private MusicOrganizer musicOrg = new MusicOrganizer();
    
    public void test() {
        
        for(int n = 1; n <= 25; n++) {
            musicOrg.addTrack(new Track("" + n));
        }
        
        musicOrg.playAllRandom();
    }
}