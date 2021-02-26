package it.iad.primo.controller;

import it.iad.primo.dto.DataTransferObject;
import it.iad.primo.dto.MoltiplicaDto;
import it.iad.primo.service.DemoService;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping("/moltiplica")
    @ResponseBody
    public MoltiplicaDto moltiplica(@RequestBody MoltiplicaDto dto) {
        System.out.println("Siamo qui!!!!");
        double d =  servizio.moltiplica(dto.getNumero());
        return new MoltiplicaDto(d);
    }
}
