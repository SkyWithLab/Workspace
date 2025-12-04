package com.kh.collection.map.run;

import java.util.HashMap;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.kh.collection.map.model.vo.Snack;

public class Run {

	public static void main(String[] args) {
		HashMap<String, Snack> hm = new HashMap<>(); // import = ctrl shift o
		
//		Listm Set 계열의 클래스들은 Collection을 구현한 클래스 
//		-> 데이터를 추가할 때 공통적으로 add 메소드 사용
		
//		Map 계열은 Collection을 구현한 클래스가 아님
//		-> 데이터를 추가할 때 put 메소드를 사용. 키-벨류 세트로 저장해야함
		
//		put이라는 메소드에 (K,V):Map에 키-벨류 세트로 추가해주는 메소드이다.
		hm.put("새우깡",new Snack("고소", 500));
		hm.put("프링글스",new Snack("짠맛",2000));
		hm.put("먹태깡",new Snack("먹태맛",600));
		
		hm.put("고소미",new Snack("고소",500));
		
		System.out.println(hm);
//		저장순서 유지X, value 값이 중복돼도, key 값이 중복되지 않으면 잘 저장됨
		
		hm.put("새우깡",new Snack("매운맛",777));
		
		System.out.println(hm);
//		-> 동일한 key 값으로 데이터를 추가하는 경우, value값이 덮어씌워짐.
//		2. get(Object ke): V -> Map 에서 해당 key 값을 가지는 value값을 반환
		
		Snack s = hm.get("먹태깡");
		System.out.println(s/*toString()*/);
		
//		3. size() -> Map에 저장된 데이터 개수 반환
		System.out.println("저장된 데이터 수:" + hm.size());
		
//		4. replace(K key, V value)
//		 ->Map 에서 해당 key 값을 찾아서 전달한 value 값으로 수정
//		C(추가) R(조회) U업데이트(수정) D딜리트(삭제)
		hm.replace("프링글스", new Snack("갈릭맛", 800));
		System.out.println(hm.get("프링글스"));
		
//		5.remove(Object key) 
//		 -> Map에서 해당 key 값을 찾아서 key - value 세트를 삭제
		hm.remove("새우깡");
		System.out.println(hm);
		
//		Map에 저장된 모든 데이터를 출력하고자 할 때 
//		for each문(향상된for문)
//		for(: hm { / 선언할 변수를 특정할 수 없음}
		
		
//		ArrayList 변환 -> x
//		ArrayList list = new ArrayList(hm);
//		-> Map은 collection
//		Iterator it = hm.iterator();
		
//		Map -Set으로 바꿀거 Iterator
		Set<String> kSet = hm.keySet();
		
		Iterator(String> itKey = kSet.iterator();
		
//		3)반복문 사용하여 데이터 접근
		while( itkey.hasNext() ) {
			String key = itKey.next();
			
			Snack value = hm.get(key);			
			System.out.println(key + ":" + value);
		}
// 2.entrySet() -> 키-벨류 데이터를 Entry로 감싼 Set 반환
//		 1) hm.entrySet():Set
		Set<Entry> entrySet = hm.entrySet();
//		2) 
		Iterator< Entry<String, Snack> > itEntry = entrySet.iterator();
		
//		3)반복문
		while(itEntry.hasNext() ) {
			Entry entry = itEntry.next();
			
			S
		}
	}

}
