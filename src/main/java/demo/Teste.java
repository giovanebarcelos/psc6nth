package demo;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(1, "Dick Vigarista");

        System.out.printf("Código: %d\n\n", pessoa.getCodigoMultipled(5));
        System.out.printf("Código: %s\n\n", pessoa.getCodigoMultipled("5"));

        Aluno aluno = new Aluno(2, "Penélope Charmosa");

        System.out.printf("Código: %d\n\n", aluno.getCodigoMultipled(3));
        System.out.printf("Código: %s\n\n", aluno.getCodigoMultipled("3"));
    }
}
