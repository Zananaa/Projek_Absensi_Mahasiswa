// src/main/java/config/GlobalConfig.java

package config;

import java.util.HashMap;
import java.util.Map;

public class GlobalConfig {
    private static GlobalConfig instance;
    private Map<String, String> config;
    public Map<String, int[]> gradeRanges;

    private GlobalConfig() {
        config = new HashMap<>();
        gradeRanges = new HashMap<>();
        // Initialize default values
        config.put("defaultAbsen", "20");
        config.put("defaultTugas", "20");
        config.put("defaultUTS", "30");
        config.put("defaultUAS", "30");

        // Initialize default grade ranges
        gradeRanges.put("A", new int[]{85, 100});
        gradeRanges.put("B+", new int[]{75, 84});
        gradeRanges.put("B", new int[]{65, 74});
        gradeRanges.put("C+", new int[]{55, 64});
        gradeRanges.put("C", new int[]{45, 54});
        gradeRanges.put("D", new int[]{35, 44});
        gradeRanges.put("E", new int[]{0, 34});
    }

    public static GlobalConfig getInstance() {
        if (instance == null) {
            instance = new GlobalConfig();
        }
        return instance;
    }

    public String getConfig(String key) {
        return config.get(key);
    }

    public void setConfig(String key, String value) {
        config.put(key, value);
    }

    public int[] getGradeRange(String grade) {
        return gradeRanges.get(grade);
    }

    public void setGradeRange(String grade, int[] range) {
        gradeRanges.put(grade, range);
    }
}