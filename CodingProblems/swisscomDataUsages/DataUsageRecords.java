package CodingProblems.swisscomDataUsages;

import java.util.List;
import java.util.Objects;

public class DataUsageRecords implements Comparable<DataUsageRecords> {

    int customerId;
    int dataConsumedInMb;

    public DataUsageRecords(int customerId, int dataConsumedInMb) {
        this.customerId = customerId;
        this.dataConsumedInMb = dataConsumedInMb;
    }

    @Override
    public String toString() {
        return "DataUsageRecords{" +
                "customerId=" + customerId +
                ", dataConsumedInMb=" + dataConsumedInMb +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataUsageRecords that = (DataUsageRecords) o;
        return dataConsumedInMb == that.dataConsumedInMb;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dataConsumedInMb);
    }

    @Override
    public int compareTo(DataUsageRecords that) {
        return this.dataConsumedInMb - that.dataConsumedInMb;
    }
}
