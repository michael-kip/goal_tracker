import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        get("/form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();

            return new ModelAndView(model, "form.hbs");
        }, new HandlebarsTemplateEngine());
        get("/quote_list", (request, response) -> {
            Map<String, Object>model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String description = request.queryParams("name");
            model.put("name","name");
            model.put("description", "description");
            return new ModelAndView(model, "quote_list.hbs");
        }, new HandlebarsTemplateEngine());

    }
}
