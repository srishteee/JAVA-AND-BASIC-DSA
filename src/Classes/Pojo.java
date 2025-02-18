package Classes;

public class Pojo {

    // A POJO is a simple Java object that does not depend on any external frameworks or libraries. It is a class that encapsulates data and provides getters and setters to access and modify that data. POJOs are widely used in Java applications for modeling data.
    // when a requ comnes to our system ffrom client then for ex name and id is there from req then write one pojo
    // intilize the the things and getter settter and all the rest classes use this pojo if something change then pojo will change
}
// controoler - business logic - repo - repo has entity in pojo then in db

//Characteristics of a POJO:
//It should not extend any predefined class (e.g., javax.servlet.http.HttpServlet).
//
//It should not implement any predefined interfaces (e.g., java.io.Serializable).
//
//It should not have any annotations (e.g., @Entity, @Table).
//
//It should have private fields, public getters, and setters.