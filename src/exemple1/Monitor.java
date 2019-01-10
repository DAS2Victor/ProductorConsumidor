package exemple1;

public class Monitor {

    private int numero = 0;

    void Monitor() {
        numero = 0;
    }

    public synchronized int afagar() {
        return (numero);
    }

    public synchronized void deixar(int num) {
        numero = num;
    }
}
