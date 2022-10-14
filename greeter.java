class Greeter {
    String name;
    Greeter(String name){
        this.name = name;
    }

    public String greet(){
        return "Hello " + name + ", what a bad day.";
    }
}
