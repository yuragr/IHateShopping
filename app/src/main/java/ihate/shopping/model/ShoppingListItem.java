package ihate.shopping.model;

/**
 * Created by yurig on 25-Feb-17.
 */

/**
 * Represents an Item in the context of a shopping list
 */
public class ShoppingListItem {
    private Item item;
    private long quantity;
    private String comment;

    public ShoppingListItem() {
    }

    public ShoppingListItem(Item item) {
        this.item = item;
        quantity = 1;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
