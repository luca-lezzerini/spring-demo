package it.iad.primo.service.impl;

import it.iad.primo.service.DemoService;
import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public LocalDateTime calcolaDataOra() {
        System.out.println("Siamo nel service impl !!!!!! :-P");
        return LocalDateTime.now();
    }

}
