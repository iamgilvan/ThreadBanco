
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadDeposita extends Thread {
    
    private ContaBancaria c;
    
    //Construtor
    ThreadDeposita(ContaBancaria c) {
           this.c = c;
    }
    
    public void run() {
        for (int i = 0; i < 10; i++)
            try {
                c.deposita(300f);
                System.out.println("Deposita R$ 300,00");
                System.out.println("Saldo: " + c.getSaldo());
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadDeposita.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}