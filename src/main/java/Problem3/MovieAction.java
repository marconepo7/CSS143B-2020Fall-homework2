package Problem3;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        super();
        this.title = title;
        this.rating = rating;

    }

    public MovieAction(MovieAction anotherMovie) {
        super();
        this.title = anotherMovie.title;
        this.rating = anotherMovie.rating;
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
         else if (numOfDaysPastDue > 5) {
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
