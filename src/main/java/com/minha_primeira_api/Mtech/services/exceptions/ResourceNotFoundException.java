package com.minha_primeira_api.Mtech.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id){
    super("Resource not Found. Id " + id);
    }

}
