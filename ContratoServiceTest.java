package natsu;


import org.junit.Assert;
import org.junit.Test;
import Natsu.br.service.IcontratoService;
import Natsu.br.service.IcontratoDao;
import Natsu.br.service.ContratoService;
import Natsu.br.service.ContratoDaoMock;
import Natsu.br.service.ContratoDao;




public class ContratoServiceTest {
   @Test
   public void salvarTeste() {
       IcontratoDao dao = new ContratoDaoMock();
       IcontratoService service = new ContratoService(dao);
       String retorno = service.salvar();
       Assert.assertEquals("Sucesso", retorno);
   }
    @Test
    public void buscarTeste() {
        IcontratoDao dao = new ContratoDaoMock();
       IcontratoService serviceB = new ContratoService(dao);
        String retornoB = serviceB.buscar();
        Assert.assertEquals("Buscando Cliente", retornoB);
    }
    @Test
    public void excluirTeste() {
        IcontratoDao dao = new ContratoDaoMock();
        IcontratoService serviceE = new ContratoService(dao);
        String retornoE = serviceE.excluir();
        Assert.assertEquals("Cliente Deletado", retornoE);
    }

    @Test
    public void atualizarTeste() {
        IcontratoDao dao = new ContratoDaoMock();
        IcontratoService serviceA = new ContratoService(dao);
        String retornoA = serviceA.atualizar();
        Assert.assertEquals("Dados atualizados com sucesso", retornoA);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IcontratoDao dao = new ContratoDao();
        IcontratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErrobuscarComBancoDeDadosTest() {
        IcontratoDao dao = new ContratoDao();
        IcontratoService serviceB = new ContratoService(dao);
        String retornoB = serviceB.buscar();
        Assert.assertEquals("Buscando Cliente", retornoB);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroexcluirtComBancoDeDadosTest() {
        IcontratoDao dao = new ContratoDao();
        IcontratoService serviceE = new ContratoService(dao);
        String retornoE = serviceE.excluir();
        Assert.assertEquals("Cliente Deletado", retornoE);
    }
        @Test (expected = UnsupportedOperationException.class)
    public void esperadoErroAtualizartComBancoDeDadosTest() {
      IcontratoDao dao = new ContratoDao();
     IcontratoService serviceA = new ContratoService(dao);
        String retornoA = serviceA.atualizar();
        Assert.assertEquals("Cliente Deletado", retornoA);
    }



}






