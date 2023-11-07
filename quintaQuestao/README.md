
# Sistema de Reservas de Hotéis

Desenvolva um sistema de reservas de hotéis. Cada hotel possui vários quartos, e cada quarto tem diferentes categorias, como luxo, padrão, suíte, etc. Os clientes podem fazer reservas para datas específicas e escolher um tipo de quarto. O sistema deve rastrear a disponibilidade de quartos e calcular o preço total da reserva com base na categoria do quarto e no número de noites.

1. **Cada hotel possui vários quartos**;
2. **Cada quarto tem diferentes categorias**;
3. **Os clientes podem fazer reservas para datas específicas e escolher um tipo de quarto**;
4. **rastrear a disponibilidade de quartos e calcular o preço total da reserva com base na categoria do quarto e no número de noites**.

## Trabalhando com datas
```java
        LocalDate dataExemplo= LocalDate.now(); 
        LocalTime tempoExemplo= LocalTime.now();

        // trabalhando com mês
        int mes= dataExemplo.getMonthValue();
        int ano= dataExemplo.getYear();
        int dia= dataExemplo.getDayOfMonth();

        // trabalhando com tempo
        int segundos= tempoExemplo.getSecond();
        int minutos= tempoExemplo.getMinute();
        int horas= tempoExemplo.getHour();

        // imprimindo os valores
        System.out.println("Ano: "+ano+" Mês: "+mes+" dia: "+dia);
        System.out.println();
        System.out.println(horas+" Horas "+minutos+" minutos "+ segundos+" segundos ");
        System.out.println();
       

        // trabalhando datas com Strings
        String dataDeChegada = "11/11/2023";
        String dataDeSaida = "15/11/2023";
        
        DateTimeFormatter formatarData= DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataFormatadaChegada = String.format(dataDeSaida, formatarData);// esta linha configura para que a data saia nesse formato dd/MM/yyyy

        LocalDate checkin = LocalDate.parse(dataDeChegada, formatarData);
        LocalDate checkout= LocalDate.parse(dataDeSaida, formatarData);

        System.out.println("Entrada: "+checkin);
        System.out.println();
        System.out.println("Saída: "+checkout);
        System.out.println();
        System.out.println("Data de chegada formatada: "+dataFormatadaChegada);


        // calculando a diferença de dias

        Period diferencaEntreDatas= Period.between(checkin,checkout);

        int quantidadeDeDiasHospedado= diferencaEntreDatas.getDays();

        System.out.println("Dias hospedado: "+quantidadeDeDiasHospedado);

        

        //https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html

```