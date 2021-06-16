package ca.smckinlay.controller;

import ca.smckinlay.model.ToDoItem;
import ca.smckinlay.model.TodoData;
import ca.smckinlay.services.TodoItemService;
import ca.smckinlay.util.AttributeNames;
import ca.smckinlay.util.Mappings;
import ca.smckinlay.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Slf4j
@Controller
public class ToDoItemController {

    // == fields ==
    private final TodoItemService todoItemService;

    // == constructors ==
    @Autowired
    public ToDoItemController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    // == model attributes ==
    @ModelAttribute
    public TodoData toDoData(){
        return todoItemService.getData();
    }

    // == handler methods ==

    //http://localhost:8080/todo-list/items
    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
}

    @GetMapping(Mappings.ADD_ITEM)
    public String addEditItem(@RequestParam(required = false, defaultValue = "-1") int id, Model model) {
        log.info("editing id= {}", id);
        ToDoItem toDoItem = todoItemService.getItem(id);
        if(toDoItem == null) {
            toDoItem = new ToDoItem("", "", LocalDate.now());
        }
        model.addAttribute(AttributeNames.TODO_ITEM, toDoItem);
        return ViewNames.ADD_ITEM;
    }


    @PostMapping(Mappings.ADD_ITEM)
    /*  This method will be called after the submit form
        Auto get obj from form, add @ModelAttribute to parameter and Spring MVC will autobind form data to parameter
        Return full obj with all fields set
        attribute name will be same as class and start with lowecase letter (toDoItem)
        AttributeName needs to match attribute name specified in form
     */
    public String processItem(@ModelAttribute(AttributeNames.TODO_ITEM) ToDoItem toDoItem) {
        log.info("todoItem from form = {}", toDoItem);
        if(toDoItem.getId() == 0) {
            todoItemService.addItem(toDoItem);
        } else {
            todoItemService.updateItem(toDoItem);
        }
        // redirecting after post to another URL
        return "redirect:/" + Mappings.ITEMS;
    }

    @GetMapping(Mappings.DELETE_ITEM)
    public String deleteItem(@RequestParam int id){
        log.info("deleted item id= {}", id);
        todoItemService.removeItem(id);
        return "redirect:/" + Mappings.ITEMS;
    }



}
