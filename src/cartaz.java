public class cartaz {

    public String titulo;
    public String imagem;
    public String classificaçao;
    public int data_estreia;
   public String genero;
   public String duraçao;

    public String getTitulo() {
        return titulo;
    }

    public String getImagem() {
        return imagem;
    }

    public String getClassificaçao() {
        return classificaçao;
    }

    public int getData_estreia() {
        return data_estreia;
    }

    public String getGenero() {
        return genero;
    }

    public String getDuraçao() {
        return duraçao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void setClassificaçao(String classificaçao) {
        this.classificaçao = classificaçao;
    }

    public void setData_estreia(int data_estreia) {
        this.data_estreia = data_estreia;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuraçao(String duraçao) {
        this.duraçao = duraçao;
    }

    public cartaz(String titulo, String imagem, String classificaçao, int data_estreia, String genero, String duraçao) {
        this.titulo = titulo;
        this.imagem = imagem;
        this.classificaçao = classificaçao;
        this.data_estreia = data_estreia;
        this.genero = genero;
        this.duraçao = duraçao;

    }
}
