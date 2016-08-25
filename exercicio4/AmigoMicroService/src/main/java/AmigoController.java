
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acme.comum.controller.CrudAbstractController;
import br.com.acme.comum.model.repository.RepositoryAbstract;
import br.com.acme.model.entity.Amigo;
import br.com.acme.model.entity.AmigoPK;
import br.com.acme.model.repository.AmigoRespository;

@RestController
@RequestMapping("api/amigo")
public class AmigoController extends CrudAbstractController<Amigo, AmigoPK> {

	@Autowired
	private AmigoRespository repository;

	@Override
	protected RepositoryAbstract<Amigo, AmigoPK> getRepository() {
		return repository;
	}

}
