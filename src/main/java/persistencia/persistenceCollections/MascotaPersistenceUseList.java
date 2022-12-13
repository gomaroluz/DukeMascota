package main.java.persistencia.persistenceCollections;


import java.util.List;

import main.java.modelos.Mascota;
import main.java.persistencia.IMascotaPersistence;

public class MascotaPersistenceUseList implements IMascotaPersistence {

	@Override
	public void guardar(Mascota mascota) {
		// TODO Auto-generated method stub
		bdMascotas.add(mascota);
	}

	@Override
	public Mascota getMascota(int id) {
		// TODO Auto-generated method stub
		return bdMascotas.get (id);
	}

	@Override
	public Mascota getMascota(String nombre) {
		// TODO Auto-generated method stub
		   for (Mascota elemento : bdMascotas) {
			      if(elemento.getNombre().equals(nombre)) {
			        return elemento;
			      }
		   }
		return null;
	}

	@Override
	public List<Mascota> getAllMascotas() {
		// TODO Auto-generated method stub
		return bdMascotas;
	}

	@Override
	public void updateMascota(int id, Mascota mascota) {
		// TODO Auto-generated method stub
		bdMascotas.set(id, mascota);
	}

	@Override
	public void deleteMascota(int id) {
		// TODO Auto-generated method stub
		bdMascotas.remove(getMascota(id));
	}

	
}
