package proxy;

public class Sistema {
    AnimalRealProxy animal = new AnimalRealProxy();
    public  String acao(String nome) {
        return animal.acao(nome);
    }
}
