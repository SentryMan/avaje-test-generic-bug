package com.jojo.test.service;

import com.jojo.test.repo.MapRepo1;
import io.avaje.inject.test.InjectTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

@InjectTest
class ServiceClassTest {

  @Mock MapRepo1 repoMock;

  @BeforeEach
  void setUpBeforeClass() throws Exception {}

  @Test
  void test() {}
}
