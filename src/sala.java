public class sala {

    private String assentos;
    private String informacoesSala;
    private Enum tipoSala;

    public String getAssentos() {
        return assentos;
    }

    public String getInformacoesSala() {
        return informacoesSala;
    }

    public void setAssentos(String assentos) {
        this.assentos = assentos;
    }

    public void setInformacoesSala(String informacoesSala) {
        this.informacoesSala = informacoesSala;
    }

    public void setTipoSala(Enum tipoSala) {
        this.tipoSala = tipoSala;
    }

    public Enum getTipoSala() {
        return tipoSala;

    }
}
