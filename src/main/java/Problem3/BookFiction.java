package Problem3;

import java.util.UUID;

public class BookFiction extends Book {

    private int lateFeePerDayInDollar = 2;

    private String genres;

    public BookFiction(String title, String author, String genres) {
        super.title = title;
        super.author = author;
        this.genres = genres;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public BookFiction(BookFiction anotherBook) {
        super.title = anotherBook.title;
        super.author = anotherBook.author;
        this.genres = anotherBook.genres;
        super.id = anotherBook.id;
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
