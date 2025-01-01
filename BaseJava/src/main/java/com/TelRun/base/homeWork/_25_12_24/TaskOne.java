package com.TelRun.base.homeWork._25_12_24;

public class TaskOne {

    public static void main(String[] args) {
        String[] parameter = {"model", "V-60", "country", "Germany",
                "city", "Berlin", "year", null, "active", "true" };
        boolean isFirst = true;
        StringBuilder sb = new StringBuilder("SELECT * FROM cars WHERE ");
        for (int i = 0; i < parameter.length; i += 2) {
            String key = parameter[i];
            String value = parameter[i + 1];
            if (value != null) {
                if (!isFirst) {
                    sb.append(" AND ");
                }
                sb.append(key).append(" = ").append("'").append(value).append("'");
                isFirst = false;
            }
        }
        sb.append(";");
        System.out.println(sb.toString());
    }
}
