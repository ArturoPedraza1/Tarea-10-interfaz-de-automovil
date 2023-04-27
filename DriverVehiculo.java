package ico.fes;

public class DriverVehiculo {
    public static void main(String[] args){
        camion Camion = new camion("Diesel",3);

        System.out.println(Camion);
        System.out.println(Camion.encender());
        Camion.avanzar();
        Camion.frenar();
        System.out.println(Camion.apagar());
        System.out.println("------Motocicleta------");
        Motocicleta moto = new Motocicleta(150,"Yamaha");
        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.hacerCaballito();
        moto.frenar();
        moto.apagar();
    }
}
