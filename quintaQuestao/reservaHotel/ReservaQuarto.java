

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ReservaQuarto {
    private Quarto quarto;
    private String cliente;
    private String dataEntrada;
    private String dataSaida; 
    private Period diferencaData;
    DateTimeFormatter formatarData= DateTimeFormatter.ofPattern("dd/MM/yyyy");
    

    public ReservaQuarto(Quarto quarto, String cliente, String dataEntrada, String dataSaida) {
        this.quarto = quarto;
        this.cliente = cliente;        
        LocalDate checkin= LocalDate.parse(dataEntrada,formatarData);
        LocalDate checkout= LocalDate.parse(dataSaida,formatarData);
        diferencaData= Period.between(checkin, checkout);
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public String getCliente() {
        return cliente;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }
     
    public float valorTotal(){

        int quantidadeDeDias= diferencaData.getDays();

        if (quantidadeDeDias<1) {
            return 0;
        }

        return quantidadeDeDias * quarto.getValor();
    }

}
