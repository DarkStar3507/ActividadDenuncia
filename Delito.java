
class Delito {
    private String tipo;
    private String descripcion;
    private String Homicidio;

    public Delito(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.Homicidio = Homicidio;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getHomicidio() {
        return Homicidio;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Descripción: " + descripcion;
    }
}