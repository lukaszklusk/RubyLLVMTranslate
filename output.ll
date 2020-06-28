declare i32 @printi(i32)
declare i32 @printd(double)
declare i32 @prints(i8*)

define i32 @fun(i32 %v2, i32 %v1) {
	%t0 = add  i32 v1, v2
	store i32 %t0, i32* %v1
ret i32 %v1
}

define i32 @main() {
	%var1 = alloca i32
	store i32 2, i32* %var1
	%t1 = call i32 @fun( i32 3, i32 var1)
	store i32 %t1, i32* %var1
ret i32 0
}
