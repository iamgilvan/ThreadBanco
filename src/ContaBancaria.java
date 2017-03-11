public class ContaBancaria {

    private float saldo;
    private boolean pronto;

    public float getSaldo() {
        return saldo;
    }
    
    //Construtor
    ContaBancaria(float v) {
            saldo = v;
    }

    public synchronized void deposita(float v) throws InterruptedException {
        while(pronto){
            wait();
        }    
        saldo += v;
        pronto=true;
        notify();
    }
    
    public synchronized void retira(float v) throws InterruptedException {
        while(!pronto){
            wait();
        }
        saldo -= v;
        pronto=false;
        notify();
    }
}