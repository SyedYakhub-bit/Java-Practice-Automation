package Practice;

public class Pen {
    String color;
    String type;

    public void printColor() {
        System.out.println(this.color);
        System.out.println(this.type);
    }

    public void write() {
        System.out.println("Write something");
    }



        public static void main(String[] args) {
            Pen pen1 = new Pen();
            Pen pen2=new Pen();
            pen1.color = "Black";
            pen1.type = "Ball point";
            pen2.color="Pink";
            pen2.type="Gel";
            pen1.write();
            pen1.printColor();
            pen2.printColor();

        }
    }
