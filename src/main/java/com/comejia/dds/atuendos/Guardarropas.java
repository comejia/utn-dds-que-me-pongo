package com.comejia.dds.atuendos;

import com.comejia.dds.prenda.*;

import java.util.Arrays;
import java.util.List;

public class Guardarropas {

  List<Prenda> prendasSuperiores;
  List<Prenda> prendasInferiores;
  List<Prenda> calzados;

  public Guardarropas() {
    this.prendasSuperiores = Arrays.asList(
        new Prenda(TipoDePrenda.CAMISA_MANGA_CORTA, Material.ALGODON, Trama.LISA, new Color(), null),
        new Prenda(TipoDePrenda.CHOMBA, Material.ALGODON, Trama.LISA, new Color(), null)
    );
    this.prendasInferiores = Arrays.asList(
        new Prenda(TipoDePrenda.PANTALON, Material.ALGODON, Trama.LISA, new Color(), null)
    );
    this.calzados = Arrays.asList(
        new Prenda(TipoDePrenda.ZAPATILLAS, Material.ALGODON, Trama.LISA, new Color(), null),
        new Prenda(TipoDePrenda.ZAPATOS, Material.ALGODON, Trama.LISA, new Color(), null)
    );
    this.prendasCabezas = Arrays.asList(
        new Prenda(TipoDePrenda.GORRO, Material.ALGODON, Trama.LISA, new Color(), null),
        new Prenda(TipoDePrenda.SOMBRERO, Material.ALGODON, Trama.LISA, new Color(), null)
    );
  }

  public List<Atuendo> sugerirAtuendos() {
    return Arrays.asList(
        new Atuendo(generarParteSuperior(), generarParteInferior(), generarCalzado()),
        new Atuendo(generarParteSuperior(), generarParteInferior(), generarCalzado())
    );
  }

  public Prenda generarParteSuperior() {
    return this.prendasSuperiores.stream().findAny().get();
  }

  public Prenda generarParteInferior() {
    return this.prendasInferiores.stream().findAny().get();
  }

  public Prenda generarCalzado() {
    return this.calzados.stream().findAny().get();
  }

}
