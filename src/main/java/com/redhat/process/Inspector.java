package com.redhat.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import sun.misc.HexDumpEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.util.Collection;

@Component
public class Inspector implements Processor {


  @Value("${JAVA_HOME}")
  String javaHome;


  private static final Logger logger = LoggerFactory.getLogger(Inspector.class);

  @Override
  public void process(Exchange exchange) throws Exception {

    byte[] body = exchange.getContext().getTypeConverter().mandatoryConvertTo(byte[].class,
        exchange.getIn().getBody());

    HexDumpEncoder hexDump = new HexDumpEncoder();

    logger.info("body dump :\n" + hexDump.encodeBuffer(body));

    exchange.getIn().setBody(body);

  }
}
