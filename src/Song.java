
public class Song
{
    // 1) is instance variables
    private String title;
    private String artist; //or composer
    private Boolean hasLyrics;
    private int length; //in seconds
    private double fileSize; // in megabytes

    // constructor
    // overloaded constructors (methods) have early binding
    public Song()
    {
        title = null;
        artist = null;
        hasLyrics = false;
        length = 0;
        fileSize = 0.0;
    }//end default constructor or zero-arg

    public Song(String newTitle, String newArtist, boolean newHasLyrics)
    {
        title = newTitle;
        artist = newArtist;
        hasLyrics = newHasLyrics;
        length = 0;
        fileSize = 0.0;

    }//three arg
    public Song(String newTitle, String newArtist, Boolean newHasLyrics,
                int newLength, double newFileSize)
    {
        title = newTitle;
        artist = newArtist;
        hasLyrics = newHasLyrics;
        length = checkLength(newLength);
        fileSize = newFileSize;
    }
    public String getTitle()
    {
       return title;
    }//end getter
    public String getArtist()
    {
        return artist;
    }//end getter
    public boolean getHasLyrics()
    {
        return hasLyrics;
    }//end getter
    public int getLength()
    {
        return length;
    }//end getter
    public double getFileSize()
    {
        return fileSize;
    }//end getter

    public void setTitle(String newTitle)
    {
        title = newTitle;
    }
    public void setArtist(String newArtist)
    {
        artist = newArtist;
    }
    public void setHasLyrics(boolean newHasLyrics)
    {
        hasLyrics = newHasLyrics;
    }

    // pre condition the object exists
    //post condition : length == newLength validate(0,0)
    public void setLength(int newLength)
    {
        length = checkLength(newLength);
    }

    //Brain Methods
    public String toIntSec()
    {
        int miuntes = length / 60;
        int seconds = length % 60;
        return miuntes + " min " + seconds + " sec";

    }//end brain method to convert length
    /*
    checkLength is a helper method. It is private because
    it "helps" the other public methods by validating entry
    this is an example of method decomposition - each method does
    just one thing
     */

    private int checkLength(int newLength)
    {
        int tempLength = newLength;
        if(tempLength < 0)
        {
            tempLength = 0;
        }//end if
        else if (tempLength > 1200)
        {
            tempLength = 1200;
        }//end if else
        return tempLength;
    }//end length validation method checkLength
    public String toString()
    {
        String output = "";
        output += "Title: " + title ;
        output += "\nArtist: " + artist;
        output += "\nHas Lyrics: " + hasLyrics;
        output += "\nLength (in seconds): " + length;
        output += "\nFile size (in mB): " + fileSize;

        return output;
    }

}   //end class song
