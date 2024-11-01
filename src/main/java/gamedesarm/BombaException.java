package gamedesarm;

public class BombaException extends Exception {
    public String getGosto() {
        return gosto;
    }

    public void setGosto(String gosto) {
        this.gosto = gosto;
    }

    private String gosto;

    public BombaException() {

    }
}
