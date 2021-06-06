package 상속;

public class DmbCellPhoneTest {

	public static void main(String[] args) {
		DmbCellPhone Phone = new DmbCellPhone();
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("애플","보라",10);
		
		System.out.println(dmbCellPhone.color+":"+dmbCellPhone.model);
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannel(20);
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.powerOff();
	}

}
