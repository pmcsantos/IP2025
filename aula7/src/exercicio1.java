void main() {
    for(int i=0;i<10;i++) {
        IO.print("Cara ou coroa? ");
        double r = Math.random();
        if (r<0.5) {
            IO.println("cara!");
        } else {
            IO.println("coroa!");
        }

    }
}