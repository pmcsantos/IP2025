record Interval(double min, double max) {

    boolean contains(double r) {
        return r>=min && r<=max;
    }
}