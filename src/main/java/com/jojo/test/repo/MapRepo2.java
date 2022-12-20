package com.jojo.test.repo;

import com.jojo.test.model.Model2;
import jakarta.inject.Singleton;

@Singleton
public class MapRepo2 extends AbstractRepo<Model2> {

  @Override
  public Model2 get() {
    return new Model2();
  }
}
