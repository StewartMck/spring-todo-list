package ca.smckinlay.services;

import ca.smckinlay.model.ToDoItem;
import ca.smckinlay.model.TodoData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TodoItemsServiceImpl implements TodoItemService{

    private final static TodoData data = new TodoData();

    @Override
    public void addItem(ToDoItem item) {
        data.addItem(item);
    }

    @Override
    public void removeItem(int id) {
        data.removeItem(id);
    }

    @Override
    public ToDoItem getItem(int id) {
        return getItem(id);
    }

    @Override
    public void updateItem(ToDoItem item) {
        updateItem(item);
    }

    @Override
    public TodoData getData() {
        return data;
    }
}
