package matala0;

public class WifiNetworkExport {

	private String SSID;
	private String MAC;
	private int freuncy;
	private int signal;
	
	
	public String getSSID() {
		return SSID;
	}
	public void setSSID(String sSID) {
		SSID = sSID;
	}
	public String getMAC() {
		return MAC;
	}
	public void setMAC(String mAC) {
		MAC = mAC;
	}
	public int getFreuncy() {
		return freuncy;
	}
	public void setFreuncy(int freuncy) {
		this.freuncy = freuncy;
	}
	public int getSignal() {
		return signal;
	}
	public void setSignal(int signal) {
		this.signal = signal;
	}
}
