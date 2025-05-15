package src;

public class Movie {
    private String name;
    private MovieType type;

    public Movie(String name, MovieType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public MovieType getType() {
        return type;
    }

    public void setType(MovieType type) {
        this.type = type;
    }

    public double getPoint() {
        return type.getPoint();
    }

    public double getBasePrice() {
        return type.getBasePrice();
    }

    public int getDefaultDays() {
        return type.getDefaultDays();
    }

    public double getDelayedPrice() {
        return type.getDelayedPrice();
    }

    public MovieType getPriceCode() {
        return type;
    }
}
