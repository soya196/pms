package controllers;

import play.*;
import play.mvc.*;

/**
 * Created with IntelliJ IDEA.
 * User: sonthaya
 * Date: 9/4/12 AD
 * Time: 6:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class ProjectDocController extends Controller {
    public static Result index(){
        return ok(views.html.projectdoc.doclist.render("Hello"));
    }
}
