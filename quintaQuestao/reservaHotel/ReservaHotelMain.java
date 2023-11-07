

public class ReservaHotelMain {
    public static void main(String[] args) {
     
        // Instanciando/Criando um hotel

        Hotel hotel = new Hotel("Parati");

        //Instanciando/Criando quartos

        Quarto luxo = new Quarto("Luxo", 500, "25");
        Quarto padrao= new Quarto("Padrão", 200, "55");
        Quarto suite = new Quarto("Suíte", 300, "42");

        /*
         * Adicionando quartos ao hotel
         */
        hotel.adicionarNovoQuarto(luxo);
        hotel.adicionarNovoQuarto(padrao);
        hotel.adicionarNovoQuarto(suite);

        
        hotel.reservarQuarto("exemplo1", "11/11/2023", "15/11/2023", "Luxo");

        // calcular o valor com base na quantidade de dias hospedado
        for (ReservaQuarto reserva: hotel.getReservas()) {
            System.out.println("Valor"+ reserva.valorTotal());
        }
        

        // adicionar um método para verificar a disponibilidade

        //https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html

    }
}
