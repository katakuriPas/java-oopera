import java.util.ArrayList;

public class MusicalShow extends Show{

    protected Person musicAuthor;
    protected String librettoText;


    public MusicalShow(String title, int duration, Director director, Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getLibrettoText(){
        return librettoText;
    }

}
