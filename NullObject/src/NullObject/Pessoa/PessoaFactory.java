package NullObject.Pessoa;

import NullObject.Endereco.Endereco;
import NullObject.Endereco.EnderecoNull;

public class PessoaFactory {
    public static Pessoa criarPessoa(String nome, String sobrenome, Endereco endereco){
        Pessoa pessoa = new Pessoa(nome, sobrenome);
        if(endereco==null)
            pessoa.setEndereco(new EnderecoNull());
        else
            pessoa.setEndereco(endereco);
        return pessoa;
    }
}
