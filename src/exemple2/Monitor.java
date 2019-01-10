package exemple2;

class Monitor {
    private static int MIDA;
    private int pila[];
    private int segNum;
    
    public Monitor(int mida){
        this.MIDA = mida;
        this.segNum = 0;
        this.pila = new int[MIDA];
    }

    public synchronized int afagar() {

        while (segNum==0) 
        {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }

        segNum--;
        notify();
        return (pila[segNum]);

    }

    public synchronized void deixar(int num) {

        while (segNum==MIDA)
        {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }

        pila[segNum] = num;
        segNum++;
        notify();
    }
}
