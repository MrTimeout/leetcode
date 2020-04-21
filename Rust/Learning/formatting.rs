
use std::fmt;

//Using this directive(?) we can print the content of the struct
//using the format {:?} because it is a debug one.
#[derive(Debug)]
struct A {
	a: i32,
	b: String,
}

//We need to implement fmt::Display to print to console the struct
//using a format of {}.
impl fmt::Display for A {
	fn fmt(&self, fmt: &mut fmt::Formatter) -> fmt::Result {
		write!(fmt, "{{ {}, {} }}", self.a, self.b)
	}
}

impl A {
	fn new(a: i32, b: &String) -> A {
		A { a: a, b: b.to_string() }
	}
}

fn main() {
	let a: A = A::new(0, &String::from("this is rust"));
	println!("The new struct is: {:?}", a);
	println!("The new struct is: {}", a);
}
