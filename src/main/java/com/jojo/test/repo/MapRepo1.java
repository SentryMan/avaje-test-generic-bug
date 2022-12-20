package com.jojo.test.repo;

import com.jojo.test.model.Model1;
import jakarta.inject.Singleton;

@Singleton
public class MapRepo1 extends AbstractRepo<Model1> {

  @Override
  public Model1 get() {
    return new Model1();
  }
}
