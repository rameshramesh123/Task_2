package solution1_1;

 class Task1 {
    int age=18;
    String name;

    public void displayDetails(){
        System.out.println("Person age is"+" "+this.age);
        System.out.println("Person name is"+" "+name);
    }
    public Task1(int age,String name){
        this.age=age;
        this.name=name;

    }
     public static void main(String[] args) {
         Task1 person=new Task1(18,"Ramesh");
         person.displayDetails();


     }

}
