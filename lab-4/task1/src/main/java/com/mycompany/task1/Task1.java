// 1: Create a class called "Song" with final attributes "title" and "artist"
// that cannot be modified after initialization. Add a static counter "playCount"
// that tracks how many songs have been played across the application.
// Implement a method "play()" that increments this counter whenever any
// song is played. Create a simple program that instantiates several songs
// and plays them, then displays the total play count.
package com.mycompany.task1;
class Song {
    final String title;
    final String artist;

    static int playCount = 0;

    
    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

   
    void play() {
        playCount++;  
        System.out.println("Playing \"" + title + "\" by " + artist + "...");
    }

    static int getPlayCount() {
        return playCount;
    }
}

public class Task1 {
    public static void main(String[] args) {

        Song song1 = new Song("Bohemian Rhapsody", "Queen");
        Song song2 = new Song("Shape of You", "Ed Sheeran");
        Song song3 = new Song("Bohemian Rhapsody", "Queen");

        song1.play();
        song2.play();
        song3.play();

        System.out.println("Total songs played: " + Song.getPlayCount());
    }
}
