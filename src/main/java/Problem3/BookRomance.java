package Problem3;

import java.util.UUID;

public class BookRomance extends Book {

    private int lateFeePerDayInDollar = 4;

    public BookRomance(String title, String author) {
        super.title = title;
        super.author = author;
        super.id = UUID.randomUUID();
    }

    public BookRomance(BookRomance anotherBook) {
        super.title = anotherBook.title;
        super.author = anotherBook.author;
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
