public class Automovil2 { //Una clase puede ser public o default (class nombre)
    //Atributos de la clase automóvil.

    //Relaciones de clases persona, motor, estanque, rueda, tipo de motor con la clase automóvil
    private Tipo tipo;
    private int id;

    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;

    private static Color colorPatente = Color.NARANJA; //No se usa this, el nombre de la clase o solamente el nombre del atributo.

    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120; //En el 99% de las veces son públicas, el modificador de acceso es public.
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris oscuro";

    //Constructor default.
    public Automovil2() { //Así cada vez que se cree un nuevo objeto en el constructor se incrementara en 1 por cada invocación del constructor;
        this.id = ++ultimoId;
    }

    public Automovil2(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public Automovil2(String fabricante, String modelo) {
        this();         // Se llama al constructor por default.
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil2(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);        //Sobrecarga de constructores
        this.color = color;
    }

    public Automovil2(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);  //Sobrecarga de constructores
        this.motor = motor;
    }

    public Automovil2(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);   //Sobrecarga de constructores
        this.estanque = estanque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil2.colorPatente = colorPatente;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String verDetalle() { //Método de la clase automóvil

        return "auto.id = " + this.id +
                "\nauto = " + this.getFabricante() + //Cada vez que se quiera acceder a un atributo o método de la misma clase, se utiliza el this.
                "\nmodelo = " + this.getModelo() +
                "\ntipo = " + this.getTipo().getDetalle() +
                "\ncolor = " + this.getColor().getColor() +
                "\nauto.patenteColor = " + Automovil2.colorPatente.getColor() +
                "\ncilindrada = " + this.motor.getCilindrada(); //Se puede utilizar los get o directamente con this porque son de la misma clase.

    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public double calcularConsumo(int km, float porcentajeGasolina) {
        return km / (this.estanque.getCapacidad() * porcentajeGasolina);
    }

    public double calcularConsumo(int km, int porcentajeGasolina) {
        return km / (this.estanque.getCapacidad() * (porcentajeGasolina / 100f));
    }

    //sobre-escritura de métodos


    @Override //Es una marca que indica al compilador en tiempo ejecución que se está sobrescribiendo un método de la clase padre.
    public boolean equals(Object obj) {

        if(this == obj){    //Si ambos son iguales por referencia, retorna true.
            return true;
        }
        if(!(obj instanceof Automovil2)){ //Si el objeto no es instancia del tipo de objeto Automóvil, retorna falso y salimos.
            return false;
        }

        Automovil2 a = (Automovil2) obj;
        return (this.fabricante != null && this.modelo != null &&
                this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo())); //validar que los datos no sean null para evitar un nullPointerException o error en tiempo de ejecución.
    }

    @Override
    public String toString() { // Representa la salida del objeto como una cadena. Por default el método se invoca de forma automática en cada salida/impresión.
        // El valor hexadecimal corresponde al hashcode, un, id único para cada objeto.
        return this.id + ": " + this.fabricante + " " + this.modelo;
    }
}