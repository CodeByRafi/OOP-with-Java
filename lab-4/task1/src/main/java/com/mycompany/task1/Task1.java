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
