/**
 * Created by qinhu on 2016/12/30.
 */
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;


@RestController

//使用自动配置，主动添加并解析bean，配置文件等信息
@EnableAutoConfiguration

public class Controller{
    //设置访问的url
    @RequestMapping("/")
    //表示返回JSON格式的结果，如果前面使用的是@RestController可以不用写
    //@ResponseBody
    ResponseEntity home() {
        ResponseEntity re = new ResponseEntity();
        re.setState(1);
        re.setPayload("Hello World秦虎");
        return re;
        //return "Hello World秦虎!";//返回结果为字符串
    }

    public static void main(String[] args) throws Exception {
        //通过SpringApplication的run()方法启动应用，无需额外的配置其他的文件
        SpringApplication.run(Controller.class, args);
    }

}
