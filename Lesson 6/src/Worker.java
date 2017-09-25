public class Worker implements IWorker {
    @Override
    public void goToWork() {
        System.out.println("Worker приехал на работу к 8.00");
    }

    @Override
    public void pay() {
        System.out.println("Worker получил 450$");

    }
}
