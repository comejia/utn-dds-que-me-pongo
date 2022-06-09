package com.comejia.dds.negocio;

import com.comejia.dds.atuendos.Guardarropas;
import com.comejia.dds.prenda.Prenda;

import java.util.ArrayList;
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



}
