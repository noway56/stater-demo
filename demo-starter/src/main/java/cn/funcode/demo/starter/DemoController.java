package cn.funcode.demo.starter;

import cn.funcode.yslspringbootstarter.YslService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/ysl")
@RestController
public class DemoController {

    @Autowired
    private YslService yslService;

    @GetMapping("/starter")
    ResponseEntity getYslStarter(){
        String s = yslService.yslSay();
        return new ResponseEntity(s, HttpStatus.OK);
    }
}
