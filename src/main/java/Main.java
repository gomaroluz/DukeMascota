package main.java;

import java.time.LocalTime;

import main.java.enumeradores.AlmacenAlimentos;
import main.java.enumeradores.EntretenimientosEnum;
import main.java.modelos.DukeMascota;
import main.java.modelos.Mascota;
import main.java.persistencia.persistenceCollections.MascotaPersistenceUseList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*DukeMascota duke = new DukeMascota( "Merlina", "Semper");
		
		System.out.println(duke.getNombre());
		System.out.println(duke.getPropietario());
		System.out.println(duke.getFechaNacimiento());
		System.out.println(duke.getNivelEnergia());
		System.out.println(duke.getNivelHambre());
		System.out.println(duke.getNivelFelicidad());
		System.out.println(duke.getNivelAburrimiento());
		System.out.println(duke.getNivelCansancio());
		
		System.out.println(duke);*/
		
		 MascotaPersistenceUseList persistence = new MascotaPersistenceUseList();

		    DukeMascota duke = new DukeMascota("Duke-Merlina", "Semper");
		    DukeMascota duke2 = new DukeMascota("Duke-Cordobes", "Semper");
		    DukeMascota duke3 = new DukeMascota("Duke-Porteño", "Semper");
		    DukeMascota duke4 = new DukeMascota("Duke-Litoral", "Semper");
		    persistence.guardar(duke);
		    persistence.guardar(duke2);
		    persistence.guardar(duke3);
		    persistence.guardar(duke4);
		    
		    System.out.println("antes de comer " + duke.getNivelEnergia());
		    duke.comer(AlmacenAlimentos.ASADO);
		    System.out.println("después de comer su nivel de energía es " + duke.getNivelEnergia());
		    System.out.println("después de comer su nivel de hambre es " + duke.getNivelHambre());
		    duke.jugar(EntretenimientosEnum.PASEAR);
		    System.out.println("antes de dormir " + duke.getNivelEnergia());
		    duke.dormir(LocalTime.of(0,25));
		    System.out.println("después de dormir " + duke.getNivelEnergia());
	}


}
