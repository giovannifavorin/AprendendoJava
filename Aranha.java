public class Aranha extends Animal{
    private int veneno;
    public Aranha(int vel, int massa, int forca, int veneno){
        super(vel, forca, massa);
        this.veneno = veneno;
    }
    @Override
    public void atacar(Animal a){
        if(this.getVivo()){
            if (this.getForca() <= a.getForca()) {
                this.setForca(this.getForca()+a.getMassa());
            }
        if ((this.getForca() + this.veneno) > a.getForca()) {
                this.setForca(this.getForca()+a.getMassa());
                a.setVivo(false);
            } else{
                this.setVivo(false);
            }
        } else {
            System.out.println("--------------------------------");
            System.out.println(this.getClass().toGenericString() + " Esta morto, nao ataca");
            System.out.println("--------------------------------");
        }
    }
}
