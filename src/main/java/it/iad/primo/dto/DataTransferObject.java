package it.iad.primo.dto;

public class DataTransferObject {

    private String messaggio;

    public DataTransferObject(String messaggio) {
        this.messaggio = messaggio;
    }

    public String getMessaggio() {
        return messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

}
