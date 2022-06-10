package com.comejia.dds.negocio;

import com.comejia.dds.atuendos.Guardarropas;
import com.comejia.dds.atuendos.Propuesta;
import com.comejia.dds.prenda.Prenda;

import java.util.List;

public class Usuario {

  private final List<Guardarropas> guardarropas;

  public Usuario(List<Guardarropas> guardarropas) {
    this.guardarropas = guardarropas;
  }

  public void agregarGuardarropas(Guardarropas guardarropas) {
    this.guardarropas.add(guardarropas);
  }

  public void quitarGuardarropas(Guardarropas guardarropas) {
    this.guardarropas.remove(guardarropas);
  }

  public void crearGuardarropa(List<Prenda> prendas) {
    guardarropas.add(new Guardarropas(prendas));
  }

}
