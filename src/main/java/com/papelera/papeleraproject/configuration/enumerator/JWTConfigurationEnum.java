package com.papelera.papeleraproject.configuration.enumerator;

public enum JWTConfigurationEnum {

    RSA_PRIVATE("-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIIEowIBAAKCAQEA2QvG+3VOohX7S2gf+IuUxzLfhv71I27icsMcd9vdkTdY5Nei\n" +
            "dkAoK4vvwbaYephJJuTPeb/33JRJiOTgQEKdvOMYHn8WFyWznlA62oJ96DwKuJsf\n" +
            "G4hZtd3qD9Ee3mBS6M2wdwxF1ZmSLiFZP+nUC2n8RS4RkkAgkJEic7Gy3z0iuNwy\n" +
            "ogpewuSJEiCZUqt4N0m8GGNrcCVJJksjNPyzASRhHH+Azw0XdFatH71qaRg3Vu5v\n" +
            "ULnsnClHVHITCGlkGyqbYZdRij/47yzd/o11SR1eVYphEB+s8VesjJ5W3I/6V1v+\n" +
            "FyPWijZRNOc40VUrntrkIH/jP5CBzoH/OfcgXwIDAQABAoIBAEEqnRLQ1Mwrp2ir\n" +
            "mbXJSuFIL/7bPATofQsR89E07WB1arZC3B9/AdCZUmIqDbv5TzVjS7v1XFkZGL8G\n" +
            "YSJKHgwhbxNw+tP2WOi2lAUZWu5IYLuur3dXx/+n4mffVNJVv27wmwQTZkBMvKwn\n" +
            "DSH4ddb7emfW/iWYJW7idKKh/t+xcGqkPeh78mnFUwjkoybvhceydJ/bBqIwyBiM\n" +
            "ESbLsjYsG4qc9oF1Mtc4HrQPU7ZdZkd5OJFyOOHqoPL1kduiGmIxUlviPlclO04P\n" +
            "QLt8A6itm04kDExRWD2LjGNPsoJ9XO4XzqSWQePHBwBwGu3jkbFq+4/zG4uSfaIL\n" +
            "PDQMcuECgYEA/sLuG488PClj+ICD5hBUPIOu3nZCycDsQx7lqsP068rjeHBW5qxm\n" +
            "biU+wRn/ZQTHDIGzx+1Y/6G1DBLl2kAIhJPm6SAd/dGp4kVf9TSmlCm5sN55aC+2\n" +
            "Yb0DqBaZS5EikilIIV+bE8DyqAVcE01l7DF/s6Ol2h7Ia1fhGNprDK8CgYEA2hno\n" +
            "TnYJBS/7CA0EbeUP/lfQxoX3EidxnSMXwIGeyVWT53QDbj8sTCAF+2XmTadvTamj\n" +
            "g8v+4+U9qzajddLTd0zuURfzaTjBJWm35pSTo4lnw1NMAaCt7Yh0TzS4iLJaHtlb\n" +
            "8Q9DQTEmsLMTC6AU+4cOLswZwLR1e97KCN9S81ECgYAM/MkAtKugcYe8KmkO+HQi\n" +
            "5Z+rjaHYATLKNTAGJZk90AkKocd8WPubz+BEHdwsPTMcixwsLAhmd8rwA6KeHreQ\n" +
            "cq3J4q5Eu0SK2XiL2pRHZ10lDCJqUkxc7TLbhdNoy8xUYTBhKyuPtT1pnWRVQ5PX\n" +
            "l6pn8QbKeNlEx6UdDD161wKBgQC03zNmjkDgym+2t4Tq1kIzPgRn/wVtSsTP+iBi\n" +
            "h5x1f8EO+4k0zrMf1pbfbBxYXfjSQVLXpD+YI67G5KMevV6d23DwU5qLsoOLUWcv\n" +
            "lBv0Tal9tQCdgPF8weMjJKe8xZwzZTL4cR3nXKmndHrg8zszdUdvy9e3lnCv741B\n" +
            "WmNiYQKBgDGFaVIA/OFfZIRebe//rwOVTXCSY7YPJmHgzs1h2AO3CgaIxnNDG5x2\n" +
            "0EE6QRvMF1P10NeY+Uh3gZHA0cTQTVksT2+pmNydjBI1WV1/V2fZjh2VNNcq1DhP\n" +
            "0ZHev+ksnxmhlIxlNsT6f2a7tr3vculrO6OrXK/wtDCzPsUG1J46\n" +
            "-----END RSA PRIVATE KEY-----"),
    RSA_PUBLIC("-----BEGIN PUBLIC KEY-----\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2QvG+3VOohX7S2gf+IuU\n" +
            "xzLfhv71I27icsMcd9vdkTdY5NeidkAoK4vvwbaYephJJuTPeb/33JRJiOTgQEKd\n" +
            "vOMYHn8WFyWznlA62oJ96DwKuJsfG4hZtd3qD9Ee3mBS6M2wdwxF1ZmSLiFZP+nU\n" +
            "C2n8RS4RkkAgkJEic7Gy3z0iuNwyogpewuSJEiCZUqt4N0m8GGNrcCVJJksjNPyz\n" +
            "ASRhHH+Azw0XdFatH71qaRg3Vu5vULnsnClHVHITCGlkGyqbYZdRij/47yzd/o11\n" +
            "SR1eVYphEB+s8VesjJ5W3I/6V1v+FyPWijZRNOc40VUrntrkIH/jP5CBzoH/Ofcg\n" +
            "XwIDAQAB\n" +
            "-----END PUBLIC KEY-----");

    private String description;

    JWTConfigurationEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
