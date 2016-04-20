package com.yxt.array;

public class Count3Quit2 {
  public static void main(String[] args){
	  Circle c = new Circle(500);
	  System.out.println(c.count3Quit());
  }
}

class Kid{
    int i;
    Kid leftKid;
    Kid rightKid;
	
	public Kid(int i){
		this.i =i;
	}
}

class Circle{
    int count=0;
    int num;
    Kid first;
    Kid last;
	
	public Circle(int num){
		
		for(int i=0;i<num;i++){
			add();
		}
	}
	
	public void add(){
		Kid kid = new Kid(count);
		if (count==0){
			kid.leftKid = kid;
			kid.rightKid = kid;
			first = kid;
			last = kid;
		}else{
			first.leftKid = kid;
			last.rightKid = kid;
			kid.leftKid = last;
			kid.rightKid = first;
			last = kid;
			
		}
		count++;
	}
	
	public void delete(Kid kid){
		if(count==0){
			return;
		}else if(count==1){
			first=last = null;
		}else{
			kid.leftKid.rightKid = kid.rightKid;
			kid.rightKid.leftKid = kid.leftKid;
		}
		
		if(kid==first){
			first = kid.rightKid;
		}else if(kid==last){
			last = kid.leftKid;
		}
		count--;
	}
	
	public int count3Quit(){
		int num=0;
		Kid kid = first;
		while(count>1){
			num++;
			if(num==3){
				delete(kid);
				num=0;
			}
			kid = kid.rightKid;

		}
		
		return first.i;
	}
}