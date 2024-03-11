package brunobiuu.lojavirtual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import brunobiuu.lojavirtual.controller.AcessoController;
import brunobiuu.lojavirtual.model.Acesso;
import brunobiuu.lojavirtual.repository.AcessoRepository;
import brunobiuu.lojavirtual.service.AcessoService;

@SpringBootTest(classes = LojaVirtualMentoriaApplication.class)
public class LojaVirtualMentoriaApplicationTests {
	
	
	
	@Autowired
	private AcessoController acessoController;
	
	

	@Test
	public void testCadastrasAcesso() {
		
		Acesso acesso = new Acesso();
		
		acesso.setDescricao("ROLE_ADMIN");
		
		acessoController.salvarAcesso(acesso);
	}

}
