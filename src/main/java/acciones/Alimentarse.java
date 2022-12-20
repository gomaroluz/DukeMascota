package main.java.acciones;

import main.java.enumeradores.AlmacenAlimentos;
import main.java.modelos.Mascota;


public class Alimentarse {

  private AlmacenAlimentos comida;

  public void ingerirAlimento(AlmacenAlimentos comida, Mascota mascota) {
	  
    if (mascota.isLive()) {
      mascota.setNivelEnergia(mascota.getNivelEnergia() + comida.getEnergiaAportada());
      contabilizarComida(mascota);	
      if (mascota.getPopo().tieneQueEvacuar(mascota)) {
          mascota.setNivelEnergia(mascota.getNivelEnergia() - 15);
      }
      mascota.setNivelEnergia(mascota.getNivelEnergia() + comida.getEnergiaAportada());
      System.out.println("duke come " + comida + " y su energía sube a " + mascota.getNivelEnergia());
      mascota.setNivelHambre(mascota.getNivelHambre() - comida.getEnergiaAportada());
      System.out.println("duke come " + comida + " y su nivel de hambre " + mascota.getNivelHambre());

    
      }
      
      
     else {
      System.out.println("Lo siento, esta mascota no se encuentra operativa desde " + mascota.getFechaMuerte().toLocalDate());
     }
  
  }
  
    
    private void contabilizarComida(Mascota mascota) {
        mascota.setComidasIngeridas(mascota.getComidasIngeridas() + 1);
  }

}

