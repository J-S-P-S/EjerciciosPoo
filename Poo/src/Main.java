public class Main {

    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru","Impreza",Color.GRIS,2.0,40);
        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,4.0);
        Automovil nissan = new Automovil("Nissan","Navara",Color.NARANJA,3.5,50);
        Automovil nissan2 = new Automovil("Nissan","Navara",Color.AZUL,3.5,50);

        Automovil2 subaru2 = new Automovil2();
        Motor motorSubaru = new Motor(2.0,TipoMotor.BENCINA);
        subaru2.setMotor(motorSubaru);
        subaru2.setEstanque(new Estanque());


        System.out.println(nissan.toString());
        System.out.println("Son iguales? = " + (nissan == nissan2));
        System.out.println("Son iguales con equals? = " + (nissan.equals(nissan2))); //Es true porque se sobrescribió el método equals y se comparan los 2 objetos con los argumentos Fabricante y modelo.

        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerar(3000));
        //System.out.println(subaru.frenar());
        System.out.println(subaru.acelerarFrenar(4000));
        //Polimorfismo distintas formas de hacer lo mismo, método calcularConsumo.
        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300,0.6f)); // Principio de encapsulamiento y una parte de sobrecarga de métodos, donde hay varios métodos con el mismo nombre, visibilidad y retorno pero tienen diferentes argumentos
        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300,60));   // Principio de encapsulamiento y una parte de sobrecarga de métodos, donde hay varios métodos con el mismo nombre, visibilidad y retorno pero tienen diferentes argumentos
        System.out.println();
        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerar(2000));
        //System.out.println(mazda.frenar());
        System.out.println(mazda.acelerarFrenar(6000));
        System.out.println(nissan.verDetalle());
        System.out.println("Kilómetros por litro " + nissan.calcularConsumo(300,60));   // Principio de encapsulamiento y una parte de sobrecarga de métodos, donde hay varios métodos con el mismo nombre, visibilidad y retorno pero tienen diferentes argumentos

    }
}
