package com.comejia.dds.clima;

import java.util.HashMap;
import java.util.Map;

public class ServicioClimaAccuWeather implements ServicioClima {

  private final Map<String, Map<String, Object>> consultas;

  private final AccuWeatherAPI apiClima;

  public ServicioClimaAccuWeather(AccuWeatherAPI apiClima) {
    this.apiClima = apiClima;
    this.consultas = new HashMap<>();
  }

  @Override
  public CondicionClimatica obtenerCondicionesClimaticas(String ciudad) {
    if(!this.consultas.containsKey(ciudad)) {
      this.consultas.put(ciudad, consultarAPI(ciudad));
    }

    int temperatura = getTemperatura(this.consultas.get(ciudad));
    int precipitacion = getPrecipitacion(this.consultas.get(ciudad));
    return new CondicionClimatica(precipitacion, temperatura);
  }

  private Map<String, Object> consultarAPI(String ciudad) {
    return this.apiClima.getWeather(ciudad).get(0);
  }

  private int getTemperatura(Map<String, Object> consulta) {
    Map<String, Object> temperatura = (Map<String, Object>) consulta.get("Temperature");
    return (int) temperatura.get("Value");
  }

  private int getPrecipitacion(Map<String, Object> consulta) {
    return  (int) consulta.get("PrecipitationProbability");
  }
}
