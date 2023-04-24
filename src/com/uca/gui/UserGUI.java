package com.uca.gui;

import com.uca.core.UserCore;
import com.uca.dao.UserDAO;
import com.uca.entity.UserEntity;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class UserGUI {

    public static String getAllUsers() throws IOException, TemplateException {
        Configuration configuration = _FreeMarkerInitializer.getContext();

        Map<String, Object> input = new HashMap<>();

        input.put("users", UserCore.getAllUsers());

        Writer output = new StringWriter();
        Template template = configuration.getTemplate("users/users.ftl");
        template.setOutputEncoding("UTF-8");
        template.process(input, output);

        return output.toString();
    }
    public static String Create() throws IOException, TemplateException {
        Configuration configuration = _FreeMarkerInitializer.getContext();
        UserEntity obj=new UserEntity();
        UserEntity input = UserCore.Create(obj);



        Writer output = new StringWriter();
        Template template = configuration.getTemplate("users/register.ftl");
        template.setOutputEncoding("UTF-8");
        template.process(input, output);

        return output.toString();
    }

    public static String Login() throws IOException, TemplateException {
        Configuration configuration = _FreeMarkerInitializer.getContext();

          String input =UserCore.Login();
        Writer output = new StringWriter();
        Template template = configuration.getTemplate("users/login.ftl");
        template.setOutputEncoding("UTF-8");
        template.process(input, output);

        return output.toString();
    }


}
