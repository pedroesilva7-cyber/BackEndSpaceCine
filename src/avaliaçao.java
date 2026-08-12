public class avaliaçao {

    public String usuario;
    public String estrela;
    public String resenha;
    public String data_resenha;

    public String getUsuario() {
        return usuario;
    }

    public String getEstrela() {
        return estrela;
    }

    public String getResenha() {
        return resenha;
    }

    public String getData_resenha() {
        return data_resenha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setEstrela(String estrela) {
        this.estrela = estrela;
    }

    public void setResenha(String resenha) {
        this.resenha = resenha;
    }

    public void setData_resenha(String data_resenha) {
        this.data_resenha = data_resenha;
    }

    public avaliaçao(String usuario, String estrela, String resenha, String data_resenha) {
        this.usuario = usuario;
        this.estrela = estrela;
        this.resenha = resenha;
        this.data_resenha = data_resenha;

    }
}
