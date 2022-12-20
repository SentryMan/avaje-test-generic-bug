package com.jojo.test.service;

import com.jojo.test.map.MapService;
import com.jojo.test.model.Model1;
import com.jojo.test.model.Model2;
import jakarta.inject.Singleton;
import java.util.Map;

@Singleton
public class ServiceClass {

  final MapService<Map<String, Model1>> map1;
  final MapService<Map<String, Model2>> map2;

  public ServiceClass(MapService<Map<String, Model1>> map1, MapService<Map<String, Model2>> map2) {
    this.map1 = map1;
    this.map2 = map2;
  }

  public void process() {
    map1.get();
    map2.get();
  }
}
