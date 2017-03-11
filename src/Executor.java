
public class Executor {

    public static void main(String[] args) {
        
        ContaBancaria c = new ContaBancaria(100f);

        System.out.println("Saldo: " + c.getSaldo());
        
	ThreadDeposita td = new ThreadDeposita(c);
	ThreadRetira tr = new ThreadRetira(c);

	td.start();
	tr.start();
        
    }
}