package ca.smckinlay.controller;

import ca.smckinlay.model.TodoData;
import ca.smckinlay.util.Mappings;
import ca.smckinlay.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ToDoItemController {

    // == model attributes ==
    @ModelAttribute
    public TodoData toDoData(){
        return new TodoData();
    }

    // == handler methods ==

    //http://localhost:8080/todo-list/items
    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
}




}
