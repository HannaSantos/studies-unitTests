package utils;

import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

public class DateUtils {


    /**
     * Retorna a data enviada por parametro com a adição dos dias desejado
     * 	a Data pode estar no futuro (dias > 0) ou no passado (dias < 0)
     *
     * @param date
     * @param days
     * @return
     */
    public static Date addDays(Date date, int days) {
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);
        calendar.add(DAY_OF_MONTH, days);
        return calendar.getTime();
    }

    /**
     * Retorna a data atual com a diferenca de dias enviados por parametro
     * 		a Data pode estar no futuro (parametro positivo) ou no passado (parametro negativo)
     *
     * @param days Quantidade de dias a ser incrementado/decrementado
     * @return Data atualizada
     */
    public static Date getDateDifferenceDays(int days) {
        return addDays(new Date(), days);
    }

    /**
     * Retorna uma instância de <code>Date</code> refletindo os valores passados por parametro
     *
     * @param day
     * @param month
     * @param year
     * @return
     */
    public static Date getDate(int day, int month, int year){
        Calendar calendar = Calendar.getInstance();

        calendar.set(DAY_OF_MONTH, day);
        calendar.set(MONTH, month - 1);
        calendar.set(YEAR, year);
        return calendar.getTime();
    }

    /**
     * Verifica se uma data é igual a outra
     * 	Esta comparação considera apenas dia, mes e ano
     *
     * @param day1
     * @param day2
     * @return
     */
    public static boolean isSameDate(Date day1, Date day2) {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(day1);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(day2);

        return (calendar1.get(DAY_OF_MONTH) == calendar2.get(DAY_OF_MONTH))
                && (calendar1.get(MONTH) == calendar2.get(MONTH))
                && (calendar1.get(YEAR) == calendar2.get(YEAR));
    }


    /**
     * Verifica se uma determinada data é o dia da semana desejado
     *
     * @param day Data a ser avaliada
     * @param dayWeek <code>true</code> caso seja o dia da semana desejado, <code>false</code> em caso contrário
     * @return
     */
    public static boolean checkDayWeek(Date day, int dayWeek) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(day);
        return calendar.get(DAY_OF_WEEK) == dayWeek;
    }


}
