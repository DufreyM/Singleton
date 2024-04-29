public class AppConfig {
    private static AppConfig instance; 
    private String serverUrl; 
    private int port; 
    private int ID; 
    private boolean isServer;

    private AppConfig(){
        this.serverUrl = "localhost";
        this.port = 800;
        this.ID = 320039021;
        this.isServer = true;
    }

    public static synchronized AppConfig getInstance(){
        if (instance == null){
            instance = new AppConfig(); 
        }
        return instance; 
    }

    public String getServerUrl() {
        return serverUrl;
    }
    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public boolean isServer() {
        return isServer;
    }
    public void setServer(boolean isServer) {
        this.isServer = isServer;
    } 
    
}
