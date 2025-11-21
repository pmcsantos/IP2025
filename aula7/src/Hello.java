void main(String[] args) {
    String texto = "Hello";
    char[] chars = texto.toCharArray();
    for (int i=0;i<chars.length;i++) {
        IO.print(chars[i] + ",");
    }
}

int next(int n) {
    assert n>4;
    return n+1;
}