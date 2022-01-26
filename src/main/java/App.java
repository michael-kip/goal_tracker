import models.Goal;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        externalStaticFileLocation("/public");
        get("/home", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();

            return new ModelAndView(model, "home.hbs");
        }, new HandlebarsTemplateEngine());
        get("/quote_list", (request, response) -> {
            Map<String, Object>model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String description = request.queryParams("description");
            System.out.println("description");
            model.put("name", name);
            model.put("description", description);
            return new ModelAndView(model, "quote_list.hbs");
        }, new HandlebarsTemplateEngine());

        post("/home", (request, response) -> {
            HashMap<String, Object> model = new HashMap<String, Object>();
            String title = request.queryParams("title");
            String category = request.queryParams("category");
            String description = request.queryParams("description");
            String quote = request.queryParams("quote");

            Goal goal = new Goal(title, category, description, quote);
            model.put("title", title);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

    }
}
