package Etapa1UC15;

public class Usuario {
    
    private int id;
    private String login;
    private String senha;
    private String tipo;

    public Usuario(int id, String login, String senha, String tipo) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean validarCpf(String cpf){
        cpf = formatarCpf(cpf);
        return false;
    }

    public static String formatarCpf(String cpf) {
        if (cpf == null) {
            return "erro";
        }

        return cpf;
    }
}