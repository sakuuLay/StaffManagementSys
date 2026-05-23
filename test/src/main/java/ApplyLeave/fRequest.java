package ApplyLeave;

public class fRequest extends LeaveRequest {
	
	
	private String approval;
	private String email;
	private String submission;
	
	public fRequest(int Reqid, int eID, String eName, String dID, String type, String date, String des, String approval, String email, String submission) {
		super(Reqid, eID, eName, dID, type, date, des);
		// TODO Auto-generated constructor stub
		
		this.approval = approval;
		this.email = email;
		this.submission = submission;
		
	}

	@Override
	public int getReqID() {
		// TODO Auto-generated method stub
		return super.getReqID();
	}

	@Override
	public int getEID() {
		// TODO Auto-generated method stub
		return super.getEID();
	}

	@Override
	public String geteName() {
		// TODO Auto-generated method stub
		return super.geteName();
	}

	@Override
	public String getDID() {
		// TODO Auto-generated method stub
		return super.getDID();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return super.getType();
	}

	@Override
	public String getDate() {
		// TODO Auto-generated method stub
		return super.getDate();
	}

	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return super.getDes();
	}

	@Override
	public void setReqID(int reqID) {
		// TODO Auto-generated method stub
		super.setReqID(reqID);
	}

	@Override
	public void setEID(int eID) {
		// TODO Auto-generated method stub
		super.setEID(eID);
	}

	@Override
	public void seteName(String eName) {
		// TODO Auto-generated method stub
		super.seteName(eName);
	}

	@Override
	public void setDID(String dID) {
		// TODO Auto-generated method stub
		super.setDID(dID);
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
		super.setType(type);
	}

	@Override
	public void setDate(String date) {
		// TODO Auto-generated method stub
		super.setDate(date);
	}

	@Override
	public void setDes(String des) {
		// TODO Auto-generated method stub
		super.setDes(des);
	}

	public String getApproval() {
		return approval;
	}

	public String getEmail() {
		return email;
	}

	public String getSubmission() {
		return submission;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSubmission(String submission) {
		this.submission = submission;
	}
	
	
	

}
