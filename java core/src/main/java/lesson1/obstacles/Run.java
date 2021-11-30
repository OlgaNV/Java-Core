package lesson1.obstacles;

import lesson1.Player.Participant;

public class Run {
    public static class Player extends Obstacles implements lesson1.obstacles.Player {

        private int length;

        public static void swim(int length) {
        }

        public void Run(int length) {
            this.length = length;
        }

        @Override
        public <Participant> void doIt(Participant animal) {
            Player.Swim(length);
        }

        private static void Swim(int length) {
        }

        @Override
        public boolean run(int length) {
            return false;
        }
    }
}