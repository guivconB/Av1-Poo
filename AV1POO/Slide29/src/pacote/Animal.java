package pacote;

public class Animal {
    private String nome;
    private String especie;
    private int idade;
    
   public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade);
    }
}
