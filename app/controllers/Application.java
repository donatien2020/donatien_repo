package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render("Application/index.html");
    	// List<Post> posts = Post.find("author.email", Security.connected()).fetch();
        // render(posts);
    }

}