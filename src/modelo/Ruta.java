package modelo;
public class Ruta {
    
    private double distancia;
    private int tiempoEstimado;
    private boolean bloqueada;
    private Nodo nodoOrigen;
    private Nodo nodoDestino;

    public Ruta(Nodo nodoOrigen, Nodo nodoDestino, double distancia) {
        this.nodoOrigen = nodoOrigen;
        this.nodoDestino = nodoDestino;
        this.distancia = distancia;
        this.tiempoEstimado = (int) (distancia / 10);
        this.bloqueada = false;
    }

    public double getDistancia() {
        return distancia;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public boolean getBloqueada() {
        return bloqueada;
    }

    public Nodo getNodoOrigen() {
        return nodoOrigen;
    }

    public Nodo getNodoDestino() {
        return nodoDestino;
    }
}
