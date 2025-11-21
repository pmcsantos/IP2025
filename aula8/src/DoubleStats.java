class DoubleStats{
    static double min(double[] array) {
        double m = array[0];
        int i = 1;
        while (i < array.length) {
            if (array[i] < m) {
                m = array[i];
            }
            i++;
        }
        return m;
    }

    static double max(double[] array) {
        double m = array[0];
        int i = 1;
        while (i < array.length) {
            if (array[i] > m) {
                m = array[i];
            }
            i++;
        }
        return m;
    }

    static double sum(double[] array) {
        double sum = 0;
        for (int i=0; i<array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }

    static double average(double[] array) {
        return sum(array) / array.length;
    }

    static int count(double[] array, Interval interval) {
        int count = 0;
        for (int i=0; i<array.length; i++) {
            if (interval.contains(array[i])) {
                count++;
            }
        }
        return count;
    }

    static double[] filter(double[] array, Interval interval) {
        int size = count(array, interval);
        double[] filteredArray = new double[size];
        int index = 0;
        for (int i=0; i<array.length;i++) {
            if (interval.contains(array[i])) {
                filteredArray[index] = array[i];
                index++;
            }
        }
        return filteredArray;
    }

}