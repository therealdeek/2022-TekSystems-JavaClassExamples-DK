package com.teksystems.springboot.controller;

import com.teksystems.springboot.database.CourseDAO;
import com.teksystems.springboot.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private CourseDAO courseDao;

    //@Value( "${spring.datasource.url}" )
    //private String variable;

    // search by instructor name
    // add an additional search field to the jsp page to take in the instructor name.  Put it in the same form that already exists and give the input box a different name
    // create a DAO method to search by instructor name.  Maybe do something fancy to allow finding any string in the instruct name value  .. using one of the spring data functions.
    // to the controller .. add another parameter that will take in the insturctor name
    // add the instructor name to the model so you can display again on the page after submit
    // query your list of courses and display them below.
    // BONUS : make a single query that can search by course name or instructor name.


    @RequestMapping(value = {"/", "/index", "/index.html"}, method = RequestMethod.GET)
    public ModelAndView slash(@RequestParam(required = false) String search) {

        ModelAndView response = new ModelAndView();
        response.setViewName("index");

        // print out the incoming value in search variable
        System.out.println("Search parameter to page : " + search);
        // add the search variable to the model so it can be displayed on the page.
        response.addObject("search", search);

        response.addObject("name", "David");

//		System.out.println("Index controller request");
//
        List<Course> courses = courseDao.findByNameContainingIgnoreCaseOrderByNameDesc(search);
//		for ( Course c : courses ) {
//			System.out.println(c.getName());
//		}
        response.addObject("courses", courses);

        return response;
    }

    @RequestMapping(value = {"/search"}, method = RequestMethod.GET)
    public ModelAndView search() {
        System.out.println("Index controller search request");

        return null;
    }



}