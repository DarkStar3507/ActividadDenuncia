class Persona {
    private String nombre;
    private String apellido;
    private Direccion direccion;

    public Persona(String nombre, String apellido, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ", Direccion: " + direccion;
    }
}
