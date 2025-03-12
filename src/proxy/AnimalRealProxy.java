package proxy;

public class AnimalRealProxy implements AnimalInterface {
    private AnimalInterface animal = new AnimalReal();
    @Override
    public String acao(String nome) {
        System.out.println("Proxy: Chamando o método acao do objeto real.");
        String retorno = animal.acao(nome);
        System.out.println("Proxy: Retorno do método acao do objeto real.");
        return retorno;
    }
    
}
