public class AutomovilStatic {

    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru","Impreza",Color.BLANCO,2.0,40);
        Automovil mazda = new Automovil("Mazda","BT-50",Color.AMARILLO,4.0);
        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,3.5,50);
        Automovil nissan2 = new Automovil("Nissan","Navara",Color.ROJO,3.5,50);
        mazda.setTipo(Tipo.FURGON);
        subaru.setTipo(Tipo.HATCHBACK);
        nissan.setTipo(Tipo.PICKUP);
        nissan2.setTipo(Tipo.CONVERTIBLE);


        //  nissan2.setColor(Color.NARANJA);               //De esta forma, el atributo solo cambia para el objeto que lo invoque.
        //nissan2.colorPatente = "Verde";       //De esta forma, el atributo cambia de forma general y afecta a todos los objetos que lo invoquen.
        //Automovil.setColorPatente("Verde");       //Como buena práctica es mejor y más utilizado la forma clase.atributo no con el objeto como la línea 11-
        Automovil.setColorPatente(Color.BLANCO);
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());
        //System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente().getColor());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente()); // Porque se sobrecarga el método toString() en el Enum y de forma automática en la salida por consola obtiene el valor asociado a la constante color.
        System.out.println("Velocidad maxima en carretera = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima en ciudad = " +Automovil.VELOCIDAD_MAX_CIUDAD);

        Tipo tipoSubaru = subaru.getTipo();
        System.out.println("tipo subaru: " + tipoSubaru.getNombre());
        System.out.println("Detalle: " + tipoSubaru.getDetalle());

    }

}