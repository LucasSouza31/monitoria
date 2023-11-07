

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hotel {
    private String nomeHotel;
    private List<Quarto> quartos;
    private List<ReservaQuarto> reservas;


    public Hotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
        quartos= new ArrayList<>();
        reservas= new ArrayList<>();
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    public List<Quarto> getQuartos() {
        return Collections.unmodifiableList(quartos);
    }

    public List<ReservaQuarto> getReservas() {
        return Collections.unmodifiableList(reservas);
    }
    
    public void adicionarNovoQuarto(Quarto quarto){
        this.quartos.add(quarto);
    }

    boolean reservarQuarto(String cliente, String dataEntrada, String dataSaida, String categoria){

        for (Quarto quarto : quartos) {
            
            if (quarto.isDisponibilidade() && quarto.getCategoria().equals(categoria)) {
                quarto.reservar();
                ReservaQuarto reservar= new ReservaQuarto(quarto, cliente, dataEntrada, dataSaida);
                reservas.add(reservar);
                return true;
            }

        }
        return false;
    }

}
