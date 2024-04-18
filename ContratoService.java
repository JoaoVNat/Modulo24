package Natsu.br.service;

public class ContratoService implements IcontratoService {

    private IcontratoDao contratoDao;
    public ContratoService(IcontratoDao dao) {
        this.contratoDao = dao;
    }
    @Override
   public String salvar(){
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Buscando Cliente";

    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Cliente Deletado";

    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Dados atualizados com sucesso";

    }

}



