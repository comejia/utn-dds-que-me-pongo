package com.comejia.dds.prenda;

import com.comejia.dds.negocio.PrendaInvalidaException;

public class PrendaBuilder {

  private final TipoDePrenda tipoDePrenda;
  private Material material;
  private Trama trama = Trama.LISA;
  private Color colorPrincipal;
  private Color colorSecundario;

  public PrendaBuilder(TipoDePrenda tipo) {
    if (tipo == null) {
      throw new PrendaInvalidaException("Tipo de prenda no valido");
    }
    this.tipoDePrenda = tipo;
  }

  public void indicarMaterial(Material material) {
    if (material == null) {
      throw new PrendaInvalidaException("Material no valido");
    }
    /*if (!esMaterialConsistenteConTipoPrenda(material)) { // El requisito no especifica como validar la consistencia
      throw new PrendaInvalidaException("El material no es consistente");
    }*/
    this.material = material;
  }

  public void indicarTrama(Trama trama) {
    this.trama = trama;
  }

  public void indicarColorPrincipal(Color color) {
    if (colorPrincipal == null) {
      throw new PrendaInvalidaException("Color no valido");
    }
    this.colorPrincipal = color;
  }

  public void indicarColorSecundario(Color color) {
    this.colorSecundario = color;
  }

  public Prenda build() {
    if (this.material == null || this.colorPrincipal == null) {
      throw new PrendaInvalidaException("Material y/o color principal no valido");
    }
    return new Prenda(this.tipoDePrenda, this.material, this.trama, this.colorPrincipal, this.colorSecundario);
  }
}
