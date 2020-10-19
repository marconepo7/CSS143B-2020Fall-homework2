package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.rating = rating;
    }

    public Movie(Movie anotherMovie) {
        this.id = anotherMovie.id;
        this.title = anotherMovie.title;
        this.rating = anotherMovie.rating;
    }

    @Override
    public boolean equals(Object obj) {
        if (id.equals(this.id)) {
            return true;
        }
        else {
            return false;
        }
    }
}
