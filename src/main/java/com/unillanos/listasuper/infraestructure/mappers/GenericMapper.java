package com.unillanos.listasuper.infraestructure.mappers;

import org.modelmapper.ModelMapper;


public class GenericMapper {
    public static <T, U> U map(T source, Class<U> targetClass) {
        return new ModelMapper().map(source, targetClass);
    }

}
