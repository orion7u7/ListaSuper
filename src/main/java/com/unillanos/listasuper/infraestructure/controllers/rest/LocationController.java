package com.unillanos.listasuper.infraestructure.controllers.rest;


import com.unillanos.listasuper.domain.ports.in.ILocationService;
import com.unillanos.listasuper.infraestructure.controllers.transfer.responses.GenericResponse;
import com.unillanos.listasuper.infraestructure.mappers.GenericMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/location")
@RequiredArgsConstructor
public class LocationController {

    private final ILocationService locationService;
    private final GenericMapper genericMapper = new GenericMapper();

    @GetMapping("/find/id/{id}")
    public ResponseEntity findById(@PathVariable int id){
        return ResponseEntity.ok(
                new GenericResponse(
                        locationService.findById(id),
                        "Location found"
                )
        );
    }
}
