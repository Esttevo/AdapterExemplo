public class AdapterMPHParaKm implements VelocidadeKm{

    private VelocidadeEmMPH adaptee;
    
    public AdapterMPHParaKm(VelocidadeEmMPH adaptee) {
        this.adaptee = adaptee;
    }

    public double getVelocidadeEmKm() {
        return adaptee.getVelocidadeEmMPH() * 1.6;
    }

    public double tempoEmMinutos(double tempo) {
       return tempo * 60.0;
    }
}
