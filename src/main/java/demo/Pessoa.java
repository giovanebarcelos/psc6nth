package demo;

public class Pessoa {
    Integer codigo;
    private String nome;

    public Pessoa(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public Integer getCodigoMultipled(int num){
        return this.codigo * num;
    }

    public Integer getCodigoMultipled(String num){
        return this.codigo * Integer.parseInt(num);
    }
}
