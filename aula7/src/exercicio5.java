void main() {
    int count = 0;
    double sum = 0.0;
    while(true) {
        String input = IO.readln();
        if (input.isEmpty()) {
            break;
        }
        double number = Double.valueOf(input);
        count++;
        sum += number;
    }
    IO.println("total: " + count);
    if (count==0) {
        IO.println("média: " + 0);
    } else {
        IO.println("média: " + sum / count);
    }
}