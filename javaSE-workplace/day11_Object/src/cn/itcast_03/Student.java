package cn.itcast_03;

public class Student {

	private String name;
	private int age;
	
	
	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}

	

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

//	@Override
//	//��дequals
//	public boolean equals(Object obj) {
//		//return true;
//		//���ݱȽϵĳ�Ա��������
//		//name��String���ͣ�String���������ͣ�������==�Ƚϣ���equals
//		//String��equals��������д��Object��ģ��Ƚϵ����ַ��������Ƿ����
//		Student s=(Student)obj;
//		if(this.name.equals(s.name)&&this.age==s.age){
//			return true;
//		}else{
//			return false;
//		}
	
//	@Override
//	//��дequals
//	public boolean equals(Object obj) {
//		if(this==obj){
//			return true;
//		}
//		//�ж��ǲ���ѧ���Ķ���
//		//�ж϶����Ƿ���ĳ����Ķ��󣺶�����instanceof ����
//		
//		if(!(obj instanceof Student)){
//			return false;
//		}
//		Student s=(Student)obj;
//		return this.name.equals(s.name)&&this.age==s.age;
//		
//	}
	
	
	
}
