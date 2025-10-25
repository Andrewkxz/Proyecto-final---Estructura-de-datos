package modelo;
import java.util.List;
import java.util.ArrayList;

public class GestionDesastresNaturales {

    private List<EquipoRescate> listaEquiposRescate;
    private ColasEvacuacion listaEvacuaciones;
    private GrafoDirigido grafo;

    public GestionDesastresNaturales() {
        this.listaEquiposRescate = new ArrayList<EquipoRescate>();
        this.listaEvacuaciones = new ColasEvacuacion();
        this.grafo = new GrafoDirigido();
    }

    public void agregarEquipo(EquipoRescate equipo) {
        listaEquiposRescate.add(equipo);
    }

    public void agregarNodo(Nodo nodo) {
        grafo.agregarNodo(nodo);
    }

    public void agregarRuta(Nodo origen, Nodo destino, double distancia) {
        grafo.agregarRuta(origen, destino, distancia);
    }

    public List<EquipoRescate> getListaEquiposRescate() {
        return listaEquiposRescate;
    }

    public ColasEvacuacion getListaEvacuaciones() {
        return listaEvacuaciones;
    }

    public GrafoDirigido getGrafo() {
        return grafo;
    }
}