package site.yangxiao.sdweb.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import site.yangxiao.sdweb.service.LocalStreamService;

@RestController
public class LocalStreamController {
    LocalStreamService localStreamService;

    @Autowired
    public LocalStreamController(LocalStreamService localStreamService) {
        this.localStreamService = localStreamService;
    }

    @GetMapping(value = "video/{title}", produces = "video/mp4")
    public Mono<Resource> getVideos(@PathVariable String title, @RequestHeader("Range") String range) {
        System.out.println("range in bytes() : " + range);
        return localStreamService.getVideo(title);
    }
}
