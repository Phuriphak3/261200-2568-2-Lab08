public class Snowman implements Runnable {
    double x, y;

    public Snowman(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        Turtle bob = new Turtle(this.x, this.y);
        bob.speed(100);

        bob.up();
        bob.dot("lightblue", 500);

        // วาดตัว
        bob.setDirection(90);
        bob.backward(50);

        // ลำตัว
        bob.dot("white", 160);
        bob.forward(110);

        // หัว
        bob.dot("white", 110);
        bob.backward(55);

        // ผ้าพันคอ
        bob.penColor("dodgerblue");
        bob.width(20);
        bob.down();
        bob.left(90); bob.forward(35);
        bob.backward(70);
        bob.forward(35);
        bob.right(90);

        bob.up();
        bob.right(90); bob.forward(20); bob.left(90);
        bob.down();
        bob.width(18);
        bob.backward(60);

        // ลายผ้าพันคอ
        bob.penColor("white");
        bob.width(18);
        bob.up(); bob.forward(10); bob.down(); bob.forward(5);
        bob.up(); bob.forward(10); bob.down(); bob.forward(5);
        bob.up();

        double headLevel = this.y + 110;
        bob.up();
        bob.setPosition(this.x, headLevel);
        bob.setDirection(90);

        // ฐานหมวก
        bob.penColor("gray");
        bob.width(25);
        bob.left(90); bob.up(); bob.forward(48); bob.down();
        bob.backward(96);
        bob.forward(48);
        bob.right(90);

        // ตัวหมวก
        bob.penColor("red");
        bob.width(50);
        bob.up(); bob.forward(10); bob.down();
        bob.forward(25);
        bob.right(20);
        bob.width(40);
        bob.forward(30);
        bob.right(25);
        bob.width(25);
        bob.forward(25);
        bob.up();
        bob.forward(12);
        bob.dot("white", 28);

        // หน้าตา
        bob.setPosition(this.x, this.y + 70);
        bob.setDirection(90);

        // ตา
        bob.up();
        bob.left(90); bob.forward(18); bob.dot("black", 12);
        bob.backward(36); bob.dot("black", 12);
        bob.forward(18); bob.right(90);

        // จมูก
        bob.backward(12);
        bob.penColor("orange"); bob.width(6);
        bob.right(85);
        bob.down(); bob.forward(24); bob.up();

        // ปาก
        bob.setPosition(this.x, this.y + 42);
        bob.setDirection(180);
        bob.forward(20);
        bob.left(120);
        bob.penColor("black");
        for(int i=0; i<9; i++) {
            bob.dot("black", 4);
            bob.forward(6);
            bob.left(15);
        }
        bob.up();

        // แขน
        bob.setPosition(this.x, this.y - 10);
        bob.setDirection(90);
        bob.penColor("saddlebrown"); bob.width(4);

        // แขนซ้าย
        bob.left(90); bob.up(); bob.forward(40); bob.down();
        bob.left(15); bob.forward(50); bob.backward(15);
        bob.left(30); bob.forward(15); bob.backward(15);
        bob.right(30); bob.backward(35); bob.up();

        // แขนขวา
        bob.setPosition(this.x, this.y - 10);
        bob.setDirection(90);
        bob.right(90); bob.up(); bob.forward(40); bob.down();
        bob.right(15); bob.forward(50); bob.backward(15);
        bob.right(30); bob.forward(15); bob.backward(15);
        bob.left(30); bob.backward(35); bob.up();

        // กระดุม
        bob.setPosition(this.x, this.y - 30);
        bob.setDirection(270); // หันลง
        bob.dot("orange", 12);
        bob.forward(28); bob.dot("orange", 12);
        bob.forward(28); bob.dot("orange", 12);

        bob.hide();
    }
}
