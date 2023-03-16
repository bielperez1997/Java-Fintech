package fiap.com.br;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import fiap.com.br.FintechDao;

public class Fintech {

    public static <CadastroUsuario> void main(String[] args) {

          try {
              //Registra o Driver
              Class.forName("oracle.jdbc.driver.OracleDriver");
              
              FintechDao dao = new FintechDao ();
              List<CadastroUsuario> listaUsuarios = dao.findAll();
              
              for (CadastroUsuario cadastroUsuario : listaUsuarios) {
            	  System.out.println(cadastroUsuario);
              }
              
            } catch (ClassNotFoundException e) {
              System.err.println("O Driver JDBC não foi encontrado!");
              e.printStackTrace();
            }
          }
        }



