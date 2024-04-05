
import java.util.ArrayList;


class ExpedienteDelincuente {
    private Denunciante denunciante;
    private Denunciado denunciado;
    private ArrayList<Delito> listaDelitos;

    public ExpedienteDelincuente(Denunciante denunciante, Denunciado denunciado) {
        this.denunciante = denunciante;
        this.denunciado = denunciado;
        listaDelitos = new ArrayList<>();
    }

    public void agregarDelito(Delito delito) {
        listaDelitos.add(delito);
    }

    public void mostrarExpediente() {
        System.out.println("Denunciante: " + denunciante);
        System.out.println("Denunciado: " + denunciado);
        System.out.println("Delitos:");
        for (Delito delito : listaDelitos) {
            System.out.println(delito);
        }
    }
}