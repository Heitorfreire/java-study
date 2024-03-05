public class Main {
    private String nome;
    private double salarioBruto;
    private double percentualDesconto;

    public Main(String nome, double salarioBruto, double percentualDesconto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.percentualDesconto = percentualDesconto;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public double calcularSalarioLiquido() {
        double desconto = salarioBruto * (percentualDesconto / 100);
        return salarioBruto - desconto;
    }

    public static void main(String[] args) {
        Main funcionario = new Main("João", 2000.0, 10.0);
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário Bruto: " + funcionario.getSalarioBruto());
        System.out.println("Salário Líquido: " + funcionario.calcularSalarioLiquido());
    }
}