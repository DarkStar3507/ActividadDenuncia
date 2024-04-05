class Denunciante extends Persona {
    public Denunciante(String nombre, String apellido, Direccion direccion) {
        super(nombre, apellido, direccion);
    }

    @Override
    public String toString() {
        return "Denunciante: " + super.toString();
    }
}