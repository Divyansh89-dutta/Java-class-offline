abstract class Phone{
    abstract void call();
    abstract void txtMsg();
}
abstract class SmartPhone extends Phone{
    abstract void browse(String url);
    abstract void videoRecording();
}
class NothingPhone extends SmartPhone{
    public static void main(String[] args) {
        NothingPhone s = new NothingPhone();
        s.call();
        s.browse("https://google.com");
    }

    @Override
    void browse(String url) {
        System.out.println("Browsing website: " + url);
    }

    @Override
    void videoRecording() {
        System.out.println("Recoding video in 4k");
    }

    @Override
    void call() {
        System.out.println("Calling using Nothing Phone");
    }

    @Override
    void txtMsg() {
        System.out.println("Sanding text message");
    }
}
