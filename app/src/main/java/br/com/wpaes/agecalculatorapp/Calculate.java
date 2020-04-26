package br.com.wpaes.agecalculatorapp;

import java.util.Calendar;

public class Calculate {

    private int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    public int getAge(String birthdate) {
        String[] birthday = birthdate.split("/");
        return currentYear - Integer.parseInt(birthday[2]);
    }
}
