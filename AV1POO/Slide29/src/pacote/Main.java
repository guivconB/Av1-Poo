package pacote;

public class Main {
	
    public static void main(String[] args) {
        Animal meuCachorro = new Animal("Doguito" , "Cachorro" , 1);

        meuCachorro.exibirInformacoes();
        meuCachorro.setIdade(2);
        meuCachorro.exibirInformacoes();
    }
}
