// overloaded methods are early binding

public class SongDrivers
{
    public static void main (String args[])
    {
        // 1. create a song or more
        Song fireworks = new Song("fireworks", "Katy Perry",
                true, 234, 6.94);
        Song deadlocs = new Song("Dead Locs", "Blue Face",
                true, 150, 3.34);
        Song someSong = new Song();
        Song mySong = new Song("my song", "yours truly",
                true);
        deadlocs.setLength(-5);
        System.out.println(deadlocs);

        //fireworks.title = "Happy song";
        //System.out.println(fireworks);


        //testing getters
        System.out.println(deadlocs.getTitle() + "\n" + deadlocs.getArtist() + "\n"
        + deadlocs.getHasLyrics() + "\n" + deadlocs.getFileSize() +"\n" +
                deadlocs.getLength());

        //brain
        System.out.println("In minutes: " + deadlocs.toIntSec());


        //testing setters
        // System.out.print(someSong);
        // someSong.getTitle("and i oop...");
        // System.out.println(someSong);

        //2. Print it out
        // System.out.println(fireworks);
        // System.out.println("\n" + deadlocs);
    }//end main method
}//end class SongDrivers. This is where all the fun stuff happens
