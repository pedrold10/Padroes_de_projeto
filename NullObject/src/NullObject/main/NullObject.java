package NullObject.main;

import NullObject.Endereco.Endereco;
import NullObject.Pessoa.Pessoa;
import NullObject.Pessoa.PessoaFactory;

public class NullObject {
    public static void main(String[] args){
        Pessoa pessoa1 = PessoaFactory.criarPessoa(
                "Pedro",
                "Diniz",
                new Endereco(
                        "Rua dos bobos, nº0",
                        "12345-98"
                )
        );
        Pessoa pessoa2 = PessoaFactory.criarPessoa(
                "Osvaldo",
                "Pessoa",
                null
        );
        String enderecoExibir = "=========================================\nEndereco: ";
        String cepExibir = "\nCEP: ";
        System.out.println(enderecoExibir+pessoa2.getEndereco().getEndereco()+cepExibir+pessoa2.getEndereco().getCep());
        System.out.println(enderecoExibir+pessoa1.getEndereco().getEndereco()+cepExibir+pessoa1.getEndereco().getCep());
    }
}
