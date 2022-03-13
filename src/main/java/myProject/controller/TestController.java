package myProject.controller;

import myProject.business.ITestService;
import myProject.dto.response.DarkhastResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * Created by: F.kamyab on 3/12/2022.
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private ITestService iTestService;

    @PostMapping(path = "darkhast")
    public ResponseEntity<DarkhastResponse> getDarkhast(@NotNull @RequestBody Long request) {
        DarkhastResponse darkhastResponse = new DarkhastResponse();
        darkhastResponse.setDarkhastDtoList(iTestService.getDarkhast(request));
        return new ResponseEntity<>(darkhastResponse, HttpStatus.OK);
    }
}