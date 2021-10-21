package com.papelera.papeleraproject.configuration.enumerator;

public enum OriginsEnum {

    HEROKU_CLIENT("https://papelera-project.herokuapp.com/"),
    LOCAL_HOST("http://localhost:8080"),
    FRONT_HOST("http://localhost:4200");

    private String client;

    OriginsEnum(String client) {
        this.client = client;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
}
