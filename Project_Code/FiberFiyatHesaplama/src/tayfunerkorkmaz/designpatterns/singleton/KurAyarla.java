package tayfunerkorkmaz.designpatterns.singleton;

/**
 *
 * @author tayfunerkorkmaz
 */
public class KurAyarla {

    private static KurAyarla kur = null;
    private double dolar;
    private double euro;
    private static Object lock_obj = new Object();

    private KurAyarla() {
        System.out.println("Singleton Pattern Çalıştı!");
    }

    public static KurAyarla getInstance() {

        synchronized (lock_obj) {
            if (kur == null) {

                kur = new KurAyarla();
            }
        }
        return kur;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

}
