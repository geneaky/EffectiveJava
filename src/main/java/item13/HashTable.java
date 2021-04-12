package item13;

public class HashTable implements Cloneable{
    private Integer[] buckets;

    public HashTable(Integer[] buckets) {
        this.buckets = buckets;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Integer[] getBuckets() {
        return buckets;
    }

    public void setBuckets(Integer[] buckets) {
        this.buckets = buckets;
    }
}
