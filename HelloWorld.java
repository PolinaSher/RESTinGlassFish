import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// The Java class will be hosted at the URI path
@Path("/helloworld")
//Resource class
public class HelloWorld {
    // The Java method will process HTTP GET requests
    @GET
    @Produces("text/plain")
    public String getClicheMessage(){
        return "Hello World";
    }
}

//https://www.jetbrains.com/idea/download/#section=windows
//https://www.jetbrains.com/help/idea/creating-and-running-your-first-restful-web-service.html#
//
//once that is running you can try
//https://spring.io/guides/gs/rest-service/
//JetBrains
//Download IntelliJ IDEA: The Java IDE for Professional Developers by JetBrains
//Download the latest version of IntelliJ IDEA for Windows, macOS or Linux.
//Platforms:
//Windows, macOS, Linux
//	http://resources.jetbrains.com/storage/products/intellij-idea/img/meta/intellij-idea_1280x800.png
//spring.io
//Spring
//Level up your Java code and explore what Spring can do for you.
