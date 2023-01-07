public enum Tipo {

    SEDAN("Sedan", "Auto mediano", 4),
    STATION_WAGON("Station Wagon", "Auto grande", 5),
    HATCHBACK("HatchBack", "Auto compacto", 5),
    PICKUP("PickUp", "Camioneta", 4),
    COUPE("Coupé", "Auto pequeño", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgón", "Auto utilitario", 3);

    private final String nombre;
    private final int puertas;
    private final String detalle;

    Tipo(String nombre, String detalle, int puertas) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.puertas = puertas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuertas() {
        return puertas;
    }

    public String getDetalle() {
        return detalle;
    }
}