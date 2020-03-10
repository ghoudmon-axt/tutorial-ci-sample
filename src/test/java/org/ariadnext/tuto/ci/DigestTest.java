package org.ariadnext.tuto.ci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

/** Digest unit test. */
class DigestTest {

  @Test
  @DisplayName("Digest shall return a value")
  void digestShallReturnAValue() {
    String value = UUID.randomUUID().toString();
    Assertions.assertNotNull(new Digest().digest(value));
    // Assertions.assertEquals(value, new Digest().digest(value));
    Assertions.assertNotEquals(value, new Digest().digest(value));
  }
}