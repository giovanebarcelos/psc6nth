package demo;

public class AutenticadorSimples
        implements Autenticador{
    @Override
    public boolean autenticar(String usuario, String senha) {
        return "muttley".equals(usuario) &&
                "12345".equals(senha);
    }
}
