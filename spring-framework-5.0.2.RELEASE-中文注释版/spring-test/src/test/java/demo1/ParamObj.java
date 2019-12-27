package demo1;

import java.io.Serializable;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/10/23  下午8:08
 * @Version 1.0
 */
public class ParamObj implements Serializable {

    String actionName;

    String jobApplicationId;

    String jobRequisitionId;

    String title;

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getJobApplicationId() {
        return jobApplicationId;
    }

    public void setJobApplicationId(String jobApplicationId) {
        this.jobApplicationId = jobApplicationId;
    }

    public String getJobRequisitionId() {
        return jobRequisitionId;
    }

    public void setJobRequisitionId(String jobRequisitionId) {
        this.jobRequisitionId = jobRequisitionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ParamObj{" +
            "actionName='" + actionName + '\'' +
            ", jobApplicationId='" + jobApplicationId + '\'' +
            ", jobRequisitionId='" + jobRequisitionId + '\'' +
            ", title='" + title + '\'' +
            '}';
    }
}
