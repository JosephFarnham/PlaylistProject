/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String name;
    private String artist;
    private String time;
    private boolean liked;


    /**
     * Constructor for objects of class Song
     * 
     * 
     */
    public Song(String name, String artist, String time)
    {
        this.name = name;
        this.artist = artist;
        this.time = time;
        liked = false;
    }
     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
    public String getName()
    {
        return name;
    }
    public String getArtist()
    {
        return artist;
    }
    public String getTime()
    {
        return time;
    }
    public void switchLike()
    {
        liked = !liked;
    }
    public boolean isLiked()
    {
        return liked;
    }
}
