package solution1_1;

 class Person {
    int age=18;
    String name;

    public void displayDetails(){
        System.out.println("Person age is"+" "+this.age);
        System.out.println("Person name is"+" "+name);
    }
    public Person(int age,String name){
        this.age=age;
        this.name=name;

    }
     public static void main(String[] args) {
         Person person=new Person(18,"Ramesh");
         person.displayDetails();


     }

}
