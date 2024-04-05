class Denunciado extends Persona {
    public Denunciado(String nombre, String apellido, Direccion direccion) {
        super(nombre, apellido, direccion);
    }

    @Override
    public String toString() {
        return "Denunciado: " + super.toString();
    }
}