public class Rental {

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
