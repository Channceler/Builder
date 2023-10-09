// Source code is decompiled from a .class file using FernFlower decompiler.
package padroescriacao.builder;

import java.util.Date;

public class ClienteBuilder {
   private Cliente cliente = new Cliente();

   public ClienteBuilder() {
   }

   public Cliente build() {
      if (this.Cliente.getCodigo() == 0) {
         throw new IllegalArgumentException("Matr\u00edcula inv\u00e1lida");
      } else if (this.Cliente.getNome().equals("")) {
         throw new IllegalArgumentException("Nome inv\u00e1lido");
      } else {
         return this.Cliente;
      }
   }

   public ClienteBuilder setCodigo(int codigo) {
      this.Cliente.setMCodigo(matricula);
      return this;
   }

   public ClienteBuilder setNome(String nome) {
      this.Cliente.setNome(nome);
      return this;
   }

   public ClienteBuilder setDataNascimento(Date dataNascimento) {
      this.Cliente.setDataNascimento(dataNascimento);
      return this;
   }

   public ClienteBuilder setNomeMae(String nomeMae) {
      this.Cliente.setNomeMae(nomeMae);
      return this;
   }

   public ClienteBuilder setNomePai(String nomePai) {
      this.Cliente.setNomePai(nomePai);
      return this;
   }

   public ClienteBuilder setCpf(String cpf) {
      this.Cliente.setCpf(cpf);
      return this;
   }

   public ClienteBuilder setRg(String rg) {
      this.Cliente.setRg(rg);
      return this;
   }

   public ClienteBuilder setEnderecoLogradouro(String enderecoLogradouro) {
      this.Cliente.setEnderecoLogradouro(enderecoLogradouro);
      return this;
   }

   public ClienteBuilder setEnderecoNumero(int enderecoNumero) {
      this.Cliente.setEnderecoNumero(enderecoNumero);
      return this;
   }

   public ClienteBuilder setEnderecoComplemento(String enderecoComplemento) {
      this.Cliente.setEnderecoComplemento(enderecoComplemento);
      return this;
   }

   public ClienteBuilder setEnderecoBairro(String enderecoBairro) {
      this.Cliente.setEnderecoBairro(enderecoBairro);
      return this;
   }

   public ClienteBuilder setEnderecoCidade(String enderecoCidade) {
      this.Cliente.setEnderecoCidade(enderecoCidade);
      return this;
   }

   public ClienteBuilder setEnderecoUF(String enderecoUF) {
      this.Cliente.setEnderecoUF(enderecoUF);
      return this;
   }

   public ClienteBuilder setCep(String cep) {
      this.Cliente.setCep(cep);
      return this;
   }

   public ClienteBuilder setEmail(String email) {
      this.Cliente.setEmail(email);
      return this;
   }

   public ClienteBuilder setCelular(String celular) {
      this.Cliente.setCelular(celular);
      return this;
   }
}
