void main() {
    IO.println("Tabela de escalões IRS");
    int min = Integer.valueOf(IO.readln("Primeiro escalão: "));
    int max = Integer.valueOf(IO.readln("Último escalão: "));
    assert min >= 1 && max <= 4;
    for (int i = min; i<=max;i++) {
        IO.println(i + " | " + IrsUtil.irsTax(i) * 100 + "%");
        if (i!=max) {
            IO.println("---------");
        }
    }
}