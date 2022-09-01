package ek.workerdb.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Action {
    void run(HttpServletRequest req, HttpServletResponse resp);
}
