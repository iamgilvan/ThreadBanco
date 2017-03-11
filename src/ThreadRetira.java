
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadRetira extends Thread {
    
    private ContaBancaria c;

    //Construtor
    ThreadRetira(ContaBancaria c) {
            this.c = c;
    }
    
    public void run() {
        for (int i = 0; i < 10; i++)
                try {
                    c.retira(100f);
                    System.out.println("Retira R$ 100,00");
                    System.out.println("Saldo: " + c.getSaldo());
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadRetira.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}