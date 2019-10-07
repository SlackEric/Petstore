package eric.petstore.controller;


import eric.petstore.dto.ResponseDtoInfo;
import eric.petstore.service.PetstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class PetstoreController {

    @Autowired
    private PetstoreService petstoreService;


    @GetMapping("/user/{username}")
    public ResponseDtoInfo getUserInfo(@PathVariable String username, HttpServletResponse response) throws Exception {

        ResponseDtoInfo responseDtoInfo = petstoreService.getUserInfo(username);
        return responseDtoInfo;
    }

}
