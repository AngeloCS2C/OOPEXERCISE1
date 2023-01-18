class Bicycle{ 

//Data Member

	private String ownerName;
	private String tagNo;
	private String id;

//Constructor Initialize the Date Members

	public Bicycle(){

		ownerName = "unknown";
		tagNo = "unknown";

	}
	public Bicycle (String tagNo,String name) {
	this.id =tagNo;
	this.ownerName=name;
	}
	public String getOwnerName(){
    return ownerName;
	}
	public void setOwnerName(String  name){
    ownerName=name;
    }
	public String getTagNo(){
    return tagNo;
	}
	
	
//Returns the name of the Bicycle's owner

	public  void setTagNo(String name){
    tagNo=name;
	}
	//Assign the name of the Bicycle owner

	public String getId( ){
    return id;
	}
	public void setId(String id_no) {
    id=id_no;
    }
	}
