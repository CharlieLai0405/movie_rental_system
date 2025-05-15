public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovieName() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public double getCharge() {
        MovieType type = movie.getPriceCode();
        double charge;

        if (type == MovieType.NEW_RELEASE) {
            charge = daysRented * type.getBasePrice();
        } else {
            charge = type.getBasePrice();
            if (daysRented > type.getDefaultDays()) {
                charge += (daysRented - type.getDefaultDays()) * type.getDelayedPrice();
            }
        }

        return charge;
    }

    public double getFrequentRenterPoints() {
        return movie.getPriceCode().getPoint();
    }
}
