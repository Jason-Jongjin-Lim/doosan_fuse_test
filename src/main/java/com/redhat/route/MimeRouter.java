package com.redhat.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MimeRouter extends RouteBuilder {
  @Override
  public void configure() throws Exception {

    from("direct:multipart")
        .unmarshal()
        .mimeMultipart();
  }
}
