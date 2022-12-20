package com.jojo.test;

import com.jojo.test.service.ServiceClass;
import io.avaje.inject.BeanScope;

public class Main {

  public static void main(String[] args) {

    try {
      BeanScope.builder().build().get(ServiceClass.class).process();

    } catch (final Exception e) {
      e.printStackTrace();
    }
  }
}
