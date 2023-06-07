package com.unillanos.listasuper.infraestructure.mappers;

import com.unillanos.listasuper.domain.model.Picture;
import com.unillanos.listasuper.infraestructure.controllers.transfer.dto.PictureDTO;
import org.modelmapper.ModelMapper;


public class GenericMapper {
    public static <T, U> U map(T source, Class<U> targetClass) {
        return new ModelMapper().map(source, targetClass);
    }

}
