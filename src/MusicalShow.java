import java.util.ArrayList;

public class MusicalShow extends Show{

    public String musicAuthor;
    public String librettoText;


    public MusicalShow(String title, int duration, Director director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getLibrettoText(){
        return librettoText;
    }

}
