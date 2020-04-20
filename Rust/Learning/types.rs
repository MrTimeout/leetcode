fn main() {
	//We have a lot of types:
	let _signed: i8;
	let _signed: i16;
	let _signed: i32;
	let _signed: i64;
	let _signed: i128;
	
	let _unsigned: u8;
	let _unsigned: u16;
	let _unsigned: u32;
	let _unsigned: u64;
	let _unsigned: u128;

	let _float: f64;
	let _float: f32;

	let _bool: bool;

	let _character = 'c';

	//This is a tuple
	let _tup: (i8, i16, i32, i64) = (1, 2, 3, 4);
	let tup = (1, 2, 3);
	let (_x, _y, _z) = tup;
	let _x = tup.0;
	let _y = tup.1;
	let _z = tup.2;

	//The size of this primitive is how many bytes it takes to
	//reference any location in memory. For example, on a 
	//32 bit target, this is 4 bytes and on a 64 bit target, this
	//is 8 bytes.
	//std::isize is signed.

	//pub const fn min_value() -> isize
	println!("The min value is: {}", isize::min_value());
	//pub const fn max_value() -> isize
	println!("The max value is: {}", isize::max_value());

	//std::usize is unsigned.

	//pub const fn min_value() -> usize
	println!("The min value is: {}", usize::min_value());

	//pub cosnt fn max_value() -> usize
	println!("The max value is: {}", usize::max_value());

	let binary: i32 = 0b1111;
	let octal: i32 = 0o17;
	let decimal: i32 = 15;
	let hex: i32 = 0xf;

	println!("This is the binary value: {:#b}", binary);
	println!("This is the octal value: {:#o}", octal);
	println!("This is the decimal value: {:}", decimal);
	println!("This is the hexadecimal value: {:#x}", hex);

}
