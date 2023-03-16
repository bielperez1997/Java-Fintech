package fiap.com.br;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.AudioFileFormat.Type;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fiap.com.br.Fintech;


public class FintechDao<CadastroUsuario> {

	   private Type name;
	private Object Type;

	public Fintech findById (int id) {
		   
			Usuario cadastroUsuario = null;
		
		   try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.68.107:1521/XEPDB1", "USUARIO01" , "123456");
					
			Statement stmt = connection.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM T_SIP_CADASTRO WHERE ID" + id);
			
			if (rs.next()){
				cadastroUsuario = new Usuario();
				cadastroUsuario.setNome("NM_NOME");
				cadastroUsuario.setCodigo("CD_USUARIO");
				cadastroUsuario.setNascimento("DT_NASCIMENTO");
				cadastroUsuario.setEmail("DS_EMAIL");
				cadastroUsuario.setLogin("DS_LOGIN");
			}
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		   
		   return null;
	   }
	   
	   
	public List<CadastroUsuario> findAll () {
		   
		   List<CadastroUsuario> listaUsuarios = new ArrayList <CadastroUsuario>(); 
		   
		   Connection conn = null;
		   try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.68.107:1521/XEPDB1", "USUARIO01" , "123456");
					
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM T_SIP_CADASTRO");
			
			
			while( rs.next() ) {
				Usuario cadastroUsuario = new Usuario();
				cadastroUsuario.setNome("NM_NOME");
				cadastroUsuario.setCodigo("CD_USUARIO");
				cadastroUsuario.setNascimento("DT_NASCIMENTO");
				cadastroUsuario.setEmail("DS_EMAIL");
				cadastroUsuario.setLogin("DS_LOGIN");
				
				listaUsuarios.add((CadastroUsuario) cadastroUsuario);
			}
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			
			if (conn != null); {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		   
		   return listaUsuarios;
	   }
	   
	   public Type getName() {
		return name;
	}

	public void setName(Type name) {
		this.name = name;
	}

	public Object getType() {
		return Type;
	}

	public void setType(Object type) {
		Type = type;
	}

	public void insert(cadastroUsuario cadastro) {
		   String SQL = "INSERT IN TO T_SIP_CADASTRO (CD_USUARIO, NM_NOME, DT_NASCIMENTO, DS_EMAIL, DS_LOGIN, NR_SENHA ) " + 
			   				"VALUES (T_SIP_USUARIO_SQ.nextVal)";
		   
		   Connection conn = null;
		   
		   try {
			   Class.forName("oracle.jdbc.driver.OracleDriver");
			   conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.68.107:1521/XEPDB1", "USUARIO01" , "123456");
			   PreparedStatement ptmt = conn.prepareStatement(SQL);
			   
			   ptmt.setString(1, cadastroUsuario.getCD_USUARIO);
			   ptmt.setString(2, cadastroUsuario.getNM_NOME);
			   ptmt.setString(3, cadastroUsuario.getDT_NASCIMENTO);
			   ptmt.setString(4, cadastroUsuario.getDS_EMAIL);
			   ptmt.setString(5, cadastroUsuario.getDS_LOGIN);
			   ptmt.setString(6, cadastroUsuario.getNR_SENHA);
			   
			   ptmt.execute();
		   
		   } catch (ClassNotFoundException e) {
			   
		   } catch (SQLException e) {
			e.printStackTrace();
		}
		   finally {
			   conn = null;
		   }
		     
		   
	   }


	   
}
