package com.unillanos.listasuper.infraestructure.repository;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

@Slf4j
@Repository
@RequiredArgsConstructor

public class ImageRepository {



    private final AmazonS3 amazonS3;

    @Value("${aws.s3.bucket}")
    private String bucketName;

    public String uploadFile(String entity, MultipartFile file) {
        File mainFile = new File(Objects.requireNonNull(file.getOriginalFilename()));
        try (FileOutputStream stream = new FileOutputStream(mainFile)) {
            stream.write(file.getBytes());
            String newFileName = UUID.randomUUID().toString().replace("-", "");
            //make public
            PutObjectRequest request = new PutObjectRequest(bucketName, entity + "/" + newFileName, mainFile);
            request.setCannedAcl(CannedAccessControlList.PublicRead);
            amazonS3.putObject(request);
            String url = amazonS3.getUrl(bucketName, entity + "/" + newFileName).toString();
            return url;
        } catch (IOException e) {
            log.info(e.getMessage(), e);
        }
        return null;
    }

    public boolean deleteFile(String path) {
        try {
            String[] parts = path.split("/");
            String fileName = parts[parts.length - 2] + "/" + parts[parts.length - 1];
            amazonS3.deleteObject(bucketName, fileName);
            return true;
        } catch (Exception ex) {
            log.info(ex.getMessage(), ex);
        }
        return false;
    }
}
