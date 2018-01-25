package com.stockholm.api.setting.task.config;

import com.chad.library.adapter.base.entity.SectionEntity;

public class TaskOptions extends SectionEntity<TaskOption> {


    /**
     * isHeader : true
     * header : 信息播报(可多选)
     * optionTask : {}
     */

    private TaskOption optionTask;

    public TaskOptions(boolean isHeader, String header) {
        super(isHeader, header);
    }

    public TaskOption getOptionTask() {
        return optionTask;
    }

    public void setOptionTask(TaskOption optionTask) {
        this.optionTask = optionTask;
    }
}
