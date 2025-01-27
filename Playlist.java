import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 * @author Marcel Zamora 
 * @version 1/24/25
 */
public class Playlist
{
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    ArrayList<Song> Playlist;



     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */

      public Playlist()
      {
        Playlist = new ArrayList<Song>();
      }

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
      public void AddSong(String name, String artist, String time)
      {
        Song song = new Song(name, artist, time);
        Playlist.add(song);
      }

      public void LikeSong(Song a)
      {
        a.isLiked();
        
      }


}
