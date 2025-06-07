package demo;

import java.util.HashMap;

public class AutenticadorComplexo
implements Autenticador{

    @Override
    public boolean autenticar(String usuario, String senha) {
        HashMap credenciais = new HashMap<String, String>();

        credenciais.put("muttley", "12345");
        credenciais.put("medinho", "12345");

        return credenciais.get(usuario).equals(senha);
    }
}
