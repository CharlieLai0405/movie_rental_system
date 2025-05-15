public class Movie {
    private String name;
    private MovieType type;

    public Movie(String name, MovieType type) {
        this.name = name;
        this.type = type;
    }

    public double getCharge(int daysRented) {
        double base = type.getBasePrice();
        int defaultDays = type.getDefaultDays();
        double delayedPrice = type.getDelayedPrice();

        if (daysRented <= defaultDays) {
            return base;
        } else {
            return base + (daysRented - defaultDays) * delayedPrice;
        }
    }

    public double getPoints() {
        return type.getPoint();
    }

    public String getName() {
        return name;
    }

    public MovieType getType() {
        return type;
    }

    public void setType(MovieType newType) {
        this.type = newType;
    }
}
