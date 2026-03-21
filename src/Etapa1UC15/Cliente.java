package Etapa1UC15;

public class Cliente {
    private int id;
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;

public Cliente(int id, String nome, String cpf, String telefone, String endereco){
    this.id = id;
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.endereco = endereco;
}
   public int getId() {
        return id;
    }
    public String  getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
}