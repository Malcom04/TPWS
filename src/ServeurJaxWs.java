import ws.BanqueService;

import javax.xml.ws.Endpoint;

public class ServeurJaxWs {
    public static void main(String[] args) {
        String url="Http://0.0.0.0:8686/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web service déployé sur "+url);
    }
}
