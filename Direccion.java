import java.util.ArrayList;

class Direccion {
    private String Departamento;
    private String Municipio;
    private String Colonia_Aldea;
    private int Postal;
    private int Calle;

    private int Bloque;
    private String Referencia;


    public Direccion(String Departamento, String Municipio, String Colonia_Aldea, int Postal, int Calle, int Bloque, String Referencia) {
        this.Departamento = Departamento;
        this.Municipio = Municipio ;
        this.Colonia_Aldea = Colonia_Aldea;
        this.Postal = Postal;
        this.Calle = Calle;
        this.Bloque = Bloque;
        this.Referencia = Referencia;

    }

    @Override
    public String toString() {
        return Departamento + ", " + Municipio + ", " + Colonia_Aldea + ", " + Postal + ", " + Calle + ", " +  Bloque + ", " +  Referencia;
    }
}