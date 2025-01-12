package smartphone;

public class SmartPhone {
	private ICamera camera; 
	private IPhone phone; 

	public SmartPhone(ICamera camera, IPhone phone) {
		this.phone = phone;
		this.camera = camera;
	}

	public void takePhoto(){
		this.camera.takePhoto();
	}

	public void makePhoneCall(){
		this.phone.makePhoneCall();
	}

}
