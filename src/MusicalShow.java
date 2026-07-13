public class MusicalShow extends Show {
    Person musicAuthor;
    String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void showLibrettoText() {
        System.out.println(this.librettoText);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Либретто:");
        this.showLibrettoText();
    }
}
