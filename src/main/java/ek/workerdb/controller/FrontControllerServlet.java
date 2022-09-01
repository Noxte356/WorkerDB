package ek.workerdb.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = {"/*.do"})

public class FrontControllerServlet extends HttpServlet {
    private Map<String,Action> uriToAction;

    public FrontControllerServlet() {
        uriToAction = new HashMap<>();
        uriToAction.put("add-worker",new AddingWorkerAction());
        uriToAction.put("delete-worker",new DeleteWorkerAction());
        uriToAction.put("all-workers",new GetAllWorkerAction());
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UrlParser urlParser = new UrlParser();
        String actionName = urlParser.parsing(req.getRequestURI());
        uriToAction.get(actionName);
    }
}
