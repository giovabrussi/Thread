public class App {
    public static void main(String[] args) throws Exception {

        Corridore c1 = new Corridore("Francesco");
        Corridore c2 = new Corridore("Andrea");
        Corridore c3 = new Corridore("Giuseppe");
        Corridore c4 = new Corridore("Obama");

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        //Thread.sleep(3000);
        
        c1.join();
        c2.join();
        c3.join();
        c4.join();

        System.out.println("La gara è finita");

    }
}