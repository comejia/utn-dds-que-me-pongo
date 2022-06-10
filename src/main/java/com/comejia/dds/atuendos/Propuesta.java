package com.comejia.dds.atuendos;

import com.comejia.dds.prenda.Prenda;

public abstract class Propuesta {

  protected EstadoPropuesta estadoPropuesta;
  protected Prenda prenda;

  public Propuesta(Prenda prenda) {
    this.estadoPropuesta = EstadoPropuesta.PENDIENTE;
    this.prenda = prenda;
  }

  public void aceptarEn(Guardarropas guardarropas) {
    this.estadoPropuesta = EstadoPropuesta.ACEPTADO;
    realizarModificacion(guardarropas);
  }

  public void rechazar() {
    this.estadoPropuesta = EstadoPropuesta.RECHAZADO;
  }

  public abstract void realizarModificacion(Guardarropas guardarropas);
}
