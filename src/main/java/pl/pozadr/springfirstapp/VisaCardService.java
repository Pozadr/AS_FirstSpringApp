package pl.pozadr.springfirstapp;

import org.springframework.stereotype.Service;

@Service
public class VisaCardService implements Card {
    public VisaCardService() {

    }

    @Override
    public String getInfo() {
        return "VisaCardService";
    }
}
