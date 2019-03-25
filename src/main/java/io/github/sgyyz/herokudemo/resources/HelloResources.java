package io.github.sgyyz.herokudemo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @GetMapping("/{name}")
  public Mono<String> helloName(@PathVariable("name") String name) {
    return Mono.just("Hello, " + name);
  }
}
