package Algoritmos;
import java.util.List;
import modelo.Nodo;

public interface IPlanRuta {
    List<Nodo> calcularRuta(Nodo origen, Nodo destino);
}