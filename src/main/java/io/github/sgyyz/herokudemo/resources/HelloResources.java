package io.github.sgyyz.herokudemo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
public class HelloResources {

  @GetMapping
  public Mono<String> hello() {
    return Mono.just("Hello World.");
  }
}
