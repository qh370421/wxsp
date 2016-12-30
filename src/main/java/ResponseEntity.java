/**
 * Created by qinhu on 2016/12/30.
 */
public class ResponseEntity {
    private int state;
    private String payload;
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
    public String getPayload() {
        return payload;
    }
    public void setPayload(String payload) {
        this.payload = payload;
    }

}
