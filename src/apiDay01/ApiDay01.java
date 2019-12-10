package apiDay01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.test.oopDay03.Cat;

public class ApiDay01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Api: application programming interface
//Ӧ�ó����̽ӿ�

//���� �� ���Դ洢��ͬ�������͵�����
//		Collection �ӿ�
		Collection col = new ArrayList(); // �ӿڻص�
		col.add(new Integer(12));
		col.add("Hello");
		col.add("Hello");
		col.add(11);
		col.add(new Cat());
		col.add(new int[] { 1, 2, 3, 4 });
		System.out.println(col);

		Collection<String> col02 = new ArrayList<String>();
		col02.add("eee");
		col02.add("ccc");
		col02.add("ccc");
//		col02.add(21);
//		���У�<String> �������ͣ� ָ������洢�Ķ������͡�
//		һ��ָ�����ͣ�����ֻ�ܴ洢���Ͷ�Ӧ�Ķ���

//		col.add    ���һ��Ԫ��
//		col.addAll(c)     ���һ������
		System.out.println(col.addAll(col02));
//		System.out.println(col02.addAll(col));
//		System.out.println(col02);
//		col02.add(23);

//		col.contains(o)  �ж�һ��Ԫ���Ƿ��ڼ�����
		System.out.println(col.contains("eee"));
//		col.containsAll(c) �ж���һ������������Ԫ�� �Ƿ��ڸü�����
		System.out.println(col.containsAll(col02));
//		col.isEmpty()  �ж��Ƿ�Ϊ��
//		col.remove(o)  ɾ��һ��Ԫ��
//		col.removeAll(c)   ɾ����һ���������ڱ������еĽ���
		System.out.println(col.removeAll(col));
//		col.size() !!!!!!
		System.out.println(col.size());
		col.clear();
		System.out.println(col.size());

//		List�ӿ� ���̳���Collection�ӿ� ��չ�˸��ӿڵķ��� �ṩ�� ��ָ��Ԫ��λ�õĲ���
//		�洢������   ����   �����ظ�
//		ʵ���� �� ArrayList (��̬����)
//		        LinkedList(��̬����)

		List<String> list01 = new ArrayList<String>();
//		���Ԫ��
		list01.add(0, "����");
		list01.add(1, "��һ");
		list01.add(2, "�Ŷ�");
		list01.add(3, "����");
		list01.add(2, "�Ŷ���");
		list01.add(5, "��һ");
		System.out.println(list01);

//		indexof ��Ԫ�ض�Ӧ���±�  ����Ҳ��� ����ֵΪ-1
		System.out.println(list01.indexOf("����"));
		int index = list01.indexOf("��һ");
		if (index != -1) {
			list01.add(index + 1, "��һһ");
		}
		System.out.println(list01);

		list01.remove(6);
		System.out.println(list01);

//		���ϵı���
//		1.�±�ѭ��
		for (int i = 0; i <= list01.size() - 1; i++) {
			System.out.print(list01.get(i)); // .get(index) ��ȡ��ǰ�±��Ӧ��Ԫ��
		}
		System.out.println();
//		2.for-each���� //�������ûָ������ foreachʹ��Object
		for (String s : list01) {
			System.out.print(s);
		}
//		3.������ Iterator
//		Iterator ite=list01.iterator();
//		while(ite.hasNext()) {
//			Object o=ite.next();
//			System.out.println(o);
//		}
		Iterator<String> ite = list01.iterator(); // ��������������
		while (ite.hasNext()) { // �ж�ָ���¸�λ���Ƿ���ֵ
			String s = ite.next(); // ָ����λ ��ȡ��ǰָ���µ�Ԫ��
			System.out.println(s);
		}

//		Set�ӿ�  ��֧���±�
		Set set01 = new HashSet(); // �������� ȥ��
		set01.add(15);
		set01.add(20);
		set01.add(10);
		set01.add(20);
		set01.add(20);
		set01.add(20);
		System.out.println(set01);

		Set<String> set02 = new TreeSet<String>(); // ����(����ֵ��Ԫ�� ����Ȼ��������) ȥ��
		set02.add("20");
		set02.add("3");
		set02.add("5");
		set02.add("15");
		set02.add("17");
		set02.add("abc");
		System.out.println(set02);

//		case:
//			����һ����װ�� Member ��Ա����Ϊ
//			Ա������ String name (��һ~����)
//			Ա������ Integer age (21~25)
//			����һ��List�ӿ� ArrayListΪʵ����ļ��� ����ΪMember
//			����5��Member������뼯����
//			1.ʹ��index����  �ı���������Ϊ28
//			2.ʹ��foreach���� ɾ������Ϊ25���� !!!(��foreach�����У����ܸ���foreach��������������)
//			3.ʹ�õ��������� �������Member����Ϣ

//			Member mem=new Member();
//			mem.setName("����");
//			mem.setAge(23);

		List<Member> listMem = new ArrayList<Member>();
		listMem.add(new Member("��һ", 21));
		listMem.add(new Member("�Ŷ�", 22));
		listMem.add(new Member("����", 23));
		listMem.add(new Member("����", 24));
		listMem.add(new Member("����", 25));
		for (int i = 0; i < listMem.size(); i++) {
			if (listMem.get(i).getName() == "����") {
				listMem.get(i).setAge(28);
			}
		}

		int targetIndex = 0;
		for (Member m : listMem) {
			if (m.getAge() == 25) {
//				listMem.remove(m);
				targetIndex = listMem.indexOf(m);
			}
		}
		listMem.remove(targetIndex);

		Iterator<Member> iterator = listMem.iterator();
		while (iterator.hasNext()) {
			Member m = iterator.next();
			System.out.println(m.toString());
		}

//		case:
//		1.	�������һ��˫ɫ�������� ����� ������Set���ϣ�
//			���� 02   09   15  16   29   33    ��0   ����   ȥ��
//		2.�������� arr{12��3��4��65��6��8��6��8��3}
//		   ����Set���� �ҵ������� �ظ���Ԫ�� �����
//		3.������ Person 
//		  ��Ա���� String name 
//		        Integer age
//		        String entryTime(��ְʱ��)
//		  �������� ���Ա��
//		��һ    21      20190502001
//		����    22      20190502002
//		����    23      20181207001
//		����    24      20181129001
//		����    25      20190502003
//		����    26      20180105001
//		������ 27      20191001001
//		1.�ҵ���ְʱ�������Ա���������Ա����Ϣ
//		2.�ҵ�19��5��2����ְ��Ա���������Ա����Ϣ
//		3.ɾ�������к�"��"��Ա����ʹ�õ�������
//		ע�⣺��ʹ�õ�����ɾ��������ʹ�ü�����.remove(...)   ��Ҫʹ�õ�������.remove()
	}

}
