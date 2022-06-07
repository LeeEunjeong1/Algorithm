
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