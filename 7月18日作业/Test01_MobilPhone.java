package thursday;

public class Test01_MobilPhone {
//�𰸣��������ˣ�����һ��ƻ�����ӵ��ֻ��ɣ�
/*
 * MobilPho
 */

    public String brand;
    
    public Test01_MobilPhone() {
    	this.brand="ŵ����";
    }
    
    public Test01_MobilPhone(String bra) {
    	this.brand=bra;
    }
    
    public String buy() {
    	return "û�����ʣ���һ��"+brand+"���ӵ��ֻ��ɣ�";
    }

    public String buy(String reason ) {
    	return reason+"����һ��"+brand+"���ӵ��ֻ��ɣ�";
    }


}
