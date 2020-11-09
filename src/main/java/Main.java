import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Main {

    public static void main(String[] args) {
        log.debug("main started");
        Hello hello = new Hello();
        hello.logThis();

        new Lol().or();
        log.info("main canceling");
    }
}