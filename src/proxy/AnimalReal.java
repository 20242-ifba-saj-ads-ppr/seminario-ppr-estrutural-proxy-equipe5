package proxy;

public class AnimalReal implements AnimalInterface {
    @Override
    public String acao(String nome) {
        return "O animal " + nome + " está andando.";
    }
    
}
