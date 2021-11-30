package lesson1.Player;

public class Player {

    public class Player2 extends Player implements  {
        private final int RUN_LIMIT = 100;

        public Player2(String name) {
            this.name = name;
            this.run_limit = RUN_LIMIT;

        }
        public Player2(String name, int run_limit, float jump_limit) {
            this.name = name;
            this.run_limit = run_limit;

        }

        @Override
        public String voice() {
            return "Borya";
        }


    }
}
