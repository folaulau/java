
public class Main {

    public static void main(String[] args) {
        User programmer = new Progammer();
        programmer.eat();
        programmer.run();
        programmer.setId(1);

        User nflPlayer = new NflPlayer();
        nflPlayer.eat();
        nflPlayer.run();
        nflPlayer.setId(2);
    }

}

class Progammer extends User {

    @Override
    public void run() {
        System.out.println("walk...");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("eat healthy...");
    }

    @Override
    protected int getId() {
        // TODO Auto-generated method stub
        return super.getId();

    }

    @Override
    protected void setId(int id) {
        // TODO Auto-generated method stub
        super.setId(id);

    }

}

class NflPlayer extends User {

    @Override
    public void run() {
        System.out.println("run faster and faster...");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("eat a lot for muscle...");
    }

    @Override
    protected int getId() {
        // TODO Auto-generated method stub
        return super.getId();

    }

    @Override
    protected void setId(int id) {
        // TODO Auto-generated method stub
        super.setId(id);

    }

}

abstract class User {

    protected int id;

    // Abstract method (does not have a body)
    public abstract void run();

    // Regular method
    public void eat() {
        System.out.println("eat");
    }

    protected int getId() {
        return this.id;
    }

    protected void setId(int id) {
        this.id = id;
    }

}
