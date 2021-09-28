package interfaces;

import java.util.ArrayList;
import java.util.HashMap;


public interface ICRUD<CLASE,ID>{
	
	void nuevo(CLASE cl);
	
	CLASE leer(ID id);
	ArrayList<CLASE> listar();
	HashMap<ID,CLASE> listar2();
	
	void editar (ID id, CLASE cl);
	void eliminar (CLASE cl);
	void eliminar2(ID id);
}
