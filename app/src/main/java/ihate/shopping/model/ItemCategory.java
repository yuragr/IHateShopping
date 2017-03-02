package ihate.shopping.model;

/**
 * Created by yurig on 25-Feb-17.
 */

public class ItemCategory {
    private String id;
    private String name;
    private int order;

    public ItemCategory() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
