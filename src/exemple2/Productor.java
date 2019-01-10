
package exemple2;


class Productor implements Runnable {

    private Monitor safata;

    public Productor(Monitor s) {
        safata = s;
    }
    private int numero = 0;

    public void run() {

        for (int i = 0; i < 5; i++) {
            numero = (int) (10 * Math.random());
            safata.deixar(numero);
            System.out.println("Produït el número " + numero);
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {;
            }
        }
    }
}
