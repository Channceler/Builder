// Source code is decompiled from a .class file using FernFlower decompiler.
package padroescriacao.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClienteBuilderTest {
    ClienteBuilderTest() {
   }

   @Test
   void deveRetornarExcecaoParaClienteSemCodigo() {
      try {
        ClienteBuilder clienteoBuilder = new ClienteBuilder();
        Cliente cliente = clienteBuilder.setNome("Cliente 1").setEmail("cliente1@email.com").build();
         Assertions.fail();
      } catch (IllegalArgumentException var3) {
         Assertions.assertEquals("Codigo\u00edcula inv\u00e1lida", var3.getMessage());
      }

   }

   @Test
   void deveRetornarExcecaoParaClienteSemNome() {
      try {
        ClienteBuilder clienteBuilder = new ClienteBuilder();
        Cliente cliente = alunoBuilder.setCodigo(1).setEmail("cliente1@email.com").build();
         Assertions.fail();
      } catch (IllegalArgumentException var3) {
         Assertions.assertEquals("Nome inv\u00e1lido", var3.getMessage());
      }

   }

   @Test
   void deveRetornarClienteValido() {
    ClienteBuilder clienteBuilder = new ClienteBuilder();
    Cliente cliente = clienteBuilder.setCodigo(1).setNome("Cliente 1").setEmail("cliente1@email.com").build();
      Assertions.assertNotNull(aluno);
   }
}