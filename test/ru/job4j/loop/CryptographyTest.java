package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class CryptographyTest {

    @Test
    public void codeLengthGreat4() {
        String code = Cryptography.code("1579823514869578");
        assertThat(code, is("############9578"));
    }

    @Test
    public void codeLenghtLess4() {
        String code = "213";
        assertThat(code, is("213"));
    }

    @Test
    public void codeEmptyString() {
        String code = "";
        assertThat(code, is(""));
    }
}