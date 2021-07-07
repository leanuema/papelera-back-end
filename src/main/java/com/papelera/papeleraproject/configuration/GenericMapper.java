package com.papelera.papeleraproject.configuration;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import com.papelera.papeleraproject.configuration.Mapper;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class GenericMapper<MODEL, DTO> implements Mapper<MODEL, DTO> {

    @Autowired
    protected DozerBeanMapper mapper;
    private Class<MODEL> modelClazz;
    private Class<DTO> dtoClazz;

    @SuppressWarnings("unchecked")
    protected GenericMapper() {
        Type [] genericTypes = ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments();
        this.modelClazz = (Class<MODEL>) genericTypes[0];
        this.dtoClazz = (Class<DTO>) genericTypes [1];
    }

    protected MODEL dozzerToModel(DTO dto) {
        return mapper.map(dto, modelClazz);
    }

    protected DTO dozzerToDTO(MODEL model) {
        return mapper.map(model, dtoClazz);
    }

    /**
     * Generic toModel mapping, override if an specific mapping is needed.
     *
     */
    public MODEL toModel(DTO dto) {
        if (dto == null) {
            return null;
        }
        return dozzerToModel(dto);
    }

    /**
     * Generic toDTO mapping, override if an specific mapping is needed.
     *
     */
    public DTO toDTO(MODEL model) {
        if (model == null) {
            return null;
        }
        return dozzerToDTO(model);
    }

}
