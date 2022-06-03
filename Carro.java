public class Carro {
    private String nome;
    private Boolean ligado;
    private Boolean destruido;
    private int blindagem;
    private Boolean armamento;

    public Carro(String nome) {
        this.nome = nome;
        this.ligado = false;
        this.destruido = false;
        this.blindagem = 0;
        this.armamento = false;
    }
    public String getNome() {
        return this.nome;
    }
    public Boolean getLigado() {
        return this.ligado;
    }
    public Boolean setLigado(Boolean ligado) {
        return this.ligado = ligado;
    }
    
}
