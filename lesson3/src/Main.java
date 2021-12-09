public class Main {
    public static void main(String[] args) {
        Box appleBox;
        appleBox = Box.getBox(Apple.class);
        Box fruitBox;
        fruitBox = Box.getBox(Fruit.class);//не пойму в чем тут ошибка?

    }
}