package fiap.com.br.view;
import fiap.com.br.FintechDao;
import fiap.com.br.cadastroUsuario;
public class CadastroInserirView {

	public static void main(String[] args) {
		
		cadastroUsuario cadastro = new cadastro () ;
		cadastro.setCD_USUARIO("123441");
		cadastro.setNM_NOME("Adrielson");
		cadastro.setDT_NASCIMENTO("09/09/1980");
		cadastro.setDS_EMAIL("adrielson@fiap.com");
		cadastro.setDS_LOGIN("adrielson.santos");
		cadastro.setNR_SENHA("4443323");
		
		FintechDao dao = new FintechDao();
		dao.insert(cadastro);
		
		cadastroUsuario cadastro1 = new cadastro () ;
		cadastro1.setCD_USUARIO("123442");
		cadastro1.setNM_NOME("Adriano");
		cadastro1.setDT_NASCIMENTO("10/04/1999");
		cadastro1.setDS_EMAIL("adriano12n@fiap.com");
		cadastro1.setDS_LOGIN("adriano");
		cadastro1.setNR_SENHA("44323211234");
		
		FintechDao dao1 = new FintechDao();
		dao1.insert(cadastro1);
		
		cadastroUsuario cadastro2 = new cadastro () ;
		cadastro2.setCD_USUARIO("123445");
		cadastro2.setNM_NOME("Roberto");
		cadastro2.setDT_NASCIMENTO("18/08/1967");
		cadastro2.setDS_EMAIL("robertofirminon@fiap.com");
		cadastro2.setDS_LOGIN("roberto.firmino");
		cadastro2.setNR_SENHA("13131323");
		
		FintechDao dao2 = new FintechDao();
		dao1.insert(cadastro2);
		
		cadastroUsuario cadastro3 = new cadastro () ;
		cadastro3.setCD_USUARIO("1234450");
		cadastro3.setNM_NOME("Jandrei");
		cadastro3.setDT_NASCIMENTO("12/04/1999");
		cadastro3.setDS_EMAIL("jandrei@fiap.com");
		cadastro3.setDS_LOGIN("jandrei.jandra");
		cadastro3.setNR_SENHA("443");
		
		FintechDao dao3 = new FintechDao();
		dao1.insert(cadastro3);
		
		cadastroUsuario cadastro4 = new cadastro () ;
		cadastro4.setCD_USUARIO("123472");
		cadastro4.setNM_NOME("Calleri");
		cadastro4.setDT_NASCIMENTO("03/07/1999");
		cadastro4.setDS_EMAIL("jhonny.calleri@fiap.com");
		cadastro4.setDS_LOGIN("jhonny.calleri");
		cadastro4.setNR_SENHA("1313132345");
		
		FintechDao dao4 = new FintechDao();
		dao1.insert(cadastro4);
		
		
	}
		

}
