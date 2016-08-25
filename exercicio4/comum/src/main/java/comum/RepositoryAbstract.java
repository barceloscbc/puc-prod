package comum;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class RepositoryAbstract<T extends Entity, Key>  {

	private List<T> tabela = new ArrayList<T>();

	public T get(Key id) {
		try {
			return this.tabela.stream().filter(T -> T.getId().equals(id)).findFirst().get();
		} catch (NoSuchElementException e) {
			return null;
		}
	}
	
	public void add(T objeto){
		this.tabela.add(objeto);
	}
	
	public void delete(Key id) throws Exception{
		try {
			tabela.remove(this.tabela.stream().filter(T -> T.getId().equals(id)).findFirst().get());
		}catch(NoSuchElementException e){
			throw new Exception("Elemento não encontrado");
		}
	}
	
	public List<T> getAll(){
		return tabela;
	}
	
	public void update(T objeto){
		for (int i = 0; i < tabela.size(); i++) {
			if(tabela.get(i).getId() == objeto.getId()){
				tabela.set(i , objeto);
			}
		}
	}
}
