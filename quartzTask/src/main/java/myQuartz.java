import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class myQuartz {
    private final static Logger log = LoggerFactory.getLogger(myQuartz.class);

    public void autoOpinion(){
        log.info("我是一个定时任务");
        log.info("用来提醒你莫忘初心");
        log.info("(✿◠‿◠)");
        System.out.println(
                "i am a quartz"
        );
    }

}
