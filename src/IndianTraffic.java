public class IndianTraffic implements CentralTraffic {
    public static void main(String[] args) {
        CentralTraffic traffic = new IndianTraffic();
        traffic.redStop();
        traffic.waitYellow();
        traffic.goGreen();


    }

    @Override
    public void redStop() {
        System.out.println("When the Signal is Red. please STOP");
    }

    @Override
    public void waitYellow() {
        System.out.println("When the Signal is Yellow, please WAIT");
    }

    @Override
    public void goGreen() {
        System.out.println("When the Signal is Green, you can GO");
    }
}
