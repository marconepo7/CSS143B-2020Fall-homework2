package Problem3;

import java.util.UUID;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {

        super.title = title;
        super.rating = rating;
        super.id = UUID.randomUUID();
    }

    public MovieAction(MovieAction anotherMovie) {
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
         else if (numOfDaysPastDue >= 5) {
            lateFees = (2 * numOfDaysPastDue * lateFeePerDayInDollar);
            return lateFees;
        }
        else
        {
            lateFees = (numOfDaysPastDue * lateFeePerDayInDollar);
            return lateFees;
        }
    }
}
