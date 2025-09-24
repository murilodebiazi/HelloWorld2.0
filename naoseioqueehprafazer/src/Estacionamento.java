public class Estacionamento {
    private Vaga[][] vagas;

    public Estacionamento(Vaga[][] vagas){
        this.vagas = vagas;
    }

    public Vaga[][] getVagas() {
        return vagas;
    }

    public void setVagas(Vaga[][] vagas) {
        this.vagas = vagas;
    }

    public Vaga Estacionar(String placa){
        for(int i=0; i < this.vagas.length; i++)
            for (int j = 0; j < this.vagas[i].length; j++)
                if (this.vagas[i][j] != null)
                    if (this.vagas[i][j].getPlaca() == null) {
                        vagas[i][j].setPlaca(placa);
                        return vagas[i][j];
                    }
        return null;
    }

    public void listarVagas(){
        System.out.println("Vagas:");
        for(int i=0; i < this.vagas.length; i++)
            for (int j = 0; j < this.vagas[i].length; j++)
                System.out.println(this.vagas[i][j]);
    }

    public liberarVaga(String placa){
        for(int i=0; i < this.vagas.length; i++)
            for (int j = 0; j < this.vagas[i].length; j++)
                if (this.vagas[i][j] != null)
                    if (this.vagas[i][j].getPlaca().equals(placa) {
                        vagas[i][j].setPlaca(placa);
                        return true;
                    }
        return null;
    }

    public int vagasVazias(){
        int vazias = 0;
        for(int i=0; i < this.vagas.length; i++)
            for (int j = 0; j < this.vagas[i].length; j++)
                if (this.vagas[i][j] != null)
                    if (this.vagas[i][j].getPlaca() == null)
                      vazias++;
        return vazias;
    }

    public int vagasCobertasVazias(){
        int vazias = 0;
        for(int i=0; i < this.vagas.length; i++)
            for (int j = 0; j < this.vagas[i].length; j++)
                if (this.vagas[i][j] != null)
                    if (this.vagas[i][j].getPlaca() == null && this.vagas[i][j].isCoberta() == true)
                        vazias++;
        return vazias;
    }
}

