package CodingProblems.swisscomDataUsages;

import java.util.*;
import java.util.stream.Collectors;

public class DataUsageRecordsImpl {

    public static void main(String[] args) {

        List<DataUsageRecords> records = new ArrayList<>();
        records.add(new DataUsageRecords(1, 500));
        records.add(new DataUsageRecords(2, 300));
        records.add(new DataUsageRecords(3, 485));
        records.add(new DataUsageRecords(4, 1400));

        Collections.sort(records, Comparator.reverseOrder());
        for (DataUsageRecords record : records){
            System.out.println("DataRecords: " + record);
        }
        int k = 2;
        List<DataUsageRecords> topK = records.subList(0, Math.min(k, records.size()));
        System.out.println(topK);

//        Iterator<DataUsageRecords> it = records.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        // Using Stream How can I do ?
//        int k = 2;
//        List<DataUsageRecords> topK = records.stream()
//                .collect(Collectors.groupingBy(
//                        r -> r.customerId,
//                        Collectors.summingInt(r -> r.dataConsumedInMb)
//                ))
//                .entrySet().stream()
//                .map(e -> new DataUsageRecords(e.getKey(), e.getValue()))
//                .sorted(Comparator.reverseOrder())
//                .limit(k)
//                .collect(Collectors.toList());

    }

}
