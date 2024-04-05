
import java.util.ArrayList;

class EncargadoCaso extends Persona {
    private ArrayList<ExpedienteDelincuente> expedientes;

    public EncargadoCaso(String nombre, String apellido, Direccion direccion) {
        super(nombre, apellido, direccion);
        expedientes = new ArrayList<>();
    }

    public void asignarExpediente(ExpedienteDelincuente expediente) {
        expedientes.add(expediente);
    }

    @Override
    public String toString() {
        return "Encargado del Caso: " + super.toString();
    }
}