/**
 * Song class
 * Holds information about a song
 * @author Joseph Farnham & Marcel Zamora
 * @version 1/25/24
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String name;
    private String artist;
    private int time;
    private boolean liked;


    /**
     * Constructor for objects of class Song
     * 
     */
    public Song(String name, String artist, int time)
    {
        this.name = name;
        this.artist = artist;
        this.time = time;
        liked = false;
    }
    /*
     * getName method
     * Returns the name of the song
     * @return The song Name
     */
    public String getName()
    {
        return name;
    }
    /*
     * getArtist method
     * Returns the artist of the song
     * @return The song Name
     */
    public String getArtist()
    {
        return artist;
    }
    /*
     * getTime method
     * Returns the duration of the song
     * @return The song Name
     */
    public int getTime()
    {
        return time;
    }
    /*
     * switchLike method
     * Flips whether the song is liked or not
     */
    public void switchLike()
    {
        liked = !liked;
    }
    /*
     * isLiked method
     * Returns if the song is liked or not
     * @return Boolean of whether or not it is liked
     */
    public boolean isLiked()
    {
        return liked;
    }
}
