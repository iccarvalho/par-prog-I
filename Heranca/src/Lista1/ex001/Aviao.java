package Lista1.ex001;

public class Aviao extends Veiculo {
    private double altitudeMax;

    public Aviao() {
        super();
    }

    public Aviao(String marca, String modelo, double velocidade, double altitudeMax) {
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
    }

    public void setAltitudeMax(double altitudeMax) {
        this.altitudeMax = altitudeMax;
    }

    public double getAltitudeMax() {
        return this.altitudeMax;
    }

    @Override
    public String toString() {
        return "Aviao{ " +
                super.toString() +
                ", altitudeMax: " + altitudeMax + " m" +
                " }";
    }

    @Override
    public void mover() {
        System.out.println("Avião voando a " + this.velocidade + " km/h e " + this.altitudeMax + " metros...");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo com querosene de avião...");
    }
}
