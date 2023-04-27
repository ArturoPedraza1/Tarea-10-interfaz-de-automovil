package ico.fes;

public class camion implements vehiculo{
    private String combustible;
    private double peso;

    public camion(String combustible, double peso) {
        this.combustible = combustible;
        this.peso = peso;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "camion{" +
                "combustible='" + combustible + '\'' +
                ", peso=" + peso +
                '}';
    }

    public camion() {
    }
    public void transportar(){
        System.out.println("Transportando algo");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo el camion de combustible "+this.combustible);
        return Math.random() >=0.2;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando el camion de combustible "+this.combustible);
        return Math.random() >=0.05;
    }

    @Override
    public void avanzar() {
        System.out.println("El camion esta avanzando...");

    }

    @Override
    public void frenar() {
        System.out.println("Frenando");

    }
}
