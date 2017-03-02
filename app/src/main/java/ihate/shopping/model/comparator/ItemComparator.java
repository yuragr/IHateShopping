package ihate.shopping.model.comparator;

import java.util.Comparator;

import ihate.shopping.model.Item;

/**
 * Created by yurig on 25-Feb-17.
 */

public class ItemComparator implements Comparator<Item> {
    private static CategoryComparator categoryComparator = new CategoryComparator();

    @Override
    public int compare(Item item1, Item item2) {
        int result = categoryComparator.compare(item1.getCategory(), item2.getCategory());
        if (result == 0) {
            result = item1.getName().toLowerCase().compareTo(item2.getName().toLowerCase());
        }
        return result;
    }
}
