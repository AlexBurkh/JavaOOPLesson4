package engine;

import models.Human;
import models.Kinship;
import models.KinshipManager;

import java.util.List;

public class GyneologicalExam {
    StringBuilder resultInfo;
    KinshipManager manager;

    public GyneologicalExam(KinshipManager manager) {
        resultInfo = new StringBuilder();
        this.manager = manager;
    }

    public String exam(Human humanToExam) {
        this.resultInfo.append(humanToExam.toString());
        var children = manager.findChildren(humanToExam);
        for (Human child : children) {
            resultInfo.append("\n\t").append(child);
        }
        return resultInfo.toString();
    }
}
