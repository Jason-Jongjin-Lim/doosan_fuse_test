package com.redhat.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HandleUpload implements Processor {
 
  private static final Logger logger = LoggerFactory.getLogger(HandleUpload.class);

  @Override
  public void process(Exchange exchange) throws Exception {

  }


//  @Autowired
//  private SomeRepository someRepository;
//
//  @Handler
//  public void processUpload(@Attachments Map<String, DataHandler>
//                                attachments,
//                            @Header("Content-Type") String contentType,
//                            @Header("id") String id,
//                            Exchange exchange)
//      throws Exception {
//
//
//     ...
//  }
//
//  @Override
//  public void process(Exchange exchange) throws Exception {
//
//    logger.info("Upload received");
//
//    logger.info("Exchange body: " + exchange.getIn().getBody());
//    logger.info("Attachment size: " + (attachments == null ? 0 :
//        attachments.size()));
//    logger.info("Attachment object size: " +
//        (exchange.getIn().getAttachmentObjects() == null ? 0
//            : exchange.getIn().getAttachmentObjects().size()));
//    if (exchange.getIn().getAttachmentNames() != null) {
//      for (String name : exchange.getIn().getAttachmentNames()) {
//        logger.info("Attachment name: " + name);
//      }
//    }
//
//    if (contentType == null ||
//        !contentType.startsWith(MediaType.MULTIPART_FORM_DATA_VALUE)) {
//      logger.warn("Unsupported media type!");
//      throw new UnSupportedUploadMediaTypeException("Content-Type has
//          to be 'multipart/form-data'");
//    }
//
//    if (attachments.size() == 0) {
//      logger.warn("No attachments found!");
//    } else {
//      for (String key : attachments.keys()) {
//        logger.info("Filename: " + key);
//
//        String uploadKey = id + "_" + new
//            Date().toInstant().toEpochMilli() + "_" +
//            attachments.get(key).getDataSource().getName();
//
//        // stream data directly to a file to save memory footprint
//        File targetFile = new File(uploadKey);
//        try (OutputStream outStream = new FileOutputStream(targetFile,
//            false)) {
//          attachments.get(key).writeTo(outStream);
//        }
//
//         ...
//      }
//    }
//  }
} 

