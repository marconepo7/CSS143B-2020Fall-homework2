package Problem3;

public class BookRomance extends Book {

    private int lateFeePerDayInDollar = 4;

    public BookRomance(String title, String author) {
        super();
        this.title = title;
        this.author = author;
    }

    public BookRomance(BookRomance anotherBook) {
        super();
        this.title = anotherBook.title;
        this.author = anotherBook.title;
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
