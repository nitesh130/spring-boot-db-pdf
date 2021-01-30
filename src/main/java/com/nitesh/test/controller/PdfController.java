package com.nitesh.test.controller;

import com.nitesh.test.utils.PDFGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class PdfController {

    @Autowired
    PDFGenerator generator;

    @GetMapping(path="/report/pdf")
    public ResponseEntity<String> generatePdf() {
        generator.generatePdfReport();
        return new ResponseEntity<String>("REPORT is generated", HttpStatus.OK);
    }

}
