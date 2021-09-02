package Class;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.swing.JOptionPane;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 ** Autor: Andre Portugal * Data : 01/01/2012 * Sistema de Gestão de Notas
 * Fiscais Eletrônicas de Serviços
 */
public class DateMath {

    public DateMath() {
    } // classes utilitárias não são instanciáveis.

    private static Calendar referenceCalendar = Calendar.getInstance();

    public static void setReferenceCalendar(Calendar calendar) {
        referenceCalendar = calendar;
    }

    public static Date today() {
        return new Date();
    }

    public static Date tomorrow() {
        return nextDayAfter(today());
    }

    public static Date yesterday() {
        return nextDayBefore(today());
    }

    public static Date nextDayAfter(Date date) {
        return daysAfter(date, 1);
    }

    public static Date nextDayBefore(Date date) {
        return daysBefore(date, 1);
    }

    public static Date daysAfter(Date date, int numberOfDays) {
        return calculateRelativeDateAfter(date, numberOfDays);
    }

    public static Date daysBefore(Date date, int numberOfDays) {
        return calculateRelativeDateAfter(date, -numberOfDays);
    }

    public static boolean isBetween(Date date, Date start, Date end) {
        return date.compareTo(start) >= 0 || date.compareTo(end) <= 0;
    }

    public static Date min(Date a, Date b) {
        if (a.compareTo(b) > 0) {
            return b;
        }

        return a;
    }

    public static Date max(Date a, Date b) {
        if (a.compareTo(b) < 0) {
            return b;
        }

        return a;
    }

    public static Date toDateOnly(Date date) {
        // ignora informação de horas
        Calendar calendar = (Calendar) referenceCalendar.clone();
        calendar.setTime(date);

        calendar.clear(Calendar.HOUR_OF_DAY);
        calendar.clear(Calendar.MINUTE);
        calendar.clear(Calendar.SECOND);
        calendar.clear(Calendar.MILLISECOND);

        return calendar.getTime();
    }

    /**
     * Calcula o número de dias entre duas datas.
     */
    public static int daysBetween(Date start, Date end) {

        if (start.compareTo(end) < 0) {
            return start.compareTo(end);
        } else if (start.compareTo(end) == 0) {
            return 0; // É o mesmo dia.
        } else {
            return start.compareTo(end);
        }

//        Calendar calendar = (Calendar) referenceCalendar.clone();
//        calendar.setTime(toDateOnly(end));
//         
//        Date endDate = toDateOnly(start);
//         
//        int count =0;
//        while (calendar.getTime().compareTo(endDate)!=0){
//            
//            calendar.add(Calendar.DATE, 1);
//            count++;
//        }
//         
//        return count;
    }

    private static Date calculateRelativeDateAfter(Date date, int numberOfDays) {
        if (numberOfDays == 0) {
            return date;
        }

        Calendar calendar = (Calendar) referenceCalendar.clone();

        calendar.setTime(date);
        calendar.add(Calendar.DATE, numberOfDays);

        return calendar.getTime();
    }

    public static int getMonth(Date data) {
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(data);
        return calendario.get(Calendar.MONTH);
    }

    public static int getDay(Date data) {
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(data);
        return calendario.get(Calendar.DAY_OF_MONTH);
    }

    public static int getYear(Date data) {
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(data);
        return calendario.get(Calendar.YEAR);
    }

    public static Date getDate(Date data) {
        try {
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            String s = f.format(data);
            Date date = (Date) f.parse(s);

            return date;
        } catch (ParseException parseException) {
            return data;
        }
    }

    public static Date getDate(String data) {
        try {
            DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            Date date = (Date) f.parse(data);
            return date;
        } catch (ParseException parseException) {
            return null;
        }
    }

    public static Date getDate(Timestamp data) {
        try {
            long millis2 = data.getTime();
            Date date = new Date(millis2);
            return date;
        } catch (Exception parseException) {
            return null;
        }
    }

    public static Date getDateYMD(Date data) {
        try {
            SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
            String s = f.format(data);
            Date date = (Date) f.parse(s);

            return date;
        } catch (ParseException parseException) {
            return data;
        }
    }

    public static boolean validaData(String inDate) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        if (inDate.trim().length() != (dateFormat.toPattern().length())) {
            JOptionPane.showMessageDialog(null, "Data inválida");
            return false;
        }

        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(null, "Data inválida");
            return false;
        }

        return true;
    }

    private static DatatypeFactory df = null;

    static {
        try {
            df = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            String msg = "Erro ao tentar obter uma nova instância de DatatypeFactory";
            throw new IllegalStateException(msg, e);
        }
    }

    /* Converte um java.util.Date em uma instância de XMLGregorianCalendar 
     * no formato yyyy-MM-dd, sem os milisegundos 
     */
    public static XMLGregorianCalendar asXMLGregorianCalendar(java.util.Date date) {
        if (date == null) {
            return null;
        } else {
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(date);

            XMLGregorianCalendar xmlGregorianCalendar = df.newXMLGregorianCalendar();
            xmlGregorianCalendar.setDay(calendar.get(Calendar.DAY_OF_MONTH));
            xmlGregorianCalendar.setMonth(calendar.get(Calendar.MONTH) + 1);
            xmlGregorianCalendar.setYear(calendar.get(Calendar.YEAR));

            return xmlGregorianCalendar;
        }
    }

    // Converte um XMLGregorianCalendar para uma instância de java.util.Date  
    public static java.util.Date asDate(XMLGregorianCalendar xmlGC) {
        if (xmlGC == null) {
            return null;
        } else {
            return xmlGC.toGregorianCalendar().getTime();
        }
    }

    public static String obterdata(Date data) {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        String s = null;
        if (data != null) {
            s = f.format(data);
        }

        return s;
    }

    public static String obterdataYMD(Date data) {
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
        String s = null;
        if (data != null) {
            s = f.format(data);
        }

        return s;
    }

    public static String obterHora(Date data) {
        SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
        String s = f.format(data);
        return s;
    }

    public static String obterDataHora(Date data) {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String s = f.format(data);
        return s;

    }

    public static int obterTotaldeDias(Date initialDate, Date finalDate) {
        if (initialDate == null || finalDate == null) {
            return 0;
        }
        int days = (int) ((finalDate.getTime() - initialDate.getTime()) / (24 * 60 * 60 * 1000));
        return (days > 0 ? days : 0);
    }

    public static int obterQtdDiasUteis(Date initialDate, Date finalDate) {
        int workingDays = 0;
        int totalDays = obterTotaldeDias(initialDate, finalDate);
        //tah eu sei que getDay, getYar e getMonth sao deprecated, eu coloquei so pra teste.
        Calendar calendar = new GregorianCalendar(finalDate.getYear(), finalDate.getMonth(), finalDate.getDay());
        for (int i = 0; i <= totalDays; i++) {
            if (!(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) && !(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) {
                workingDays++;
            }
            calendar.add(Calendar.DATE, 1);
        }
        return workingDays;
    }

    public static Date ajustaFusoData(Date data) {
        try {
            int fuso = -1 * TimeZone.getDefault().getRawOffset() / 3600000;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(data);
            calendar.add(Calendar.HOUR_OF_DAY, fuso);
            return calendar.getTime();

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
