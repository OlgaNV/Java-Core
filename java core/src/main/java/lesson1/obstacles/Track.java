package lesson1.obstacles;

public class Track {
    public class obstacles extends Let implements lesson1.obstacles.obstacles {
        private int length;

        public void Track(int length) {
            this.length = length;
        }
        @Override
        public boolean doIt(Player animal) {
            return animal.run(length);
        }
        public int getLength(){
            return length;
        }
    }
}
