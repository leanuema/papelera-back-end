package com.papelera.papeleraproject.configuration.enumerator;

public enum CartStatusEnum {
    STATUS_OUT(0),
    STATUS_IN(1);

    private Integer status;

    CartStatusEnum(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
