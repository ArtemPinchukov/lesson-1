public class Boss implements IWorker  {
    @Override
    public void goToWork() {
        System.out.println("Boss приехал на работу к 12.00");

    }

    @Override
    public void pay() {
        System.out.println("Boss получил 1000$");

    } //implements - принадлежность

}
