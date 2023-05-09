package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

public class Datas {
    public static void main(String[] args) throws ParseException, InterruptedException {
/*
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();

        System.out.println(date.getDate() + "/" + date.getMonth() + "/" + (date.getYear() + 1900));

        System.out.println(calendar.getTimeInMillis());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
        System.out.println( simpleDateFormat.format(date));

        System.out.println(calendar.DAY_OF_MONTH);

        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(date));

        System.out.println(calendar.DAY_OF_WEEK - 1);

        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.parse("2023-03-04"));
        */

        /*
        //todo testando com after para ver se a data 1 é maior que a segunda e temos o before para ver se a data 1 é menor que a data 2
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date dateVencimento = simpleDateFormat.parse("10/04/2022");
        Date dateAtual = simpleDateFormat.parse("07/04/2022");

        if(dateVencimento.before(dateAtual)){
            System.out.println("ta vencido");
        }else {
            System.out.println("ta ai nem esquenta");
        }
         */
/*
        Calendar calendar = Calendar.getInstance();//todo pega a data atual

        calendar.setTime(new SimpleDateFormat("yyyy-MM-dd").parse("2022-04-07"));//todo definindo uma data

        calendar.add(Calendar.MONTH, -5);

        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()));
 */
/*
        //todo total de dias de uma data utilizando o between
        long between = ChronoUnit.MONTHS.between(LocalDate.parse("2022-04-07"), LocalDate.now());
        System.out.println(between);
 */
/*
        //todo geração de parcelas
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2022-04-07");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        for (int i= 1; i <=12; i++){
            calendar.add(Calendar.MONTH,1);
            System.out.println("Parcela " + i + " Seu vencimento é " + new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()));
        }
 */

        //todo nova API de data a partir do java8

        LocalDate localDate = LocalDate.now(); //todo pega data atual
        LocalTime localTime = LocalTime.now();// todo pega a hora atual
        LocalDateTime localDateTime = LocalDateTime.now();//todo pega a data e hora atual

        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));

        System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        System.out.println(localDate.getDayOfWeek().name());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());

        Instant instantInicial = Instant.now();

        Thread.sleep(2000);

        Instant instantFinal = Instant.now();
        Duration duration = Duration.between(instantInicial, instantFinal);

        System.out.println(duration.toMinutes());
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());

        LocalDate date = LocalDate.parse("2022-04-07");

        for(int mes= 1; mes <= 12; mes++){
            date = date.plusMonths(1);
            System.out.println("Parcela " + date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "  = " + mes);
        }

    }
}
