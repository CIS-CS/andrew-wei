import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> songs;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        songs = new ArrayList<String>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        songs.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfSongs()
    {
        return songs.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index) == true) {
            String filename = songs.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index) == true) {
            songs.remove(index);
        }
    }
    
    public String checkIndex(int index) {
        if(getNumberOfSongs() == 0) {
            return "Invalid index. No songs in collection.";
        }
        else if(index < 0 || index >= songs.size()) {
            return "Invalid index. Index can range from 0 to " + (songs.size() - 1) + ".";
        }
        
        return null;
    }
    
    public boolean validIndex(int index) {
        if(index < 0 || index >= songs.size()) {
            return false;
        }
        else {
            return true;
        }
    }
}
