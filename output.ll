declare i32 @printi(i32)
declare i32 @printd(double)
declare i32 @prints(i8*)

define i32 @main() {
	%var1 = alloca i32
	store i32 2, i32* %var1
	%r0 = add  i32 var1, 1
	store i32 %r0, i32* %var1
ret i32 0
}
