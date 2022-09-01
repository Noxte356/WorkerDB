package ek.workerdb.controller;

public class UrlParser {
    public String parsing(String url) {
        return url.substring(url.indexOf('/') + 1, url.indexOf('.'));
    }
}
