package utils;

// src/main/java/utils/GradeUtils.java

import config.GlobalConfig;

import java.util.Map;

public class GradeUtils {

    public static String getGrade(int score) {
        GlobalConfig config = GlobalConfig.getInstance();
        for (Map.Entry<String, int[]> entry : config.gradeRanges.entrySet()) {
            int[] range = entry.getValue();
            if (score >= range[0] && score <= range[1]) {
                return entry.getKey();
            }
        }
        return "Invalid Score";
    }
}