/*
@author Barbara Anger
2018. Copyright. All Rights reserved.
*/
public class Lampada {
   boolean lampada = true;
    void on(int lampada) {
        lampada = true;
    }
    void off(int lampada) {
        lampada = false;
    }
}
public class Imp extends Lampada {
    boolean isOff() {
        if (lampada == true) {
            return true;
        } else {
            return false;
        }
    }

}
public class Classe {
    public lampadaligada(String lampada) {
        super(lampada);
        this.lampada = lampada;
    }
}
public static void main(String[] args) {
    lampada = new Lampada();
    lampada.isOff();
    System.out.println("está" + lampada);
}
