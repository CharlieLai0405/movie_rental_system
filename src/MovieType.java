package src;

enum MovieType {
    NEW_RELEASE(3.0, 0, 0, 2.0),
    REGULAR(2.0, 2, 1.5, 1.0),
    CHILDREN(1.5, 3, 1.5, 0.5);

    private final double basePrice;
    private final int defaultDays;
    private final double delayedPrice;
    private final double point;

    MovieType(double basePrice, int defaultDays, double delayedPrice, double point) {
        this.basePrice = basePrice;
        this.defaultDays = defaultDays;
        this.delayedPrice = delayedPrice;
        this.point = point;
    }

    public double getBasePrice() { return basePrice; }
    public int getDefaultDays() { return defaultDays; }
    public double getDelayedPrice() { return delayedPrice; }
    public double getPoint() { return point; }
}
