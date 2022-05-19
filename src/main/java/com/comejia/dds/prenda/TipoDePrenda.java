package com.comejia.dds.prenda;

public enum TipoDePrenda {

  ZAPATOS {
    @Override
    public Categoria categoria() {
      return Categoria.CALZADO;
    }
  },
  CAMISA_MANGA_CORTA {
    @Override
    public Categoria categoria() {
      return Categoria.PARTE_SUPERIOR;
    }
  },
  PANTALON {
    @Override
    public Categoria categoria() {
      return Categoria.PARTE_INFERIOR;
    }
  },
  CHOMBA {
    @Override
    public Categoria categoria() {
      return Categoria.PARTE_SUPERIOR;
    }
  },
  ZAPATILLAS {
    @Override
    public Categoria categoria() {
      return Categoria.CALZADO;
    }
  },
  GORRO {
      @Override
      public Categoria categoria() {
          return Categoria.CABEZA;
      }
  },
  SOMBRERO {
    @Override
    public Categoria categoria() {
      return Categoria.CABEZA;
    }
  };

  public abstract Categoria categoria();
}
