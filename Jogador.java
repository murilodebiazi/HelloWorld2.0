package JogoDaVelha;

public class Jogador {
    private String nome;
    private int id;
    private char simbolo;

    public Jogador(String nome, int id, char simbolo){
        this.nome = nome;
        this.id = id;
        this.simbolo = simbolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", simbolo=" + simbolo +
                '}';
    }
}
