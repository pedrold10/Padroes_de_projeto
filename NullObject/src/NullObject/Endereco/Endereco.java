package NullObject.Endereco;
public class Endereco {

    public String endereco;
    public String cep;

    public Endereco(String endereco, String cep){
        this.endereco = endereco;
        this.cep = cep;
    }

    public Endereco() {

    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }



}