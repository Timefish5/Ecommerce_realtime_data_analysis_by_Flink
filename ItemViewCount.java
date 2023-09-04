package behavior;

public class ItemViewCount {

    private Long itemId;

    private Long window;

    private Long count;

    public Long getItemId() {
        return itemId;
    }

    public Long getWindow() {
        return window;
    }

    public Long getCount() {
        return count;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setWindow(Long window) {
        this.window = window;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ItemViewCount(Long itemId, Long window, Long count) {
        this.itemId = itemId;
        this.window = window;
        this.count = count;
    }

    @Override
    public String toString() {
        return "ItemViewCount{" +
                "itemId=" + itemId +
                ", window=" + window +
                ", count=" + count +
                '}';
    }
}
