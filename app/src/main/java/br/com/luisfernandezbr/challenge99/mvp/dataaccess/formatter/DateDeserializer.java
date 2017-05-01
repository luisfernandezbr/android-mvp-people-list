package br.com.luisfernandezbr.challenge99.mvp.dataaccess.formatter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.luisfernandezbr.challenge99.pojo.AppFormattedDate;


public class DateDeserializer implements JsonDeserializer<AppFormattedDate> {
    private static final String YYYY_MM_DD_HH_MM_SS_Z = "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'";
    private static final String DD_MM_YYYY = "dd/MM/yyyy";

    @Override
    public AppFormattedDate deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        if (json != null) {
            final String jsonString = json.getAsString();
            try {
                Date formattedDate = this.getFormattedDate(YYYY_MM_DD_HH_MM_SS_Z, jsonString);
                AppFormattedDate result = new AppFormattedDate();
                result.setContent(this.getFormattedDate(DD_MM_YYYY, formattedDate));
                return result;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private Date getFormattedDate(String format, String stringDate) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.parse(stringDate);
    }

    private String getFormattedDate(String format, Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        String formattedDate = simpleDateFormat.format(date);
        return formattedDate;
    }
}

