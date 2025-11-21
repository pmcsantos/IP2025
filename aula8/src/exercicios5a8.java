void main() {
    Interval in = new Interval(2.2, 5.6);
    IO.println(in.contains(3.5));
    double[] array = {3.2, 1.2, 4.3, 2.9, 6.3, 10.4, 3.1, 5.1};
    int count = DoubleStats.count(array, in);
    IO.println(count);
    double[] newArray = DoubleStats.filter(array, in);
    IO.println(Arrays.toString(newArray));

}
