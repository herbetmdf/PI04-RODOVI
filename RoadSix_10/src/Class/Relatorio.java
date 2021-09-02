package Class;

import java.util.Date;

public class Relatorio {
    private int Id;
    private Date Data;
    private String CidadeDestino;
    private double Valor;
    private String DataI;
    private String DataF;
    private double ValorToatl;
    
    public String getDataI() {
		return DataI;
	}

    public void setDataI(String DataI) {
		this.DataI = DataI;
	}

    public String getDataF() {
		return DataF;
	}

    public void setDataF(String DataF) {
		this.DataF = DataF;
	}
    
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public String getCidadeDestino() {
        return CidadeDestino;
    }

    public void setCidadeDestino(String CidadeDestino) {
        this.CidadeDestino = CidadeDestino;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    

    public double getValorToatl() {
        return ValorToatl;
    }

    public void setValorToatl(double ValorToatl) {
        this.ValorToatl = ValorToatl;
    }
    
}
