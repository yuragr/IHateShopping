package ihate.shopping.model.comparator;

import java.util.Comparator;

import ihate.shopping.model.ItemCategory;

/**
 * Created by yurig on 25-Feb-17.
 */

public class CategoryComparator implements Comparator<ItemCategory> {
    @Override
    public int compare(ItemCategory category1, ItemCategory category2) {
        return Integer.compare(category1.getOrder(), category2.getOrder());
    }
}
