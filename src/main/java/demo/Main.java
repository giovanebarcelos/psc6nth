package demo;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Autenticador autenticador = new AutenticadorComplexo();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Usuário: ");
        String usuario = scanner.next();
        System.out.print("Senha: ");
        String senha = scanner.next();

        if (autenticador.autenticar(usuario,senha)){
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }

    }
}
