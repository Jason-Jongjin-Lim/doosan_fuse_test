package com.redhat.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import sun.misc.HexDumpEncoder;

@Component
public class Inspector implements Processor {

  private static final Logger logger = LoggerFactory.getLogger(Inspector.class);

  @Override
  public void process(Exchange exchange) throws Exception {

    byte[] in = exchange.getContext().getTypeConverter().mandatoryConvertTo(byte[].class,
        exchange.getIn().getBody());

    HexDumpEncoder hexDump = new HexDumpEncoder();

    logger.info("Sending body dump :\n" + hexDump.encodeBuffer(in));

    logger.info("body : " + exchange.getIn().getBody());
  }
}
