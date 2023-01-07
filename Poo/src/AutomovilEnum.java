public class AutomovilEnum {

    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(Tipo.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0);
        mazda.setTipo(Tipo.PICKUP);
        System.out.println("mazda fabricante = " + mazda.getFabricante());

        Tipo tipo = subaru.getTipo();
        System.out.println("tipo subaru: " + tipo.getNombre());
        System.out.println("Detalle: " + tipo.getDetalle());

        tipo = mazda.getTipo();

        switch (tipo) {
            case CONVERTIBLE:
                System.out.println("El auto es deportivo y descapotable de dos puertas");
                break;

            case COUPE:
                System.out.println("Es un auto pequeño, de dos puertas y por lo general deportivo");
                break;

            case FURGON:
                System.out.println("Auto utilitario de transporte, para empresas");
                break;

            case HATCHBACK:
                System.out.println("Auto con tamaño mediano, compacto y aspecto deportivo");
                break;

            case PICKUP:
                System.out.println("El auto es de tipo doble cabina o camioneta");
                break;

            case SEDAN:
                System.out.println("Es un automóvil mediano");
                break;

            case STATION_WAGON:
                System.out.println("Automóvil grande, con baúl grande.");
                break;
        }

        /*switch (tipo) {
            case CONVERTIBLE:
                System.out.println("El auto es deportivo y descapotable de dos puertas");
                break;

            case COUPE:
                System.out.println("Es un auto pequeño, de dos puertas y por lo general deportivo");
                break;

            case FURGON:
                System.out.println("Auto utilitario de transporte, para empresas");
                break;

            case HATCHBACK:
                System.out.println("Auto con tamaño mediano, compacto y aspecto deportivo");
                break;

            case PICKUP:
                System.out.println("El auto es de tipo doble cabina o camioneta");
                break;

            case SEDAN:
                System.out.println("Es un automóvil mediano");
                break;

            case STATION_WAGON:
                System.out.println("Automóvil grande, con baúl grande.");
                break;
        }*/ // Se puede utilizar el clásico switch case pero a partir del jdk 13

        //Nueva estructura del switch case
        switch (tipo) {
            case CONVERTIBLE -> System.out.println("El auto es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es un auto pequeño, de dos puertas y por lo general deportivo");
            case FURGON -> System.out.println("Auto utilitario de transporte, para empresas");
            case HATCHBACK -> System.out.println("Auto con tamaño mediano, compacto y aspecto deportivo");
            case PICKUP -> System.out.println("El auto es de tipo doble cabina o camioneta");
            case SEDAN -> System.out.println("Es un automóvil mediano");
            case STATION_WAGON -> System.out.println("Automóvil grande, con baúl grande.");
        }

        //Enum pueden ser utilizados como constantes, porque no son variables.
        //Por ejemplo los días de la semana lunes, martes, etc.. los nombres de planetas, etc..
        Tipo[] tipos = Tipo.values();
        for (Tipo ta: tipos) {
            System.out.print(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDetalle() + ", " +
                    ta.getPuertas() + "\n");
        }

    }
}