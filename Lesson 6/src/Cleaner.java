public class Cleaner implements IWorker {
    @Override
    public void goToWork() {
        System.out.println("Cleaner приехал на работу к 7.00");
    }

    @Override
    public void pay() {
        System.out.println("Cleaner получил 250$");

    }
}
