package aulas;

public class Gastos {
    private String nome;
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    private float volume;
    /**
     * @return the volume
     */
    public float getVolume() {
        return volume;
    }

    private float distanciaPercorrida;
    /**
     * @return the distanciaPercorrida
     */
    public float getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    private float autonomia;
    /**
     * @return the autonomia
     */
    public float getAutonomia() {
        return autonomia;
    }
    
    public Gastos(String nome, float volume, float distanciaPercorrida) {
        super();
        this.nome = nome;
        this.volume = volume;
        this.distanciaPercorrida = distanciaPercorrida;
        autonomia = new RegrasNegocio().calcularAutonomia(distanciaPercorrida, volume);
    }   
    
    @Override
    public String toString() {
        return String.format("%s %.0f %.3f %.3f", nome, distanciaPercorrida, volume, autonomia);
    }
}
