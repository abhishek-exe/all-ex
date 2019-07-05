package java8;

public class Phone {
int mobileNo;
public int getmobileNo() {
	return mobileNo;
	
}
@SuppressWarnings("unused")
private void setmobileNo(int mobileNO) {
	this.mobileNo = mobileNO;
	
}
@Override
public String toString() {
	return "Phone [mobileNo="+mobileNo +"]";
}
}



