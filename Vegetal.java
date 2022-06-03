public class Vegetal {
    private Boolean vivo;
    private int massa;

    public Vegetal(int massa){
        this.vivo = vivo;
        this.massa = massa;
    }
    public int getMassa(){
        return this.massa;
    }
    public void setVivo(Boolean vivo){
        this.vivo = vivo;
    }

    public void info(){
        System.out.println("--------------------------------");
        System.out.printf("Tipo.:%s%n", getClass().toString());
        System.out.printf("Vivo.:%s%n", this.vivo ? "Sim":"Nao");
        System.out.printf("Massa.:%s%n", this.massa);
        System.out.println("--------------------------------");
    };
}
