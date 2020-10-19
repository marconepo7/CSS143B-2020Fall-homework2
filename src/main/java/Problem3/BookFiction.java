package Problem3;

public class BookFiction extends Book {

    private int lateFeePerDayInDollar = 2;

    private String genres;

    public BookFiction(String title, String author, String genres) {
        super();
        super.title = title;
        this.author = author;
        this.genres = genres;
    }

    // copy constructor
    public BookFiction(BookFiction anotherBook) {
        this.title = anotherBook.title;
        this.author = anotherBook.author;
        this.genres = anotherBook.genres;
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        int lateFees;
        if (numOfDaysPastDue <= 0) {
            return 0;
        }
        else {
            lateFees = (numOfDaysPastDue * lateFeePerDayInDollar);
            return lateFees;
        }

    }
}
