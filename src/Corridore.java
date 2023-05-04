public class Corridore extends Thread{
    
    private String nome;

    public Corridore(String nome) {
        this.nome = nome;
    }

    @Override
    public void run(){
        for (int i = 1; i < 100; i++) 
            System.out.println(nome + " " + i + " metri");     
        
        System.out.println("+++"+nome+" è arrivato+++");
    }

}
