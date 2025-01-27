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
    private ArrayList<Song> playlist;



     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */

      public Playlist()
      {
        playlist = new ArrayList<Song>();
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
      public void addSong(String name, String artist, String time)
      {
        Song song = new Song(name, artist, time);
        playlist.add(song);
      }

      public void likeSong(Song a)
      {
        a.isLiked();

      }
      public void removeSong(Song remove)
      {
        playlist.remove(remove);
      }

      public void totalDuration()
      {
        int sum = 0;
        for (int i = 0; i < playlist.size(); i++)
        {
          sum += playlist.get(i).getTime();
        }
      }
  

}
