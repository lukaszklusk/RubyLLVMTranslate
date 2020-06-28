package main;

public class Variable {
	public String name="";
	public Types type;
	public String className;
	public boolean constant;
	public Object value;
	
	public Variable(Types type){
		this.type = type;
		constant = false;
	}
	
	public Variable(){
		this(Types.OBJECT);
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
	
	public String ll_typeName() {
		return LLVM.ll_typeName(type);
	}
}
