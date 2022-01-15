package samples.fb.search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RevenueMilestones {

    int[] getMilestoneDays(int[] revenues, int[] milestones) {
        // Write your code here
        if (milestones.length < 1 || revenues.length < 1) {
            return new int[] {-1};
        }

        // for each revenue, add it to prev sum and check against milestone
        // ensure milestones are sorted

        int[] res = new int[milestones.length];
        for (int i=0; i< milestones.length; i++) {
            res[i] = milestones[i];
        }

        Arrays.sort(milestones);

        int sum = 0;

        Map<Integer, Integer> resultMap = new HashMap<>();

        int day = 0;

        for (int milestoneIdx = 0; milestoneIdx < milestones.length; milestoneIdx++) {
            int milestone = milestones[milestoneIdx];
            if (sum >= milestone) {
                resultMap.put(milestone, day);
                continue;
            }

            while (sum < milestone && day < revenues.length) {
                sum+=revenues[day++];
            }

            if (sum >= milestone) {
                resultMap.put(milestone, day);
            } else {
                resultMap.put(milestone, -1);
            }
        }

        for (int i = 0; i < res.length; i++) {
            res[i] = resultMap.get(res[i]);
        }

        return res;
    }

}
