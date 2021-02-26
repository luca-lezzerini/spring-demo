package it.iad.primo.controller;

import it.iad.primo.dto.DataTransferObject;
import it.iad.primo.service.DemoService;
import it.iad.primo.service.impl.DemoServiceImpl;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// rilassiamo la politica CORS, consentendo a chiunque di chiamare il controller
@CrossOrigin("*")
@RestController
public class DemoController {

    @Autowired
    DemoService servizio;
        
    @RequestMapping("/saluta")
    @ResponseBody
    public DataTransferObject chiamata1() {
        System.out.println("Siamo qui!!!!");
        LocalDateTime ldt = servizio.calcolaDataOra();
        return new DataTransferObject(ldt.toString());
    }
}
