package Class;

import java.util.Date;
public class Rota {

    
    private String id;
    private String origem;
    private String destino;
    private String placa;
    private String data; 
    private String hora;
    private Double valor;
    private int poltrona;
    private int poltronaV;
    private int poltronaD;
    private String dataviagem;
    
    public int getPoltronaD() {
        return poltronaD;
    }

    public void setPoltronaD(int poltronaD) {
        this.poltronaD = poltronaD;
    }
   
    
    public String getDataviagem() {
        return dataviagem;
    }

    public void setDataviagem(String dataviagem) {
        this.dataviagem = dataviagem;
    }
   

    public int getPoltronaV() {
        return poltronaV;
    }

    public void setPoltronaV(int poltronaV) {
        this.poltronaV = poltronaV;
    }
    
    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }
   
    
     public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}
