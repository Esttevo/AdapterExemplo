public class VelocidadeEmKm implements VelocidadeKm{

    double velocidadeEmKm = 1.0;

    public VelocidadeEmKm(double velocidade) {
        this.velocidadeEmKm = velocidade;
    }
    
    
    public double getVelocidadeEmKm() {
        return velocidadeEmKm;
    }
    public double getTempoDePercurso(){
        double tempo = velocidadeEmKm / 15.0;
        return tempo;
    }

    public double tempoEmMinutos(double tempo) {
        return tempo * 60;
    }

}
