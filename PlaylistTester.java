/**
 * Tester file for the Playlist class.
 * @author Joseph Farnham & Marcel Zamora
 * @version 1/28/25
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist p = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        /*
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        p.addSong("Symphony No. 3","Gustav Mahler", 5644);
        p.addSong("The Shortest Song in the World","Duncan Reid and the Big Heads", 3);
        p.addSong("Swing Lynn","Twin Cabins", 322);
        p.addSong("On Melancholy Hill", "Gorillaz", 233);
        p.addSong("Roundabout","Yes" , 516);



        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        System.out.printf(p.printPlaylist());

        System.out.println("\nLiking the songs in position 0, 2, 4\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        p.likeSong(0);
        p.likeSong(2);
        p.likeSong(4);
        System.out.println("Printing the songs...\n");
        System.out.printf(p.printPlaylist());

        System.out.println("\nRemoving the song in position 4, 1, \n");
        p.removeSong(4);
        p.removeSong(1);
        System.out.println("Printing the songs...\n");
        System.out.println(p.printPlaylist());
        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        System.out.println(p.printLiked());

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        int seconds = p.totalDuration();
        String print ="";
        print += seconds / 60 + ":";
        if(seconds % 60 < 10)
        {
            print += 0;
        }
        print += seconds % 60;
        System.out.println(print);

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        p.removeUnliked();


        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        System.out.printf(p.printPlaylist());
    }
}
