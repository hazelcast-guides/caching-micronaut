package guides.hazelcast.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.runtime.Micronaut;

@Controller
public class Application {

    private String podName = System.getenv("MY_POD_NAME");

    @Get("/")
    public String homepage(){
        return "Homepage hosted by: " + podName + "\n";
    }

    public static void main(String[] args) {
        String port = "8080";
        if (args != null && args.length > 0){
            port = args[0];
        }
        Micronaut.run(Application.class, "-Dmicronaut.server.port=" + port);
    }
}
