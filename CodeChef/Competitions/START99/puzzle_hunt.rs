use std::io;

fn main() {
    let mut input: String = String::new();

    io::stdin().read_line(&mut input).unwrap();
    input = input.parse().expect("Expecting integer");

    let x: i32 = input.trim().parse().expect("Expecting integer");

    if x.le(&8) && x.ge(&6) {
        print!("Yes");
    } else {
        print!("No");
    }
}
