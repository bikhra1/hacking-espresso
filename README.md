# Hacking Espresso

This project discloses a "vulnerability", or more accurately, a security risk, in the GraalVM Espresso JDK.

By abusing the Continuation API in the GraalVM Espresso JDK, it's possible to construct a specific gadget and achieve RCE while relying solely on the JDK library itself.

This gadget works on all Espresso JDKs that support the Continuation API (currently, the latest version is also exploitable)

To run this project, you need to download the Espresso JDK from the official website: [https://www.graalvm.org/latest/reference-manual/espresso/](https://www.graalvm.org/latest/reference-manual/espresso/)

Also, you need to add the following JVM parameters:

```bash
--experimental-options --java.Continuum=true
```

For details, please refer to the article: [https://exp10it.io/2025/08/hacking-graalvm-espresso-abusing-continuation-api-to-make-rop-like-attack/](https://exp10it.io/2025/08/hacking-graalvm-espresso-abusing-continuation-api-to-make-rop-like-attack/)
