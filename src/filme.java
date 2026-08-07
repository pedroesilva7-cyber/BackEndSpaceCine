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


