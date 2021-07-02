package com.papelera.papeleraproject.configuration.enumerator;

public enum AppClientEnum {

    ANGULAR_APP("angularApp", "papeleraCS");

    private String clientName;
    private String clientPassword;

    AppClientEnum(String clientName, String clientPassword) {
        this.clientName = clientName;
        this.clientPassword = clientPassword;
    }

    /**
     * Getter and Setter
     */
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientPassword() {
        return clientPassword;
    }

    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }
}
