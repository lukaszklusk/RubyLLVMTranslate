declare i32 @printi(i32)
declare i32 @printd(double)
declare i32 @prints(i8*)

define i32 @fun(i32 %v2, i32 %v1) {
	%r0 = add  i32 v1, v2
	store i32 %r0, i32* %v1
ret i32 %v1
}
@r4 = internal constant [4 x i8] c"asd\00"

define i32 @main() {
	%var1 = alloca i32
	store i32 2, i32* %var1
	%r1 = icmp  i32 var1, 3
	%r2 = cmp  Bad_Type fun, %r1
	%r3 = call i32 @fun( i32 3, i32 var1)
	%r5 = getelementptr [4 x i8]* @r4, i32 0,i32 0
	call i32 @prints( i8* r5 )
ret i32 0
}
