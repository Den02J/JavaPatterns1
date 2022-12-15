package StructuralPatterns.Facade;

public class Workflow {
    Worker1 worker1 = new Worker1();
    Worker2 worker2 = new Worker2();

    public void jobProcess(){
        worker1.doTheJob();
        worker2.solveProblem();
        worker2.makeReport();
        worker1.takeBreak();
    }

}
