package org.digidoc4j.utils;

/**
 * Optional additional information about the signer
 */
public class SignerInformation {
  private String city;
  private String stateOrProvince;
  private String postalCode;
  private String country;
  private String signerRole;

  /**
   * empty constructor
   */
  public SignerInformation() {
  }

  /**
   * Constructor
   *
   * @param city            city of the signature location
   * @param stateOrProvince state/province of the signature location
   * @param postalCode      postal code of the signature location
   * @param country         country of the signature location
   * @param signerRole      the signer’s role and optionally the signer’s resolution
   *                        Note that only one signer role value (i.e. one <ClaimedRole> XML element) should be used
   *                        If the signer role contains both role and resolution then they must be separated
   *                        with a slash mark, e.g. “role / resolution”
   *                        Note that when setting the resolution value then role must also be specified
   */
  public SignerInformation(String city, String stateOrProvince, String postalCode, String country, String signerRole) {
    this.city = city;
    this.stateOrProvince = stateOrProvince;
    this.postalCode = postalCode;
    this.country = country;
    this.signerRole = signerRole;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getSignerRole() {
    return signerRole;
  }

  public void setSignerRole(String signerRole) {
    this.signerRole = signerRole;
  }
}