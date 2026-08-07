import java.time.LocalDate;

public class usuario {
  public String nome;
  public String cpf;
  public String nomeSocial;
  public LocalDate dataNascimento;
  public String email;
  public int telefone;
  public int id;
  public int cep;
  public Genero genero;

    public usuario(String nome, String cpf, String nomeSocial, LocalDate dataNascimento, String email, int telefone, int id, int cep, Genero genero) {
        this.nome = nome;
        this.cpf = cpf;
        this.nomeSocial = nomeSocial;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.id = id;
        this.cep = cep;
        this.genero = genero;
    }
}



