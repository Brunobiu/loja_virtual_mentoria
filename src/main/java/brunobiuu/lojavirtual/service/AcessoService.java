package brunobiuu.lojavirtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import brunobiuu.lojavirtual.model.Acesso;
import brunobiuu.lojavirtual.repository.AcessoRepository;

@Service
public class AcessoService {
	
	@Autowired
	private AcessoRepository acessoRepository;
	
	public Acesso save(Acesso acesso) {
		
		/*Qualquer tipo de validaçõa antes de salvar*/
		return acessoRepository.save(acesso);
	}
	

}
