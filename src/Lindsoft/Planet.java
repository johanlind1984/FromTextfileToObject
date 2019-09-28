package Lindsoft;

public class Planet {

    private final String hostName;
    private final String ra;
    private final String dec;

    public Planet(String hostName, String ra, String dec) {
        this.hostName = hostName;
        this.ra = ra;
        this.dec = dec;
    }

    public String getHostName() {
        return hostName;
    }

    public String getRa() {
        return ra;
    }

    public String getDec() {
        return dec;
    }
}
