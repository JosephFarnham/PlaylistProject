import java.util.ArrayList;

/**
 * The Playlist class,
 * Keeps track of a playlist of Song objects
 * @author Marcel Zamora & Joseph Farnham
 * @version 1/24/25
 */
public class Playlist
{
    private ArrayList<Song> playlist;



     /**
      * Constructor for objects of class playlist;
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
      /**
       * addSong method
       * Mutator method that adds a new song to the playlist, 
       * @param name The name of the song
       * @param artist The name of the artist
       * @param time the duration of the song in seconds
      */
      public void addSong(String name, String artist, int time)
      {
        Song song = new Song(name, artist, time);
        playlist.add(song);
      }
      /**
       * likeSong
       * Likes or unlikes a song in the playlist
       * @param place Location of the song in the playlist
       */
      public void likeSong(int place)
      {
        playlist.get(place).switchLike();

      }
      /** 
       * removeSong method
       * removes a song from the playlist
       * @param place the position of the song
      */
      public void removeSong(int place)
      {
        playlist.remove(place);
      }
      /**
       * totalDuration method
       * calculates and returns the total duration of all songs in the playlist
       * @return the duration of the playlist in seconds
       */
      public int totalDuration()
      {
        int sum = 0;
        for (int i = 0; i < playlist.size(); i++)
        {
          sum += playlist.get(i).getTime();
        }
        return sum;
      }
      /**
       * printPlaylist method
       * returns a string of the Playlist as a list with each song's title, artist, duration in (minutes : seconds), and like status
       * @return String of the playlist
       */
      public String printPlaylist()
      {
        String print = "";
        for(int i = 0; i < playlist.size(); i++)
        {
          print += playlist.get(i).getName() + ", ";
          print += playlist.get(i).getArtist() + " ";
          print += "(" + playlist.get(i).getTime() / 60 + ":";
              if(playlist.get(i).getTime() % 60 < 10)
              {
                print += 0;
              }
              print += playlist.get(i).getTime() % 60 +")";
          if(playlist.get(i).isLiked())
          {
            print += " - liked";
          }
          print += "\n";
        }
        return print;
      }
      /**
       * printPlaylist method
       * returns a string of only the liked songs in the playlist as a list with each song's title, artist, and duration in (minutes : seconds);
       * @return String of the liked songs in the playlist
       */
      public String printLiked()
      {
        String print = "";
        for(int i = 0; i < playlist.size(); i++)
        {
          if(playlist.get(i).isLiked())
            {
              print += playlist.get(i).getName() + ", ";
              print += playlist.get(i).getArtist() + ", ";print += "(" + playlist.get(i).getTime() / 60 + ":";
              if(playlist.get(i).getTime() % 60 < 10)
              {
                print += 0;
              }
              print += playlist.get(i).getTime() % 60 +")";
              print += "\n";
            }
        }
        return print;
      }
      /**
       * removeUnliked method
       * removes any songs that have not been liked from the playlist
       */
      public void removeUnliked()
      {
        for(int i = 0; i < playlist.size(); i++)
        {
          if(!playlist.get(i).isLiked())
          {
            playlist.remove(i);
          }
        }
      }

}
