![EU Regional Development Fund](digidoc4j/src/main/doc/resources/EL_Regionaalarengu_Fond_horisontaalne-vaike.jpg)
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Fisabelavilhalba%2Fdigdoctest1.svg?type=shield)](https://app.fossa.io/projects/git%2Bgithub.com%2Fisabelavilhalba%2Fdigdoctest1?ref=badge_shield)


# DigiDoc4j
DigiDoc4j is a Java library for digitally signing documents and creating digital signature containers of signed documents.

# Features
* Creating BDOC, ASiC-E containers
* Validating BDOC, ASiC-E and DDOC containers
* Creating, signing, timestamping and validating ASiC-S containers
* Creating and validating detached XadES

# How to use it
* Take a look at the [examples](https://github.com/open-eid/digidoc4j/wiki/Examples-of-using-it)
* See the full [DigiDoc4j API](http://open-eid.github.io/digidoc4j/) description
* Explore the [Wiki](https://github.com/open-eid/digidoc4j/wiki) section
* Download the latest [release](https://github.com/open-eid/digidoc4j/releases)
* See the [library development guide](https://github.com/open-eid/digidoc4j/wiki/Development). Your contribution and pull requests are more than welcome

# BDOC (ASiC-E - Associated Signature Container Extended) container format
* Has **.bdoc**, **.asice** or **.sce** extension
* BDOC is a new digital signature format developed in 2014 to replace the old, DDOC (DigiDoc) digital signature format. 
* The benefits of the new format include the higher security level, the long-term integrity of the signed documents, as well as the better compliance with international standards.
* BDOC container is based on **ASiC-E** standard.
* Signatures are stored in **XAdES** format.
* Supports two signature formats: **BDOC-TM** and **BDOC-TS**
* **BDOC-TM** signature format has **time-mark** ensuring long-term provability of the authenticity of the signature.
    * This format has been used as a default digital signature format in Estonia since 2015.
    * It is based on **XAdES baseline LT** signature format.
    * Recommended extension is **.bdoc**
* **BDOC-TS** signature format has **time-stamp**.
    * In contrast to the BDOC-TM format, long-term provability of the authenticity of the signature is ensured by time-stamps.
    * It is based on **XAdES baseline LT** signature format and uses RFC3161 based time-stamps which makes it highly compliant in international context.
    * To ensure better compliance with international standards, it's recommended to sign documents with the **BDOC-TS time-stamp** signature profile.
    * Recommended extension is **.asice**
* **.bdoc** or **.asice** file is in fact a ZIP container with the signed files, the signatures and the protocol control information and can basically be opened by any program that recognizes the ZIP format.
* It is recommended not to use special characters in the data file’s name, i.e. it is suggested to use only the characters that are categorized as “unreserved” according to RFC3986 (http://tools.ietf.org/html/rfc3986).

# ASiC-S (ASiC-E - Associated Signature Container Simple) container format
* Has **.asics** or **.scs** extension
* Container associates one data file with either:
  - one signature file containing one or more detached digital signature(s) that apply to it; or
  - one time assertion file containing a time assertion that apply to it.
* This format is used for timestamping the old DDOC containers in order to prove the inviolability of documents.

# DDOC container format
* Has **.ddoc** extension
* An old DigiDoc digital signature format
* Since year 2015 it's recommended not to sign documents in the DDOC format
* It is based on XML Advanced Electronic Signatures (**XAdES**) format, corresponding to  profile XAdES-X-L
* The DigiDoc container includes the source files (the files that were signed) as well as the signatures that are related to the signed file(s)
* Every signature contains the certificate, validity confirmation and the validity confirmation service certificate.


# Documentation
* [DigiDoc4j API](http://open-eid.github.io/digidoc4j/)
* [Examples](https://github.com/open-eid/digidoc4j/wiki/Examples-of-using-it)
* [Wiki](https://github.com/open-eid/digidoc4j/wiki)
* [Architecture of ID-software](http://open-eid.github.io/)
* [Digital signature formats](http://www.id.ee/index.php?id=36108)
* [BDOC 2.1.2 specification](http://id.ee/public/bdoc-spec212-eng.pdf)
* [DDOC specification](http://www.id.ee/public/DigiDoc_format_1.3.pdf)

# Requirements
* Java 1.7
* Internet access to external verification services
 * OCSP (Online Certificate Status Protocol) - http://ocsp.sk.ee
 * EU TSL (European Commission's Trusted Status List) - https://ec.europa.eu/tools/lotl/eu-lotl.xml
 * All the EU member states' TL servers referred in the EU TSL. Note that this list may change. (e.g. https://sr.riik.ee/tsl/estonian-tsl.xml, https://sede.minetur.gob.es/Prestadores/TSL/TSL.xml, https://www.viestintavirasto.fi/attachments/TSL-Ficora.xml etc.)
 * TSA (Time Stamping Authority) - http://tsa.sk.ee

## Maven
You can use the library as a Maven dependency from the Maven Central (http://mvnrepository.com/artifact/org.digidoc4j/digidoc4j)

```xml
<dependency>
	<groupId>org.digidoc4j</groupId>
	<artifactId>digidoc4j</artifactId>
	<version>3.x.x</version>
</dependency>
```

# Known issues
The list of issues are tracked in [GitHub](https://github.com/open-eid/digidoc4j/issues)

# Licence
* LGPL (GNU Library General Public License, see LICENSE.LGPL)
* © Estonian Information System Authority


[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Fisabelavilhalba%2Fdigdoctest1.svg?type=large)](https://app.fossa.io/projects/git%2Bgithub.com%2Fisabelavilhalba%2Fdigdoctest1?ref=badge_large)

## Support
Official builds are provided through [releases](https://github.com/open-eid/digidoc4j/releases). If you want support, you need to be using official builds. Contact for assistance by email [help@ria.ee](mailto:help@ria.ee).

Source code is provided on "as is" terms with no warranty (see license for more information). Do not file Github issues with generic support requests.