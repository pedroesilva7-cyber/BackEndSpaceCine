public class combo {

    public int preço;
    public String tipo_combo;
    public String brindes;

    public int getPreço() {
        return preço;
    }

    public String getTipo_combo() {
        return tipo_combo;
    }

    public String getBrindes() {
        return brindes;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }

    public void setTipo_combo(String tipo_combo) {
        this.tipo_combo = tipo_combo;
    }

    public void setBrindes(String brindes) {
        this.brindes = brindes;
    }

    public combo(int preço, String tipo_combo, String brindes) {
        this.preço = preço;
        this.tipo_combo = tipo_combo;
        this.brindes = brindes;

    }
}
