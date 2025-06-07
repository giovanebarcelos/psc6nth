package demo;

public class Aluno extends Pessoa {
    private UC uc;

    public Aluno(int codigo, String nome) {
        super(codigo, nome);
    }

    @Override
    public Integer getCodigoMultipled(int num){
        return this.codigo * num + num;
    }
}
