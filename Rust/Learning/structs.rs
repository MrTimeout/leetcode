
struct Message {
  from: Person,
  to: Person,
  content: String,
}

struct Person {
  id: u32,
  name: String,
}

fn get_users() -> Vec<Person> {
  let mut users: Vec<Person> = vec![];
  let names: Vec<String> = vec![
    String::from("Noemi"),
    String::from("Ivan")
  ];
  let mut cont: u32 = 0;
  for i in &names {
    cont += 1;
    users.push(Person {
      id: cont,
      name: i.to_string(),
    });
  }
  users
}

fn send_message() -> bool {

}

fn main() {
  let users: Vec<Person> = get_users();
  for i in &users {
  	println!("Name: {}, Id: {}", i.id, i.name);
  }
}}
