public class filme {

   public String nome;
   public Enum generoFilme;
   public double duraçao;
    public String idioma;
    public String sinopse;
    public String produtora;
    public String data_estreia;
    public String elenco_equipe;
    //CONSRUTOR VAZIO
public filme (){

}//CONSTRUTOR COM ARGUMENTOS

    public String getNome() {
        return nome;
    }

    public Enum getGeneroFilme() {
        return generoFilme;
    }

    public double getDuraçao() {
        return duraçao;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getProdutora() {
        return produtora;
    }

    public String getData_estreia() {
        return data_estreia;
    }

    public String getElenco_equipe() {
        return elenco_equipe;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGeneroFilme(Enum generoFilme) {
        this.generoFilme = generoFilme;
    }

    public void setDuraçao(double duraçao) {
        this.duraçao = duraçao;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public void setData_estreia(String data_estreia) {
        this.data_estreia = data_estreia;
    }

    public void setElenco_equipe(String elenco_equipe) {
        this.elenco_equipe = elenco_equipe;
    }

    public void setId(int id) {
        this.id = id;
    }

    public filme(String nome, Enum generoFilme, double duraçao, String idioma, String sinopse, String produtora, String data_estreia, String elenco_equipe, int id) {
        this.nome = nome;
        this.generoFilme = generoFilme;
        this.duraçao = duraçao;
        this.idioma = idioma;
        this.sinopse = sinopse;
        this.produtora = produtora;
        this.data_estreia = data_estreia;
        this.elenco_equipe = elenco_equipe;
        this.id = id;

    }

    public int id ;

    }


