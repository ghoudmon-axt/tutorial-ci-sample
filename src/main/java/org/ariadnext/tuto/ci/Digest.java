package org.ariadnext.tuto.ci;


import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;


/**
 * CI Tutorial. This code contains security vuln.
 */
public class Digest {

  /**
   * Return SHA.
   * @param value value to digest.
   * @return hash (base64 format).
   */
  public String digest(final String value) {
    try {
      MessageDigest digest = MessageDigest.getInstance("SHA-1");
      byte[] hash = digest.digest(value.getBytes(StandardCharsets.UTF_8));
      return Base64.getEncoder().encodeToString(hash);
    } catch (Exception e) {
      throw new RuntimeException("Can't generate SHA", e);
    }
  }
}
