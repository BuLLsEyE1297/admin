package com.chainsys.looping;

public class While {
public static void main(String[] args) {
	String[] names={"karthi","robin","sakthi","kavi"};
	

	int i=0;
	while(i<names.length){
		System.out.println(i+names[i]);
		i++;
	}
	for(int i1=0;i1<names.length;i1++){
		System.out.println(i1+names[i1]);
	}
}
}
