package site.yangxiao.sdweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.crypto.Data;
import java.util.Date;

@Controller
@RequestMapping("/")
public class MVController {

    @GetMapping("/")
    public String liveStream(){
        return "live-stream";
    }
}
