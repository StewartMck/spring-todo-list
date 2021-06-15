package ca.smckinlay.services;

import ca.smckinlay.model.ToDoItem;
import ca.smckinlay.model.TodoData;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TodoItemsServiceImpl implements TodoItemService{

    // == fields ==
    @Getter
    private final TodoData data = new TodoData();

    // == public methods ==

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

//    @Override
//    public TodoData getData() {
//        return data;
//    }
}
