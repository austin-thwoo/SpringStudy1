package com.fastcampus.programing.dmaker.controller;


import com.fastcampus.programing.dmaker.dto.CreateDeveloper;
import com.fastcampus.programing.dmaker.service.DMakerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
public class DMakerController {

    private final DMakerService dMakerService;


    @GetMapping("/developers")
    public List<String> getAllDevelopers(){
        log.info("GET / developers HTTP/1.1 ");
return Arrays.asList("snow","Elsa","Olaf");
    }



    @GetMapping("/create-developer")
    public List<String> createDevelopers(
            @Valid @RequestBody CreateDeveloper.request request
            ){
        log.info("POST / developer HTTP/1.1 ");
        log.info("request'{}'",request);
        dMakerService.createDeveloper(request);

        return Collections.singletonList("Olaf");
    }




}
