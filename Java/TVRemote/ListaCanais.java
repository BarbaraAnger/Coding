public class ListaCanais {

    double[] canais = new double[100];

    public ListaCanais() {

    }

    public void adicinarFrequencia(int c, double f) {
        canais[c] = f;

    }

    public void printCanais() {
        for (int i = 0; i < 100; i++) {
            System.out.printf(" Canal: %d Frequncia: %.2f\n", i, canais[i]);
        }
    }

    public void printCanal(int c) {

        System.out.printf("Canal: %d Frequncia: %.2f\n", c, canais[c]);
    }
}
