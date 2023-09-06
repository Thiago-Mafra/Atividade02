package Factory;

import DAO.ContaDAO;
import DAO.PessoaDAO;
import DAO.Postgres.PessoaDAOPostgres;
import java.sql.Connection;
import Util.GerenciadorConexao;
import DAO.Postgres.ContaDAOPostegres;

public class FactoryDAO {

    public static ContaDAO makeContaDAO() {
        Connection conexao = GerenciadorConexao.getConexao();
        ContaDAOPostegres contaDao = new ContaDAOPostegres(conexao);
        return contaDao;
    }

    public static PessoaDAO makePesoaDAO() {
        Connection conexao = GerenciadorConexao.getConexao();
        PessoaDAO pessoaDao = new PessoaDAOPostgres(conexao);
        return pessoaDao;
    }

}
