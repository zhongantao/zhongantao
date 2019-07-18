package thursday;

public class Test01_MobilPhone {
//答案：发工资了，快买一个苹果牌子的手机吧！
/*
 * MobilPho
 */

    public String brand;
    
    public Test01_MobilPhone() {
    	this.brand="诺基亚";
    }
    
    public Test01_MobilPhone(String bra) {
    	this.brand=bra;
    }
    
    public String buy() {
    	return "没发工资，买一个"+brand+"牌子的手机吧！";
    }

    public String buy(String reason ) {
    	return reason+"，买一个"+brand+"牌子的手机吧！";
    }


}
