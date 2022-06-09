public abstract class Membros implements IApresentacao, IPostarMensagem {


    private String email;
    private String nome;
    private EnumFuncoes funcao;


    public Membros(String email, String nome, EnumFuncoes funcao) {
        this.email = email;
        this.nome = nome;
        this.funcao = funcao;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public EnumFuncoes getFuncao() {
        return funcao;
    }


    public void setFuncao(EnumFuncoes funcao) {
        this.funcao = funcao;
    }


    @Override
    public String toString() {
        return "Membro {Nome = " + nome + ", Função = " + funcao + ", E-mail = " + email + "}";
    }
}

