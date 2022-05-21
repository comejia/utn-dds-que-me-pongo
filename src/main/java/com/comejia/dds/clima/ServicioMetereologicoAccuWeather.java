package com.comejia.dds.clima;

import java.util.Map;

public class ServicioMetereologicoAccuWeather implements ServicioMetereologico {

  private final AccuWeatherAPI apiClima;

  public ServicioMetereologicoAccuWeather(AccuWeatherAPI apiClima) {
    this.apiClima = apiClima;
  }

  @Override
  public CondicionClimatica obtenerCondicionClimatica(String ciudad) {
      Map<String, Object> clima = consultarAPI(ciudad);
      int temperatura = getTemperatura(clima);
      int precipitacion = getPrecipitacion(clima);
      return new CondicionClimatica(precipitacion, temperatura);
  }

  private Map<String, Object> consultarAPI(String ciudad) {
    try {
      return this.apiClima.getWeather(ciudad).get(0);
    } catch (Exception e) {
      throw new RuntimeException("Error al consultar la api del clima");
    }
  }

  private int getTemperatura(Map<String, Object> consulta) {
    Map<String, Object> temperatura = (Map<String, Object>) consulta.get("Temperature");
    return (int) temperatura.get("Value");
  }

  private int getPrecipitacion(Map<String, Object> consulta) {
    return  (int) consulta.get("PrecipitationProbability");
  }
}
