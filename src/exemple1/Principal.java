package exemple1;

public class Principal {

    public static void main(String[] args) throws InterruptedException {
        Monitor saf = new Monitor();

        Productor p = new Productor(saf);
        Consumidor c = new Consumidor(saf);
        Thread productor = new Thread(p);
        Thread consumidor = new Thread(c);

        productor.start();
        consumidor.start();
    }

}
