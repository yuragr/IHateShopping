package ihate.shopping.model;

/**
 * Created by yurig on 25-Feb-17.
 */

public class Item {
    private String id;
    private String name;
    private ItemCategory category;

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

    public ItemCategory getCategory() {
        return category;
    }

    public void setCategory(ItemCategory category) {
        this.category = category;
    }
}
