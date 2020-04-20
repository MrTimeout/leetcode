
struct Message {
	id: u32,
	from: Person,
	to: Person,
	content: String,
}

impl Message {
	fn new(id: u32, from: Person, to: Person, content: String) -> Message {
		Message { id: id, from: from, to: to, content: content }
	}
}

struct Person {
	id: u32,
	name: String,
}

impl Person {
	fn new(id: u32, name: String) -> Person {
		Person { id: id, name: name }
	}
}

fn get_users() -> Vec<Person> {
	let mut users: Vec<Person> = vec![];
	let names: Vec<String> = vec![
		String::from("aaa"),
		String::from("bbb")
	];
	let mut cont: u32 = 0;
	for i in &names {
		cont += 1;
		users.push(Person::new(cont, i.to_string()));
	}
	users
}

struct MessageFactory {
	id: u32,
}

impl MessageFactory {
	fn increment_and_get(&mut self) -> u32 {
		self.id += 1;
		self.id
	}
	fn send(&mut self, content: String, from: &Person, to: &Person) -> bool {
		println!("Sending a message from {} to {}", from.name, to.name);
		println!("id: {}, Content: {}", self.increment_and_get(), content);
		true
	}
	fn new() -> MessageFactory {
		MessageFactory{ id: 0 }
	}
}

fn main() {
	let users: Vec<Person> = get_users();
	for i in &users {
		println!("Name: {}, Id: {}", i.id, i.name);
	}
	let mut message_factory: MessageFactory = MessageFactory::new();
	message_factory.send("Let's play".to_string(), &users[0], &users[1]);
}
