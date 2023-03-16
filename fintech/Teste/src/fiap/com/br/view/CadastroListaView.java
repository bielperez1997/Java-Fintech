package fiap.com.br.view;

import fiap.com.br.FintechDao;

import java.sql.SQLException;
import java.util.List;

import fiap.com.br.Fintech;
import fiap.com.br.Usuario;
import fiap.com.br.cadastroUsuario;

public class CadastroListaView {

	public static void main(String[] args) throws SQLException {
		
		FintechDao dao = new FintechDao ();
		List<cadastroUsuario> listaUsuarios = dao.findAll();
		
		for (cadastroUsuario cadastrousuario : listaUsuarios) {
			System.out.println(cadastrousuario);
		}

	}

}
