package com.comejia.dds.clima;

import java.util.Map;

public class ServicioClimaAccuWeather {

  AccuWeatherAPI api;

  public ServicioClimaAccuWeather(AccuWeatherAPI api) {
    this.api = api;
  }

  public CondicionClimatica obtenerCondicionesClimaticas(String ciudad) {
    Map<String, Object> consulta = consultarAPI(ciudad);
    int temperatura = getTemperatura(consulta);
    int precipitacion = getPrecipitacion(consulta);
    return new CondicionClimatica(precipitacion, temperatura);
  }

  private Map<String, Object> consultarAPI(String ciudad) {
    return this.api.getWeather(ciudad).get(0);
  }

  private int getTemperatura(Map<String, Object> consulta) {
    Map<String, Object> temperatura = (Map<String, Object>) consulta.get("Temperature");
    return (int) temperatura.get("Value");
  }

  private int getPrecipitacion(Map<String, Object> consulta) {
    return  (int) consulta.get("PrecipitationProbability");
  }
}
