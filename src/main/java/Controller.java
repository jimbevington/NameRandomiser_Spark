import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import javax.naming.Name;

import java.util.HashMap;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class Controller {

    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        staticFileLocation("/public");

        get("/name_randomiser/1", (req, res) -> {

            NameRandomiser nameRandomiser = new NameRandomiser();
            String name = nameRandomiser.oneName();

            HashMap<String, Object> model = new HashMap<>();
            model.put("name", name);

            model.put("template", "one_name.vtl");
            return new ModelAndView(model, "template.vtl");

        }, velocityTemplateEngine);

    }
}
