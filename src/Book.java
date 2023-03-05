public class Book {
    public String title;
    public int pages;
    public int releaseYear;

   public Book (){ //- šis metodas=funkcijos vadinasi- kontruktorius

   }

    public Book(String title, int pages, int releaseYear) {
        this.title = title;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() { //- overidintas metodas
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
