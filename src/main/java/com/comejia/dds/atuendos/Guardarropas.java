package com.comejia.dds.atuendos;

import com.comejia.dds.prenda.*;

import java.util.Arrays;
import java.util.List;

public class Guardarropas {

  private final List<Prenda> prendas;
  private final List<Prenda> prendasSuperiores;
  private final List<Prenda> prendasInferiores;
  private final List<Prenda> calzados;

  public Guardarropas(List<Prenda> prendasSuperiores, List<Prenda> prendasInferiores, List<Prenda> calzados, List<Prenda> prendas) {
    this.prendasSuperiores = prendasSuperiores;
    this.prendasInferiores = prendasInferiores;
    this.calzados = calzados;
    this.prendas = prendas;
  }

  public List<Atuendo> generarAtuendos() {
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

  public void agregarPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda) {
    this.prendas.remove(prenda);
  }

}
