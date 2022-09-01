package ek.workerdb.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrlParserTest {
    UrlParser urlParser = new UrlParser();
    @Test
    void shouldReturnActionName() {
        //given


        // when
        String actionName = urlParser.parsing("");

        //then
    }
}