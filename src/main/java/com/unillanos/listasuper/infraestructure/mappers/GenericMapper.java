package com.unillanos.listasuper.infraestructure.mappers;

import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;


public class GenericMapper {
    public static <T, U> U map(T source, Class<U> targetClass) {
        return new ModelMapper().map(source, targetClass);
    }

    public static <T, U> List<U> mapList(List<T> sourceList, Class<U> targetClass) {
        ModelMapper modelMapper = new ModelMapper();
        List<U> targetList = new ArrayList<>();

        for (T source : sourceList) {
            U target = modelMapper.map(source, targetClass);
            targetList.add(target);
        }

        return targetList;
    }

}
