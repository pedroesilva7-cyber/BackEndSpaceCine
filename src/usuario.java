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

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getId() {
        return id;
    }

    public int getCep() {
        return cep;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

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



