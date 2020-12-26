package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        String str;
        for (int i = 0; i < s.length(); i++) {
            str = Character.valueOf(s.charAt(i)).toString();
            if (str.equals(" ")) {
                sb.append(s.charAt(i + 1));
            }
        }
        return sb.toString();
    }
}
