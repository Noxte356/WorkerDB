package ek.workerdb.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class AddingWorkerAction implements Action {
    @Override
    public void run(HttpServletRequest req, HttpServletResponse resp) {
        try {
            PrintWriter writer = resp.getWriter();
            writer.println("Hello World!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
