package question5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by John on 10/26/16.
 */
public class Main {
    public static void main(String[] args) {
        List<Meeting> meetings = new ArrayList<>();
        List<Meeting> condensed = new ArrayList<>();

        meetings.add(new Meeting(0,1));
        meetings.add(new Meeting(3,5));
        meetings.add(new Meeting(4,8));
        meetings.add(new Meeting(10,12));
        meetings.add(new Meeting(9,10));

        Comparator<Meeting> byStartTime = (m1, m2) -> Integer.compare(m1.getStartTime(), m2.getStartTime());

        meetings
            .stream()
            .sorted(byStartTime)
            .forEach(meeting -> System.out.println(meeting));

        List<Meeting> mergedMeetings = new ArrayList<>();
        mergedMeetings.add(meetings.get(0));

        meetings.stream().forEach(currentMeeting -> {
            Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size() - 1);

            if(currentMeeting.getStartTime() <= lastMergedMeeting.getEndTime()){
                lastMergedMeeting.setEndTime(Math.max(lastMergedMeeting.getEndTime(), currentMeeting.getEndTime()));
            } else{
                mergedMeetings.add(currentMeeting);
            }
        });

        System.out.println("-------------------------------");
        for(Meeting meeting : mergedMeetings){
            System.out.println(meeting);
        }


    }

}
