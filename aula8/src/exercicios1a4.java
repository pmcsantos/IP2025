void main() {
    Range range = new Range(4,10);
    print(range);
    printReverse(range);
    int[]array = naturals(range);
    IO.println(Arrays.toString(array));
    IO.println(cut("bela string!", range));
    Range f = findFirst("que", "so sei que nada sei");
    IO.println(f);

}

static void print(Range r) {
    for (int i=r.min(); i<=r.max(); i++) {
        if (i==r.max()) {
            IO.println(i);
        } else {
            IO.print(i + " ");
        }
    }
}

static void printReverse(Range r) {
    for (int i=r.max(); i>=r.min(); i--) {
        if (i==r.min()) {
            IO.println(i);
        } else {
            IO.print(i + " ");
        }
    }
}

static int[] naturals(Range r) {
    int[] array = new int[r.length()];
    for (int i=r.min();i<=r.max();i++) {
        array[i - r.min()] = i;
    }
    return array;
}

static String cut(String s, Range r) {
    assert s.length() >= r.max() + 1;
    String n = s.substring(0,r.min()) + s.substring(r.max() + 1);
    return n;
}

static Range findFirst(String find, String s) {
    if (!s.contains(find)) {
        return null;
    } else {
        int minIndex = s.indexOf(find);
        int maxIndex = minIndex + find.length() - 1;
        return new Range(minIndex,maxIndex);
    }
}

