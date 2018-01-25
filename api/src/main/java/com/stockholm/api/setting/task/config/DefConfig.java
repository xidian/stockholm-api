package com.stockholm.api.setting.task.config;

import com.google.gson.Gson;
import com.stockholm.api.setting.task.MineTask;
import com.stockholm.api.setting.task.TaskBean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefConfig {

    public static final int TEMP_TYPE_CUSTOMIZE = 3;

    private final static String TASKJSON = " [{\n" +
            " \t\t\"taskId\": \"djkitF\",\n" +
            " \t\t\"taskName\": \"铃声\",\n" +
            " \t\t\"packageName\": \"com.stockholm.clock\",\n" +
            " \t\t\"order\": 0\n" +
            " \t},\n" +
            " \t{\n" +
            " \t\t\"taskId\": \"ux8cy7\",\n" +
            " \t\t\"taskName\": \"日历\",\n" +
            " \t\t\"packageName\": \"com.stockholm.calendar\",\n" +
            " \t\t\"order\": 1\n" +
            " \t},\n" +
            " \t{\n" +
            " \t\t\"taskId\": \"XGRYFf\",\n" +
            " \t\t\"taskName\": \"天气\",\n" +
            " \t\t\"packageName\": \"com.stockholm.weather\",\n" +
            " \t\t\"order\": 2\n" +
            " \t},\n" +
            " \t{\n" +
            " \t\t\"taskId\": \"f66qEE\",\n" +
            " \t\t\"taskName\": \"新闻\",\n" +
            " \t\t\"packageName\": \"com.stockholm.news\",\n" +
            " \t\t\"order\": 3\n" +
            " \t},\n" +
            " \t{\n" +
            " \t\t\"taskId\": \"Tz0XLe\",\n" +
            " \t\t\"taskName\": \"mozilk\",\n" +
            " \t\t\"packageName\": \"com.stockholm.mozik\",\n" +
            " \t\t\"order\": 4\n" +
            " \t}\n" +
            " ]";

    private final static String TEMPLATEJSON = "[{\n" +
            "\n" +
            "\t\t\"templateType\": 0,\n" +
            "\t\t\"name\": \"起床播报\",\n" +
            "\t\t\"startTime\": \"07:30\",\n" +
            "\t\t\"repeatType\": 2,\n" +
            "\t\t\"repeatValue\": \"\",\n" +
            "\t\t\"tasks\": [{\n" +
            "\t\t\t\t\"taskId\": \"djkitF\",\n" +
            "\t\t\t\t\"packageName\": \"com.stockholm.clock\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"taskId\": \"ux8cy7\",\n" +
            "\t\t\t\t\"packageName\": \"com.stockholm.calendar\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"taskId\": \"XGRYFf\",\n" +
            "\t\t\t\t\"packageName\": \"com.stockholm.weather\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"taskId\": \"f66qEE\",\n" +
            "\t\t\t\t\"packageName\": \"com.stockholm.news\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"durationType\": 3,\n" +
            "\t\t\"durationValue\": 20,\n" +
            "\t\t\"enableManual\": false,\n" +
            "\t\t\"invalidTime\": 20,\n" +
            "\t\t\"open\": false\n" +
            "\t},\n" +
            "\t{\n" +
            "\n" +
            "\t\t\"templateType\": 1,\n" +
            "\t\t\"name\": \"下班播报\",\n" +
            "\t\t\"startTime\": \"18:30\",\n" +
            "\t\t\"repeatType\": 3,\n" +
            "\t\t\"repeatValue\": \"\",\n" +
            "\t\t\"tasks\": [{\n" +
            "\t\t\t\t\"taskId\": \"ux8cy7\",\n" +
            "\t\t\t\t\"packageName\": \"com.stockholm.calendar\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"taskId\": \"f66qEE\",\n" +
            "\t\t\t\t\"packageName\": \"com.stockholm.news\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"durationType\": 4,\n" +
            "\t\t\"durationValue\": 30,\n" +
            "\t\t\"enableManual\": true,\n" +
            "\t\t\"invalidTime\": 120,\n" +
            "\t\t\"open\": false\n" +
            "\t},\n" +
            "\t{\n" +
            "\n" +
            "\t\t\"templateType\": 2,\n" +
            "\t\t\"name\": \"睡觉提醒\",\n" +
            "\t\t\"startTime\": \"23:00\",\n" +
            "\t\t\"repeatType\": 3,\n" +
            "\t\t\"repeatValue\": \"\",\n" +
            "\t\t\"tasks\": [{\n" +
            "\t\t\t\"taskId\": \"Tz0XLe\",\n" +
            "\t\t\t\"packageName\": \"com.stockholm.mozik\"\n" +
            "\t\t}],\n" +
            "\t\t\"durationType\": 4,\n" +
            "\t\t\"durationValue\": 30,\n" +
            "\t\t\"enableManual\": false,\n" +
            "\t\t\"invalidTime\": 0,\n" +
            "\t\t\"open\": false\n" +
            "\t},\n" +
            "\t{\n" +
            "\n" +
            "\t\t\"templateType\": 3,\n" +
            "\t\t\"name\": \"\",\n" +
            "\t\t\"startTime\": \"\",\n" +
            "\t\t\"repeatType\": 4,\n" +
            "\t\t\"repeatValue\": \"1,2,3,4,5,6\",\n" +
            "\t\t\"tasks\": [{\n" +
            "\t\t\t\t\"taskId\": \"djkitF\",\n" +
            "\t\t\t\t\"packageName\": \"com.stockholm.clock\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"taskId\": \"ux8cy7\",\n" +
            "\t\t\t\t\"packageName\": \"com.stockholm.calendar\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"taskId\": \"XGRYFf\",\n" +
            "\t\t\t\t\"packageName\": \"com.stockholm.weather\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"taskId\": \"f66qEE\",\n" +
            "\t\t\t\t\"packageName\": \"com.stockholm.news\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"durationType\": 3,\n" +
            "\t\t\"durationValue\": 20,\n" +
            "\t\t\"enableManual\": false,\n" +
            "\t\t\"invalidTime\": 0,\n" +
            "\t\t\"open\": false\n" +
            "\t}\n" +
            "]";

    private static final String TASK_OPTIONS = "[{\n" +
            "\t\"isHeader\": true,\n" +
            "\t\"header\": \"信息播报(可多选)\",\n" +
            "\t\"optionTask\": {}\n" +
            "}, {\n" +
            "\t\"isHeader\": false,\n" +
            "\t\"header\": \"\",\n" +
            "\t\"optionTask\": {\n" +
            "\t\t\"icon\": \"\",\n" +
            "\t\t\"name\": \"铃声\",\n" +
            "\t\t\"taskId\": \"djkitF\",\n" +
            "\t\t\"checked\": false,\n" +
            "\t\t\"desc\": \"音乐提醒\",\n" +
            "\t\t\"installed\": true,\n" +
            "\t\t\"online\": true,\n" +
            "\t\t\"fromStore\": false,\n" +
            "\t\t\"order\": 0,\n" +
            "\t\t\"conflict\": false,\n" +
            "\t\t\"packageName\": \"com.stockholm.clock\"\n" +
            "\t}\n" +
            "}, {\n" +
            "\t\"isHeader\": false,\n" +
            "\t\"header\": \"\",\n" +
            "\t\"optionTask\": {\n" +
            "\t\t\"icon\": \"\",\n" +
            "\t\t\"name\": \"日历\",\n" +
            "\t\t\"taskId\": \"ux8cy7\",\n" +
            "\t\t\"checked\": false,\n" +
            "\t\t\"desc\": \"播放今日的日期\",\n" +
            "\t\t\"installed\": true,\n" +
            "\t\t\"online\": true,\n" +
            "\t\t\"fromStore\": true,\n" +
            "\t\t\"order\": 1,\n" +
            "\t\t\"conflict\": false,\n" +
            "\t\t\"packageName\": \"com.stockholm.calendar\"\n" +
            "\t}\n" +
            "}, {\n" +
            "\t\"isHeader\": false,\n" +
            "\t\"header\": \"\",\n" +
            "\t\"optionTask\": {\n" +
            "\t\t\"icon\": \"\",\n" +
            "\t\t\"name\": \"天气\",\n" +
            "\t\t\"taskId\": \"XGRYFf\",\n" +
            "\t\t\"checked\": false,\n" +
            "\t\t\"desc\": \"播放当前定位城市天气\",\n" +
            "\t\t\"installed\": true,\n" +
            "\t\t\"online\": true,\n" +
            "\t\t\"fromStore\": true,\n" +
            "\t\t\"order\": 2,\n" +
            "\t\t\"conflict\": false,\n" +
            "\t\t\"packageName\": \"com.stockholm.weather\"\n" +
            "\t}\n" +
            "}, {\n" +
            "\t\"isHeader\": true,\n" +
            "\t\"header\": \"信息播报(一下应用请选择一项)\",\n" +
            "\t\"optionTask\": {}\n" +
            "}, {\n" +
            "\t\"isHeader\": false,\n" +
            "\t\"header\": \"\",\n" +
            "\t\"optionTask\": {\n" +
            "\t\t\"icon\": \"\",\n" +
            "\t\t\"name\": \"新闻播报\",\n" +
            "\t\t\"taskId\": \"f66qEE\",\n" +
            "\t\t\"checked\": false,\n" +
            "\t\t\"desc\": \"播放已关注的新闻频道\",\n" +
            "\t\t\"installed\": true,\n" +
            "\t\t\"online\": true,\n" +
            "\t\t\"fromStore\": true,\n" +
            "\t\t\"order\": 3,\n" +
            "\t\t\"conflict\": true,\n" +
            "\t\t\"packageName\": \"com.stockholm.news\"\n" +
            "\t}\n" +
            "}, {\n" +
            "\t\"isHeader\": false,\n" +
            "\t\"header\": \"\",\n" +
            "\t\"optionTask\": {\n" +
            "\t\t\"icon\": \"\",\n" +
            "\t\t\"name\": \"mozik\",\n" +
            "\t\t\"taskId\": \"Tz0XLe\",\n" +
            "\t\t\"checked\": false,\n" +
            "\t\t\"desc\": \"随机播放mozik心情音乐\",\n" +
            "\t\t\"installed\": true,\n" +
            "\t\t\"online\": true,\n" +
            "\t\t\"fromStore\": true,\n" +
            "\t\t\"order\": 4,\n" +
            "\t\t\"conflict\": true,\n" +
            "\t\t\"packageName\": \"com.stockholm.mozik\"\n" +
            "\t}\n" +
            "}]";

    private List<DefTask> defTasks;
    private Map<String, DefTask> defTaskMap;

    private List<MineTask> tempTasks;
    private Map<Integer, MineTask> tempTaskMap;

    private List<TaskOptions> taskOptions;
    private Map<String, TaskOptions> taskOptionMap;

    public DefConfig() {
        defTasks = stringToArray(TASKJSON, DefTask[].class);
        tempTasks = stringToArray(TEMPLATEJSON, MineTask[].class);
        taskOptions = stringToArray(TASK_OPTIONS, TaskOptions[].class);
        defTaskMap = new HashMap<>();
        tempTaskMap = new HashMap<>();
        taskOptionMap = new HashMap<>();
        list2Map();
    }

    private void list2Map() {
        for (DefTask defTask : defTasks) {
            defTaskMap.put(defTask.getTaskId(), defTask);
        }
        for (MineTask tempTask : tempTasks) {
            tempTaskMap.put(tempTask.getTemplateType(), tempTask);
        }
        for (TaskOptions taskOption : taskOptions) {
            taskOptionMap.put(taskOption.getOptionTask().getTaskId(), taskOption);
        }
    }

    public String parseTaskName(String taskId) {
        return defTaskMap.get(taskId).getTaskName();
    }

    public String parseTasksName(List<TaskBean> taskBeans) {
        StringBuffer stringBuffer = new StringBuffer();
        for (TaskBean taskBean : taskBeans) {
            stringBuffer.append(defTaskMap.get(taskBean.getTaskId()).getTaskName() + " ");
        }
        return stringBuffer.toString();
    }

    public DefTask parseTask(int taskId) {
        return defTaskMap.get(taskId);
    }

    public List getTempTasks() {
        return tempTasks;
    }

    public MineTask getTempTask(int tempType) {
        return tempTaskMap.get(tempType);
    }

    public List getTaskOptions() {
        return taskOptions;
    }

    public TaskOptions getTaskOption(String taskId) {
        return taskOptionMap.get(taskId);
    }

    private <T> List<T> stringToArray(String s, Class<T[]> clazz) {
        T[] arr = new Gson().fromJson(s, clazz);
        return Arrays.asList(arr);
    }

}

