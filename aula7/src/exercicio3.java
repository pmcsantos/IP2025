void main() {
    IO.println("Simulação IRS");
    int salario = Integer.valueOf(IO.readln("Salário anual? "));
    int escalao = IrsUtil.irsGroup(salario);
    double tax = IrsUtil.irsTax(escalao);
    IO.println("Escalão: " + escalao);
    IO.println("Taxa: " + tax * 100 + "%");
}