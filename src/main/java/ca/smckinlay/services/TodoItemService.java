package ca.smckinlay.services;

import ca.smckinlay.model.ToDoItem;
import ca.smckinlay.model.TodoData;

public interface TodoItemService {

    void addItem(ToDoItem item);
    void removeItem(int id);
    ToDoItem getItem(int id);
    void updateItem(ToDoItem item);
    TodoData getData();

}
