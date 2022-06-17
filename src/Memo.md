
### 약수구하기
``` java
int num = 약수구할 수

for(int i = 0 ; i<=num; i++){
    if(num % i == 0){
        System.out.println(i); // i가 약수
    }
}
```

###
### String to Integer
``` java
String s = "Hello";

Integer.parseInt(s);
```

###
### Stack
- 마지막에 넣은 것이 가장 먼저 나온다 
- push : 맨 위에 값 넣기
- pop : 맨 위 값 꺼내기
- peek : 맨 위 값 확인하기

###
### 정렬 
- Arrays.sort() : 일반적인 배열 정렬
- Collections.sort() : 리스트의 정렬시 사용
- Comparable 인터페이스 
    - 객체간의 기본 정렬기준이 필요할때 사용
    - compareTo(Type o) 메서드 구현을 통해 사용
    - "자기 자신"과 하나의 매개변수를 비교
- Comparator 인터페이스
    - 객체간의 특정한 정렬기준이 필요할때 사용
    - compare(Type o1, Type o2) 매서드 구현을 통해 사용
    - 두개의 매개변수를 비교
    ```java
      //두 수를 합친 수 중 큰 값을 앞으로 정렬 (내림차순)
        Arrays.sort(sNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2){
                return (o2+o1).compareTo(o1+o2);
                //오름차순 정렬 (o1+o2).compareTo(o1+o2);
            }
            
        });
    ```

    ###
    ### Arrays.asList() ->  일반 배열을 ArrayList로 변환