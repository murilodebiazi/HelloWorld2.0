public class Vaga {
    private int andar;
    private int pessoas;
    private boolean coberta;
    private String placa;

    public Vaga(int andar, int pessoas, boolean coberta){
        this.andar = andar;
        this.pessoas = pessoas;
        this.coberta = coberta;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public boolean isCoberta() {
        return coberta;
    }

    public void setCoberta(boolean coberta) {
        this.coberta = coberta;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Vaga{" +
                "andar=" + andar +
                ", pessoas=" + pessoas +
                ", coberta=" + coberta +
                ", placa='" + placa + '\'' +
                '}';
    }
}
