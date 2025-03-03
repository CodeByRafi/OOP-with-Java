// Song class with final attributes and a static play count
class Song {
    // Final attributes that cannot be modified after initialization
    final String title;
    final String artist;

    // Static counter to track total play count
    static int playCount = 0;

    // Constructor to initialize title and artist
    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    // Method to play the song, increments play count
    void play() {
        playCount++;  // Increment the total play count
        System.out.println("Playing \"" + title + "\" by " + artist + "...");
    }

    // Static method to get the total play count
    static int getPlayCount() {
        return playCount;
    }
}

// Main class to test the Song class functionality
public class MavenProject3 {
    public static void main(String[] args) {
        // Creating song objects
        Song song1 = new Song("Bohemian Rhapsody", "Queen");
        Song song2 = new Song("Shape of You", "Ed Sheeran");
        Song song3 = new Song("Bohemian Rhapsody", "Queen");

        // Playing the songs
        song1.play();
        song2.play();
        song3.play();

        // Displaying the total play count
        System.out.println("Total songs played: " + Song.getPlayCount());
    }
}
