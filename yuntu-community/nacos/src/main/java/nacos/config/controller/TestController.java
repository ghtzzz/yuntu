package nacos.config.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    @Value("${token.value:true}")
    private String tokenValue;

    @RequestMapping("/success")
    public String success(){
        return tokenValue;
    }
}
