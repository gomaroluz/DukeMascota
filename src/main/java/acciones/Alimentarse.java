package main.java.acciones;

import main.java.enumeradores.AlmacenAlimentos;
import main.java.modelos.Mascota;


public class Alimentarse {

  private AlmacenAlimentos comida;

  public void ingerirAlimento(AlmacenAlimentos comida, Mascota mascota) {
	  
    if (mascota.isLive()) {
    	
      mascota.setNivelEnergia(mascota.getNivelEnergia() + comida.getEnergiaAportada());
      System.out.println("duke come " + comida + " y su energía sube a " + mascota.getNivelEnergia());
		/*
		 * contabilizarComida(mascota);
		 * 
		 * if (mascota.getPopo().tieneQueEvacuar(mascota)) {
		 * mascota.setNivelEnergia(mascota.getNivelEnergia() - 15);
		 * Morir.checkStatusGeneral(mascota); if (mascota.isLive()) {
		 * System.out.println("Esta mascota necesita ir al baño"); }
		 * 
		 * } else { Morir.checkStatusGeneral(mascota);
		 * System.out.println("Esta mascota necesita ir al baño");
		 */
      }
     else {
      System.out.println("Lo siento, esta mascota no se encuentra operativa desde " + mascota.getFechaMuerte().toLocalDate());
    }
  }

}

