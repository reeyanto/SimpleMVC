package controllers;

import models.SimpleModel;

public class SimpleController {

    SimpleModel model = new SimpleModel();
    
    public String generate() {
        return "Hai " + model.randomText();
    }
    
}
