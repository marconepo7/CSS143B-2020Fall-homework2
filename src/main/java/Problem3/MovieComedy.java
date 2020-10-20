package Problem3;

import java.util.UUID;

public class MovieComedy extends Movie {
    private int lateFeePerDayInDollar = 3;

    public MovieComedy(String rating, String title) {
        super.title = title;
        super.rating = rating;
        this.id = UUID.randomUUID();
    }

    public MovieComedy(MovieComedy anotherMovie) {
        super.title = anotherMovie.title;
        super.rating = anotherMovie.rating;
        super.id = anotherMovie.id;
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
