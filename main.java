public class main {
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("Francisco Morzan", "Comayaguela", "Villa union", 12101, 2, 4, "Junto a centro de salud");
        Direccion direccion2 = new Direccion("Francisco Morazan", "Tegucigalpa", "La Kennedy", 11101, 3, 2, "Frente a iglesia");
        Direccion direccion3 = new Direccion("Cortes", "San pedro Sula", "Colonia Jardines del Valle", 21103, 1, 6, "Al lado de Farmacia");

        Denunciante denunciante = new Denunciante("Juan", "Perez", direccion1);
        Denunciado denunciado = new Denunciado("Pedro", "Gonzalez", direccion2);
        EncargadoCaso encargado = new EncargadoCaso("Maria", "Lopez", direccion3);

        Delito robo = new Delito("Robo", "Asalto a mano armada");
        Delito fraude = new Delito("Fraude", "Estafa bancaria");
        Delito Homicidio = new Delito("Homicidio", "Asesinato premeditado");

        ExpedienteDelincuente expediente = new ExpedienteDelincuente(denunciante, denunciado);
        expediente.agregarDelito(robo);
        expediente.agregarDelito(fraude);

        encargado.asignarExpediente(expediente);

        System.out.println("Expediente:");
        expediente.mostrarExpediente();
        System.out.println("Encargado:");
        System.out.println(encargado);
    }
}
