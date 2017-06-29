package question4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by John on 6/27/17.
 */
public class Main {

    public static void main(String[] args){
        List<Meeting> today = new ArrayList<>();
        today.add(new Meeting(4,6));
        today.add(new Meeting(2,5));
        today.add(new Meeting(2,4));
        today.add(new Meeting(3,5));
        today.add(new Meeting(9,10));
        today.add(new Meeting(10,11));
        today.add(new Meeting(12,13));
        today.add(new Meeting(12,11));

        mergeMeetings(today);
    }

    public static List<Meeting> mergeMeetings(List<Meeting> meetings) {

        meetings.sort(new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                if(o1.getStartTime() >= o2.getStartTime()) {
                    if(o1.getStartTime() == o2.getStartTime()) {
                        if(o1.getEndTime() > o2.getEndTime()) {
                            return 1;
                        } else if (o1.getEndTime() < o2.getEndTime()) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                    return 1;
                }

                if(o1.getStartTime() < o2.getStartTime()) {
                    return -1;
                }
                return 0;
            }
        });

        List<Meeting> mergedMeetings = new ArrayList<>();

        for(int i = 0; i < meetings.size(); i++) {

            Meeting mergedMeeting = new Meeting(meetings.get(i).getStartTime(),
                    meetings.get(i).getEndTime());

            mergedMeetings.add(mergedMeeting);

            for(int j = i+1; j < meetings.size(); j++) {
                if (mergedMeeting.getEndTime() >= meetings.get(j).getStartTime()) {
                    mergedMeeting.setEndTime(meetings.get(j).getEndTime());
                } else {
                    i = j;
                    mergedMeetings.add(new Meeting(meetings.get(j).getStartTime(),
                            meetings.get(j).getEndTime()));
                    break;
                }
            }
        }
        return mergedMeetings;
    }
}
