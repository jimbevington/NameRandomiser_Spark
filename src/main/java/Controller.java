import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import javax.naming.Name;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class Controller {

    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        staticFileLocation("/public");

        NameRandomiser nameRandomiser = new NameRandomiser();

        get("/name_randomiser/1", (req, res) -> {

            String name = nameRandomiser.oneName();

            HashMap<String, Object> model = new HashMap<>();
            model.put("name", name);

            model.put("template", "one_name.vtl");
            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);


        get("/name_randomiser/2", (req, res) -> {

            ArrayList<String> names = nameRandomiser.twoNames();

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", names);

            model.put("template", "two_names.vtl");
            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);

    }
}
