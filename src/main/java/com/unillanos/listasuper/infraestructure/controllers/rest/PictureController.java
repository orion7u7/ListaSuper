package com.unillanos.listasuper.infraestructure.controllers.rest;

import com.unillanos.listasuper.application.services.PictureService;
import com.unillanos.listasuper.domain.model.Picture;
import com.unillanos.listasuper.domain.ports.in.IPictureService;
import com.unillanos.listasuper.infraestructure.controllers.constatnt.PictureConstants;
import com.unillanos.listasuper.infraestructure.controllers.transfer.dto.PictureDTO;
import com.unillanos.listasuper.infraestructure.controllers.transfer.responses.GenericResponse;
import com.unillanos.listasuper.infraestructure.mappers.GenericMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/picture")
@RequiredArgsConstructor
public class PictureController {

    private final IPictureService pictureService;
    private final GenericMapper mapper = new GenericMapper();

    @PostMapping
       public ResponseEntity createPicture(@RequestBody PictureDTO picture) {
            Picture pictureCreated = pictureService.createPicture(mapper.map(picture, Picture.class));
            return ResponseEntity.ok(
                    new GenericResponse(pictureCreated,
                            PictureConstants.PICTURE_CREATED)
            );
        }
}
