package ihate.shopping.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yurig on 25-Feb-17.
 */

public class ShoppingList {
    private Store store;
    private List<ShoppingListItem> todoList;
    private List<ShoppingListItem> doneList;

    public ShoppingList() {
        todoList = new ArrayList<>();
        doneList = new ArrayList<>();
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
        // TODO rearrange the lists according to the store template
    }

    public List<ShoppingListItem> getTodoList() {
        return todoList;
    }

    public void setTodoList(List<ShoppingListItem> todoList) {
        this.todoList = todoList;
    }

    public List<ShoppingListItem> getDoneList() {
        return doneList;
    }

    public void setDoneList(List<ShoppingListItem> doneList) {
        this.doneList = doneList;
    }
}
