package com.unillanos.listasuper.infraestructure.controllers.rest;

import com.unillanos.listasuper.domain.model.SuperMarket;
import com.unillanos.listasuper.domain.ports.in.ISuperMarketService;
import com.unillanos.listasuper.infraestructure.controllers.transfer.dto.SuperMarketDTO;
import com.unillanos.listasuper.infraestructure.controllers.transfer.responses.GenericResponse;
import com.unillanos.listasuper.infraestructure.mappers.GenericMapper;
import com.unillanos.listasuper.infraestructure.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/supermarket")
@RequiredArgsConstructor
public class SuperMarketController {

    private final ISuperMarketService superMarketService;
    private final ImageRepository imageRepository;
    private final GenericMapper mapper = new GenericMapper();

    @PostMapping("/create")
    public ResponseEntity createUser(@RequestParam String name,@RequestParam String description,@RequestParam String schedule,
                                     @RequestParam String phone,@RequestParam String facebook,@RequestParam String instagram,
                                     @RequestParam String webpage, @RequestParam("path") MultipartFile file) {

        SuperMarketDTO superMarket = new SuperMarketDTO();
        superMarket.setName(name);
        superMarket.setDescription(description);
        superMarket.setSchedule(schedule);
        superMarket.setPicture(imageRepository.uploadFile("picture", file));
        superMarket.setPhone(phone);
        superMarket.setFacebook(facebook);
        superMarket.setInstagram(instagram);
        superMarket.setWebpage(webpage);
        SuperMarket superMarketCreated = superMarketService.createSuperMarket(mapper.map(superMarket, SuperMarket.class));
        return ResponseEntity.ok(
                new GenericResponse(superMarketCreated,
                        "SuperMarket created")
        );
    }

    @GetMapping("/find/{name}")
    public ResponseEntity findSuperMarket(@PathVariable String name){
        return ResponseEntity.ok(
                new GenericResponse(
                        superMarketService.findByName(name),
                        "SuperMarket found"
                )
        );
    }

    @GetMapping("/find")
    public ResponseEntity findAllSuperMarket(){
        return ResponseEntity.ok(
                new GenericResponse(
                        superMarketService.findAll(),
                        "SuperMarket's found"
                )
        );
    }

    @GetMapping("/find/id/{id}")
    public ResponseEntity findSuperMarketById(@PathVariable int id){
        return ResponseEntity.ok(
                new GenericResponse(
                        superMarketService.findById(id),
                        "SuperMarket found"
                )
        );
    }

}
