public class Main {
    public static void main(String[] args){
        AppConfig config = AppConfig.getInstance(); 
        config.setServerUrl("http://miapi.com");
        System.out.println("URL del Servidor: " + config.getServerUrl()); 

        config.setID(428942832);
        System.out.println("Número de Identificación: " + config.getID());

        config.setPort(10567);
        System.out.println("Puerto del servidor: " + config.getPort()); 

        config.setServer(true);
        System.out.println("¿Este es un servidor?: " + config.isServer());
    }
}
