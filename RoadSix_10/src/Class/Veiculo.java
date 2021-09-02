package Class;

import java.sql.Time;
import java.util.Date;


public class Veiculo {

    private int numero ;
    private String  placa  ;
    private String motorista;
    private String modelo;  
    private String dataCompra; 
    private int qtdPoltronas;

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

    public Date getDataViagem() {
        return dataViagem;
    }

    public void setDataViagem(Date dataViagem) {
        this.dataViagem = dataViagem;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Double getValor() {
        return valor;
    }

    //Rotas
    public void setValor(Double valor) {
        this.valor = valor;
    }
    private String origem,destino;
    private Date dataViagem;
    private Time hora;
    private Double valor;
    
    
	public String getPol() {
		return pol;
	}

	public void setPol(String pol) {
		this.pol = pol;
	}
    private String pol;

    
     
	public String getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the motorista
     */
    public String getMotorista() {
        return motorista;
    }

    /**
     * @param motorista the motorista to set
     */
    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the dataCompra
     */
 

   
    public int getQtdPoltronas() {
        return qtdPoltronas;
    }

    /**
     * @param qtdPoltronas the qtdPoltronas to set
     */
    public void setQtdPoltronas(int qtdPoltronas) {
        this.qtdPoltronas = qtdPoltronas;
    }

     
}
