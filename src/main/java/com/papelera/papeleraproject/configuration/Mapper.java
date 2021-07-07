package com.papelera.papeleraproject.configuration;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public interface Mapper<MODEL, DTO> {

    public MODEL toModel(DTO dto);
    public DTO toDTO(MODEL model);
    default public List<MODEL> toModel(List<DTO> dtos) {
        if (dtos == null) {
            return Collections.emptyList();
        }
        return dtos.stream().map(dto -> toModel(dto)).collect(Collectors.toList());
    }
    default public List<DTO> toDTO(List<MODEL> models) {
        if (models == null) {
            return Collections.emptyList();
        }
        return models.stream().map(model -> toDTO(model)).collect(Collectors.toList());
    }
}